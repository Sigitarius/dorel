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
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.dao.AboutTheProductsDao;
import pl.sigitarius.dorel.model.dao.EanPurePlayerDao;
import pl.sigitarius.dorel.model.dao.EanSpecializedStoreDao;
import pl.sigitarius.dorel.model.dao.FeaturesOverviewDao;
import pl.sigitarius.dorel.model.dao.PimDao;
import pl.sigitarius.dorel.model.dao.WebsiteImagesDao;
import pl.sigitarius.dorel.model.db.Ean;
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
import pl.sigitarius.dorel.utils.RetentionFileChooser;
import pl.sigitarius.dorel.xml.ListaplacJAXBUtils;
import pl.sigitarius.dorel.xml.PimJAXBUtils;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class MainController implements Initializable {

    private Stage splash;
    private Configuration conf;
    private MsSqlConnection defaultConnection;
    private EanPurePlayerDao eanPurePlayerDao;
    private EanSpecializedStoreDao eanSpecializedStoreDao;
    private PimDao pimDao;
    private AboutTheProductsDao aboutTheProductsDao;
    private FeaturesOverviewDao featuresOverviewDao;
    private WebsiteImagesDao websiteImagesDao;

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
        websiteImagesDao = new WebsiteImagesDao(defaultConnection);
    }

    @FXML
    void load(ActionEvent event) {
        log.info("Load objects from XML ");
        Window window = (((Node) event.getSource()).getScene()).getWindow();
        File xmlFile = RetentionFileChooser.showOpenDialog(window, "Select XML file", RetentionFileChooser.FilterMode.XML_FILES);
        if (xmlFile != null) {
            Task<Void> task = new Task<Void>() {

                final String buttonLabel = ((Button) event.getSource()).getText();
                @Override
                protected Void call() {
                    try{
                        Set<Ean> eanPP = eanPurePlayerDao.getEans();
                        Set<Ean> eanSS = eanSpecializedStoreDao.getEans();

                        HashSet<Ean> eans = new HashSet<>();
                        eans.addAll(eanPP);
                        eans.addAll(eanSS);

                        Data data = PimJAXBUtils.getDataFromFile(xmlFile);

                        Set<String> eansStrings = eans.stream().map(Ean::getEan).collect(Collectors.toSet());

                        Stream<Item> filtered = data.getItem().stream()
                                .filter(i -> eansStrings.contains(i.getEAN13BarcodeText()));

                        filtered.forEach(i -> {
                            long articleNumber = i.getArticleNumber();
                            pimDao.deletePimByArticleNumber(articleNumber);
                            aboutTheProductsDao.deleteByArticleNumber(articleNumber);
                            featuresOverviewDao.deleteByArticleNumber(articleNumber);
                            websiteImagesDao.deleteByArticleNumber(articleNumber);
                            pimDao.insertPim(i);
                            aboutTheProductsDao.insertAboutTheProducts(i);
                            featuresOverviewDao.insertFeatureOverview(i);
                            websiteImagesDao.insertWebsiteImages(i);
                        });


                    } catch (Exception e){
                        log.error("Error occured", e);
                        throw new RuntimeException(e);
                    }
                    return null;
                }
                @Override
                protected void succeeded() {
                    splash.hide();
                    new Alert(AlertType.INFORMATION, "Przetwarzanie obiektów PIM", "Zakończono",
                            "Poprawnie zakończono przepisywanie obiektów " + xmlFile.getName(), window);
                }
                @Override
                protected void failed() {
                    splash.hide();
                    new Alert(AlertType.ERROR, "Przetwarzanie obiektów PIM", "Przerwano",
                            "Wystąpił błąd podczas przetwarzania pliku " + xmlFile.getName(), window);
                }

            };
            splash.show();
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
                    try{
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

                    } catch (Exception e){
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
