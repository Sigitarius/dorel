package pl.sigitarius.dorel;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import pl.sigitarius.dorel.model.dao.AboutTheProductsDao;
import pl.sigitarius.dorel.model.dao.AttributeDao;
import pl.sigitarius.dorel.model.dao.EanPurePlayerDao;
import pl.sigitarius.dorel.model.dao.EanSpecializedStoreDao;
import pl.sigitarius.dorel.model.dao.FeatureImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.FeaturesOverviewDao;
import pl.sigitarius.dorel.model.dao.MainCollectionImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.MainProductImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.PimDao;
import pl.sigitarius.dorel.model.dao.SellingPointsDao;
import pl.sigitarius.dorel.model.db.Ean;
import pl.sigitarius.dorel.model.db.FeatureImageWebsite;
import pl.sigitarius.dorel.model.db.MainCollectionImageWebsite;
import pl.sigitarius.dorel.model.db.MainProductImageWebsite;
import pl.sigitarius.dorel.model.listaplac.ELEMENT;
import pl.sigitarius.dorel.model.listaplac.ELEMENTY;
import pl.sigitarius.dorel.model.listaplac.LISTAPLAC;
import pl.sigitarius.dorel.model.listaplac.LISTYPLAC;
import pl.sigitarius.dorel.model.listaplac.ObjectFactory;
import pl.sigitarius.dorel.model.listaplac.PLATNOSC;
import pl.sigitarius.dorel.model.listaplac.PLATNOSCI;
import pl.sigitarius.dorel.model.listaplac.ROOT;
import pl.sigitarius.dorel.model.listaplac.WYPLATA;
import pl.sigitarius.dorel.model.listaplac.WYPLATY;
import pl.sigitarius.dorel.model.pim.Data;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.utils.Alert;
import pl.sigitarius.dorel.utils.Configuration;
import pl.sigitarius.dorel.utils.MsSqlConnection;
import pl.sigitarius.dorel.utils.RetentionDirectoryChooser;
import pl.sigitarius.dorel.utils.RetentionFileChooser;
import pl.sigitarius.dorel.xml.ListaplacJAXBUtils;
import pl.sigitarius.dorel.xml.PimJAXBUtils;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class MainController implements Initializable {

    public static final String PROTOCOL = "http";
    public static final String DORELDIGITAL_BASE_URL = "mam-prod.doreldigital.io";
    private Stage splash;
    private Configuration conf;
    private MsSqlConnection defaultConnection;
    private EanPurePlayerDao eanPurePlayerDao;
    private EanSpecializedStoreDao eanSpecializedStoreDao;
    private PimDao pimDao;
    private AboutTheProductsDao aboutTheProductsDao;
    private FeaturesOverviewDao featuresOverviewDao;
    private FeatureImageWebsiteDao featureImageWebsiteDao;
    private MainCollectionImageWebsiteDao mainCollectionImageWebsiteDao;
    private MainProductImageWebsiteDao mainProductImageWebsiteDao;
    private AttributeDao attributeDao;
    private SellingPointsDao sellingPointsDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        conf = new Configuration();
        defaultConnection = new MsSqlConnection("default", conf.get("default.host"),
                Integer.parseInt(conf.get("default.port")), conf.get("default.database"), conf.get("default.username"),
                conf.get("default.password"));


        eanPurePlayerDao = new EanPurePlayerDao(defaultConnection);
        eanSpecializedStoreDao = new EanSpecializedStoreDao(defaultConnection);
        pimDao = new PimDao(defaultConnection);
        aboutTheProductsDao = new AboutTheProductsDao(defaultConnection);
        featuresOverviewDao = new FeaturesOverviewDao(defaultConnection);
        featureImageWebsiteDao = new FeatureImageWebsiteDao(defaultConnection);
        mainCollectionImageWebsiteDao = new MainCollectionImageWebsiteDao(defaultConnection);
        mainProductImageWebsiteDao = new MainProductImageWebsiteDao(defaultConnection);
        attributeDao = new AttributeDao(defaultConnection);
        sellingPointsDao = new SellingPointsDao(defaultConnection);
    }

    @FXML
    void load(ActionEvent event) {
        log.info("Action: Load objects from XML to database");
        Window window = ((MenuItem) event.getTarget()).getParentPopup().getScene().getWindow();
        File xmlFile = RetentionFileChooser.showOpenDialog(window, "Select XML file", RetentionFileChooser.FilterMode.XML_FILES);

        ProgressBar progress = (ProgressBar) splash.getScene().lookup("#progress");
        Tooltip progressTt = progress.getTooltip();
        progress.setVisible(true);

        if (xmlFile != null) {
            Task<Void> task = new Task<Void>() {

                @Override
                protected Void call() {
                    try {
                        log.info("Getting EANs from DB");
                        Set<Ean> eanPP = eanPurePlayerDao.getEans();
                        Set<Ean> eanSS = eanSpecializedStoreDao.getEans();

                        log.info("Merging EANs");
                        HashSet<Ean> eans = new HashSet<>();
                        eans.addAll(eanPP);
                        eans.addAll(eanSS);

                        log.info("Getting objects from XML file");
                        Data data = PimJAXBUtils.getDataFromFile(xmlFile);

                        Set<String> eansStrings = eans.stream().map(Ean::getEan).collect(Collectors.toSet());

                        Supplier<Stream<Item>> itemsSup = () -> data.getItem().stream()
                                .filter(i -> eansStrings.contains(i.getEAN13BarcodeText()));

                        AtomicInteger index = new AtomicInteger(0);
                        long size = itemsSup.get().count();
                        updateProgress(0, size);
                        itemsSup.get().forEach(i -> {
                            long articleNumber = i.getArticleNumber();
                            log.info("Processing the article: " + articleNumber);
                            updateProgress(index.incrementAndGet(), size);
                            updateMessage("Przetwarzam " + index.get() + " rekord " + articleNumber);
                            pimDao.deletePimByArticleNumber(articleNumber);
                            aboutTheProductsDao.deleteByArticleNumber(articleNumber);
                            featuresOverviewDao.deleteByArticleNumber(articleNumber);
                            featureImageWebsiteDao.deleteByArticleNumber(articleNumber);
                            mainCollectionImageWebsiteDao.deleteByArticleNumber(articleNumber);
                            mainProductImageWebsiteDao.deleteByArticleNumber(articleNumber);
                            attributeDao.deleteByArticleNumber(articleNumber);
                            sellingPointsDao.deleteByArticleNumber(articleNumber);
                            pimDao.insertPim(i);
                            aboutTheProductsDao.insertAboutTheProducts(i);
                            featuresOverviewDao.insertFeatureOverview(i);
                            featureImageWebsiteDao.insertWebsiteImages(i);
                            if (!i.getMainCollectionImageWebsite().isEmpty()){
                                mainCollectionImageWebsiteDao.insertMainCollectionImageWebsite(i);
                            }
                            if(!i.getMainProductImageWebsite().isEmpty()){
                                mainProductImageWebsiteDao.insertMainProductImageWebsite(i);
                            }
                            attributeDao.insertAtribute(i);
                            sellingPointsDao.insertSellingPoints(i);
                        });


                    } catch (Exception e) {
                        log.error("Error occured", e);
                        throw new RuntimeException(e);
                    }
                    return null;
                }

                @Override
                protected void succeeded() {
                    splash.hide();
                    progress.setVisible(false);
                    new Alert(AlertType.INFORMATION, "Przetwarzanie obiektów PIM", "Zakończono",
                            "Poprawnie zakończono przepisywanie obiektów " + xmlFile.getName(), window);
                    log.info("Saving objects to database finished successfully");
                }

                @Override
                protected void failed() {
                    splash.hide();
                    progress.setVisible(false);
                    new Alert(AlertType.ERROR, "Przetwarzanie obiektów PIM", "Przerwano",
                            "Wystąpił błąd podczas przetwarzania pliku " + xmlFile.getName(), window);
                    log.warn("Saving objects to database finished with errors");
                }

            };
            splash.show();
            progress.progressProperty().bind(task.progressProperty());
            progressTt.textProperty().bind(task.messageProperty());
            new Thread(task).start();
        }
    }

    @FXML
    void downloadImages(ActionEvent event) {
        log.info("Action: Download images from " + DORELDIGITAL_BASE_URL + " and saving files to disc");
        Window window = ((MenuItem) event.getTarget()).getParentPopup().getScene().getWindow();
        File downloadDirectory = RetentionDirectoryChooser.showDialog(window, "Select directory");

        ProgressBar progress = (ProgressBar) splash.getScene().lookup("#progress");
        Tooltip progressTt = progress.getTooltip();
        progress.setVisible(true);

        if (downloadDirectory != null) {
            Task<Void> task = new Task<Void>() {

                @Override
                protected Void call() {
                    try {
                        log.info("Getting images paths from DB");
                        List<FeatureImageWebsite> featureImages = featureImageWebsiteDao.getAllImages();
                        List<MainCollectionImageWebsite> mainCollectionImages  = mainCollectionImageWebsiteDao.getAllImages();
                        List<MainProductImageWebsite> mainProductImages  = mainProductImageWebsiteDao.getAllImages();
                        AtomicInteger index = new AtomicInteger(0);
                        int size = featureImages.size();
                        updateProgress(0, size);
                        featureImages.forEach(i -> {
                            try {
                                long articleNumber = i.getArticle_number();
                                log.info("Downloading feature images for article " + articleNumber);
                                updateProgress(index.incrementAndGet(), size);
                                updateMessage("Przetwarzam " + index.get() + " rekord " + articleNumber);
                                String pathname = downloadDirectory + "\\" + articleNumber + "\\Feature";
                                File directory = new File(pathname);
                                if(!directory.exists()){
                                    directory.mkdirs();
                                }
                                Path p = Paths.get(i.getPath());
                                String fileName = p.getFileName().toString();

                                FileUtils.copyURLToFile(
                                        new URL(PROTOCOL, DORELDIGITAL_BASE_URL, "/" + i.getPath().replaceAll(" ", "%20")),
                                        new File(pathname + "\\" + fileName));
                            } catch (IOException e) {
                                log.error("Error occurred while saving file", e);
                            }
                        });

                        AtomicInteger indexC = new AtomicInteger(0);
                        int sizeC = mainCollectionImages.size();
                        updateProgress(0, size);
                        mainCollectionImages.forEach(i -> {
                            try {
                                long articleNumber = i.getArticle_number();
                                log.info("Downloading Main collection image for article " + articleNumber);
                                updateProgress(indexC.incrementAndGet(), sizeC);
                                updateMessage("Przetwarzam " + indexC.get() + " rekord " + articleNumber);
                                String pathname = downloadDirectory + "\\" + articleNumber + "\\Main collection";
                                File directory = new File(pathname);
                                if(!directory.exists()){
                                    directory.mkdirs();
                                }
                                Path p = Paths.get(i.getPath());
                                String fileName = p.getFileName().toString();

                                FileUtils.copyURLToFile(
                                        new URL(PROTOCOL, DORELDIGITAL_BASE_URL, "/" + i.getPath().replaceAll(" ", "%20")),
                                        new File(pathname + "\\" + fileName));
                            } catch (IOException e) {
                                log.error("Error occurred while saving file", e);
                            }
                        });


                        AtomicInteger indexP = new AtomicInteger(0);
                        int sizeP = mainProductImages.size();
                        updateProgress(0, size);
                        mainProductImages.forEach(i -> {
                            try {
                                long articleNumber = i.getArticle_number();
                                log.info("Downloading Main product image for article " + articleNumber);
                                updateProgress(indexP.incrementAndGet(), sizeP);
                                updateMessage("Przetwarzam " + indexP.get() + " rekord " + articleNumber);
                                String pathname = downloadDirectory + "\\" + articleNumber + "\\Main product";
                                File directory = new File(pathname);
                                if(!directory.exists()){
                                    directory.mkdirs();
                                }
                                Path p = Paths.get(i.getPath());
                                String fileName = p.getFileName().toString();

                                FileUtils.copyURLToFile(
                                        new URL(PROTOCOL, DORELDIGITAL_BASE_URL, "/" + i.getPath().replaceAll(" ", "%20")),
                                        new File(pathname + "\\" + fileName));
                            } catch (IOException e) {
                                log.error("Error occurred while saving file", e);
                            }
                        });

                    } catch (Exception e) {
                        log.error("Error occurred", e);
                        throw new RuntimeException(e);
                    }
                    return null;
                }

                @Override
                protected void succeeded() {
                    splash.hide();
                    progress.setVisible(false);
                    new Alert(AlertType.INFORMATION, "Zapisywanie obrazów na dysk", "Zakończono",
                            "Poprawnie zakończono zapisywanie na dysk do folderu " + downloadDirectory.getAbsolutePath(), window);
                    log.info("Downloading finished successfully");
                }

                @Override
                protected void failed() {
                    splash.hide();
                    progress.setVisible(false);
                    new Alert(AlertType.ERROR, "Zapisywanie obrazów na dysk", "Przerwano",
                            "Wystąpił błąd podczas zapisu plików do folderu " + downloadDirectory.getAbsolutePath(), window);
                    log.warn("Downloading finished with errors");
                }

            };
            splash.show();
            progress.progressProperty().bind(task.progressProperty());
            progressTt.textProperty().bind(task.messageProperty());
            new Thread(task).start();
        }
    }

    @FXML
    void loadRoot(ActionEvent event) {
        log.info("Load objects from XML ");
        Window window = (((Node) event.getSource()).getScene()).getWindow();
        File xmlFile = RetentionFileChooser.showOpenDialog(window, "Wskaż plik xml", RetentionFileChooser.FilterMode.XML_FILES);
        File file = RetentionFileChooser.showSaveDialog(window, "Wskaż gdzie zapisać plik", RetentionFileChooser.FilterMode.XML_FILES);
        if (xmlFile != null) {
            Task<Void> task = new Task<Void>() {

                String buttonLabel = ((Button) event.getSource()).getText();

                @Override
                protected Void call() {
                    try {
                        ROOT root = ListaplacJAXBUtils.getRootFromFile(xmlFile);

                        LISTYPLAC listyplacOrginal = root.getLISTYPLAC();
                        List<LISTAPLAC> listyPlacOrginal = listyplacOrginal.getLISTAPLAC();

                        ROOT rootNew = new ObjectFactory().createROOT();
                        LISTYPLAC listyPlac = new ObjectFactory().createLISTYPLAC();
                        listyPlac.setBAZADOCID(listyplacOrginal.getBAZADOCID());
                        listyPlac.setBAZAZRDID(listyplacOrginal.getBAZAZRDID());
                        listyPlac.setWERSJA(listyplacOrginal.getWERSJA());
                        listyPlac.getLISTAPLAC().add(null);

                        listyPlacOrginal.forEach(l -> {
                            AtomicReference<BigDecimal> wyplataWartosc = new AtomicReference<>(new BigDecimal(0));
                            AtomicReference<BigDecimal> wyplataBrutto = new AtomicReference<>(new BigDecimal(0));
                            AtomicReference<BigDecimal> wyplataPodstawa1 = new AtomicReference<>(new BigDecimal(0));
                            List<ELEMENT> elementList = new ArrayList<>();
                            List<PLATNOSC> platnoscList = new ArrayList<>();
                            l.getWYPLATY().getWYPLATA().forEach(w -> {
                                wyplataWartosc.updateAndGet(v -> v.add(w.getWYPLATAWARTOSC()));
                                wyplataBrutto.updateAndGet(v -> v.add(w.getWYPLATABRUTTO()));
                                wyplataPodstawa1.updateAndGet(v -> v.add(w.getWYPLATAPODSTAWAPODAT1()));
                                elementList.addAll(w.getELEMENTY().getELEMENT());
                                platnoscList.addAll(w.getPLATNOSCI().getPLATNOSC());
                            });
                            List<WYPLATA> wyplataList = l.getWYPLATY().getWYPLATA();
                            WYPLATA wyplata = wyplataList.get(0);
                            wyplata.setWYPLATAWARTOSC(wyplataWartosc.get());
                            wyplata.setWYPLATABRUTTO(wyplataBrutto.get());
                            wyplata.setWYPLATAPODSTAWAPODAT1(wyplataPodstawa1.get());
                            wyplata.setELEMENTY(new ELEMENTY());
                            wyplata.getELEMENTY().getELEMENT().addAll(elementList);
                            wyplata.setPLATNOSCI(new PLATNOSCI());
                            wyplata.getPLATNOSCI().getPLATNOSC().addAll(platnoscList);
                            l.setWYPLATY(new WYPLATY());
                            l.getWYPLATY().getWYPLATA().add(wyplata);
                        });
                        listyPlac.getLISTAPLAC().addAll(listyPlacOrginal);
                        rootNew.setLISTYPLAC(listyPlac);

                        ListaplacJAXBUtils.saveRootToFile(rootNew, file);

                    } catch (Exception e) {
                        log.error("Error occured", e);
                        throw new RuntimeException();
                    }
                    return null;
                }

                @Override
                protected void succeeded() {
                    splash.hide();
                    new Alert(AlertType.INFORMATION, "Przetwarzanie listy płac", "Zakończono",
                            "Poprawnie zakończono przepisywanie obiektów " + xmlFile.getName(), window);
                }

                @Override
                protected void failed() {
                    splash.hide();
                    new Alert(AlertType.ERROR, "Przetwarzanie listy płac", "Przerwano",
                            "Wystąpił błąd podczas przetwarzania pliku " + xmlFile.getName(), window);
                }

            };
            splash.show();
            new Thread(task).start();
        }
    }

    @FXML
    void defaultConnection(ActionEvent event) {
        log.info("Uruchomiłem funkcję definiowania domyślnego połączenia z bazą danych");
        FXMLLoader fxmlLoader = new FXMLLoader(DBConnection.class.getResource("DbConnection.fxml"));
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            log.error("Nie można załadować widoku", e);
            throw new RuntimeException();
        }
        DBConnection controller = fxmlLoader.getController();
        controller.initDefaultConn(defaultConnection);
        controller.setMainController(this);
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("Połaczenie do DB");
        stage.setScene(scene);
        stage.show();
        log.info("Wyświetlam okno połączenia z BD");
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
