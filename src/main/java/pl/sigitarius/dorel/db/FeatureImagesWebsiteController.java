package pl.sigitarius.dorel.db;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.dao.FeatureImageWebsiteDao;
import pl.sigitarius.dorel.model.db.FeatureImagesWebsite;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class FeatureImagesWebsiteController implements Initializable {

    private Stage splash;
    private MsSqlConnection defaultConnection;

    @FXML
    private TableView<FeatureImagesWebsite> featureImagesTable;

    @FXML
    private TableColumn<FeatureImagesWebsite, String> articleNumberCol;
    @FXML
    private TableColumn<FeatureImagesWebsite, String> imageIdCol;
    @FXML
    private TableColumn<FeatureImagesWebsite, String> idCol;
    @FXML
    private TableColumn<FeatureImagesWebsite, String> pathCol;

    private List<FeatureImagesWebsite> featureImagesWebsiteList = new ArrayList<>();
    private ObservableList<FeatureImagesWebsite> observableList;
    private FeatureImageWebsiteDao featureImageWebsiteDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        defaultConnection = MsSqlConnection.getDefaultConnection();

        featureImageWebsiteDao = new FeatureImageWebsiteDao(defaultConnection);

        featureImagesTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        imageIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        imageIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        pathCol.setCellValueFactory(new PropertyValueFactory<>("path"));

        featureImagesWebsiteList = featureImageWebsiteDao.getAllImages();

        observableList = FXCollections.observableArrayList(featureImagesWebsiteList);
        featureImagesTable.setItems(observableList);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
