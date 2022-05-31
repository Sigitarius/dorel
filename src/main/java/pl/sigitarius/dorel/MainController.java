package pl.sigitarius.dorel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
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
import pl.sigitarius.dorel.tasks.DownloadImagesFromXlsxTask;
import pl.sigitarius.dorel.tasks.DownloadImagesTask;
import pl.sigitarius.dorel.tasks.LoadEansTask;
import pl.sigitarius.dorel.tasks.LoadObjectsTask;
import pl.sigitarius.dorel.tasks.LoadPayroll;
import pl.sigitarius.dorel.utils.Configuration;
import pl.sigitarius.dorel.utils.MsSqlConnection;
import pl.sigitarius.dorel.utils.RetentionDirectoryChooser;
import pl.sigitarius.dorel.utils.RetentionFileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

@Slf4j
@Data
public class MainController implements Initializable {


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

    @FXML
    private AnchorPane centerPane;

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
            LoadObjectsTask task = new LoadObjectsTask(xmlFile, progress, splash, window, defaultConnection);
            splash.show();
            progress.progressProperty().bind(task.progressProperty());
            progressTt.textProperty().bind(task.messageProperty());
            new Thread(task).start();
        }
    }

    @FXML
    void importEanPP(ActionEvent event) {
        importEans(event, LoadEansTask.Type.EAN_PUREPLAYER);
    }

    @FXML
    void importEanSS(ActionEvent event) {
        importEans(event, LoadEansTask.Type.EAN_SPECIALIZEDSTORE);
    }

    private void importEans(ActionEvent event, LoadEansTask.Type eanType) {
        log.info("Action: Load objects from XLSX to database");
        Window window = ((MenuItem) event.getTarget()).getParentPopup().getScene().getWindow();
        File xmlFile = RetentionFileChooser.showOpenDialog(window, "Select XML file", RetentionFileChooser.FilterMode.XLSX_FILES);

        ProgressBar progress = (ProgressBar) splash.getScene().lookup("#progress");
        Tooltip progressTt = progress.getTooltip();
        progress.setVisible(true);

        if (xmlFile != null) {
            LoadEansTask task = new LoadEansTask(xmlFile, eanType, progress, splash, window, defaultConnection);
            splash.show();
            progress.progressProperty().bind(task.progressProperty());
            progressTt.textProperty().bind(task.messageProperty());
            new Thread(task).start();
        }
    }

    @FXML
    void downloadImages(ActionEvent event) {
        log.info("Action: Download images and saving files to disc");
        Window window = ((MenuItem) event.getTarget()).getParentPopup().getScene().getWindow();
        File downloadDirectory = RetentionDirectoryChooser.showDialog(window, "Select directory");

        ProgressBar progress = (ProgressBar) splash.getScene().lookup("#progress");
        Tooltip progressTt = progress.getTooltip();
        progress.setVisible(true);

        if (downloadDirectory != null) {
            DownloadImagesTask task = new DownloadImagesTask(downloadDirectory, progress, splash, window, defaultConnection);
            splash.show();
            progress.progressProperty().bind(task.progressProperty());
            progressTt.textProperty().bind(task.messageProperty());
            new Thread(task).start();
        }
    }

    @FXML
    void downloadImagesFromXlsx(ActionEvent event) {
        log.info("Action: Download images from XLSX and saving files to disc");
        Window window = ((MenuItem) event.getTarget()).getParentPopup().getScene().getWindow();
        File downloadDirectory = RetentionDirectoryChooser.showDialog(window, "Select directory");
        File xlsxFile = RetentionFileChooser.showOpenDialog(window, "Select file to import");

        ProgressBar progress = (ProgressBar) splash.getScene().lookup("#progress");
        Tooltip progressTt = progress.getTooltip();
        progress.setVisible(true);

        if (downloadDirectory != null) {
            DownloadImagesFromXlsxTask task = new DownloadImagesFromXlsxTask(xlsxFile, downloadDirectory, progress, splash, window);
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
            LoadPayroll task = new LoadPayroll(xmlFile, file, splash, window);
            splash.show();
            new Thread(task).start();
        }
    }

    @FXML
    void showAboutTheProducts(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/AboutTheProducts.fxml")));
        setPane(pane);
        log.info("Showing About the products table");
    }

    @FXML
    void showAttribute(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/Attribute.fxml")));
        setPane(pane);
        log.info("Showing Attribute table");
    }

    @FXML
    void showEANPurePlayer(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/EANPurePlayer.fxml")));
        setPane(pane);
        log.info("Showing EAN PurePlayer table");
    }

    @FXML
    void showEANSpecializedStore(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/EANSpecializedStore.fxml")));
        setPane(pane);
        log.info("Showing EAN SpecializedStore table");
    }

    @FXML
    void showFeatureImagesWebsite(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/FeatureImagesWebsite.fxml")));
        setPane(pane);
        log.info("Showing Feature images website table");
    }

    @FXML
    void showFeaturesOverview(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/FeaturesOverview.fxml")));
        setPane(pane);
        log.info("Showing Features overview table");
    }

    @FXML
    void showMainCollectionImageWebsite(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/MainCollectionImageWebsite.fxml")));
        setPane(pane);
        log.info("Showing Main collection image website table");
    }

    @FXML
    void showMainProductImageWebsite(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/MainProductImageWebsite.fxml")));
        setPane(pane);
        log.info("Showing Main product image website table");
    }

    @FXML
    void showPim(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/Pim.fxml")));
        setPane(pane);
        log.info("Showing Pim table");
    }

    @FXML
    void showSellingPoints(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("db/SellingPoints.fxml")));
        setPane(pane);
        log.info("Showing Selling points table");
    }


    private void setPane(BorderPane pane) {
        AnchorPane.setBottomAnchor(pane, 0d);
        AnchorPane.setTopAnchor(pane, 0d);
        AnchorPane.setLeftAnchor(pane, 0d);
        AnchorPane.setRightAnchor(pane, 0d);
        centerPane.getChildren().setAll(pane);
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
