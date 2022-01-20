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
import pl.sigitarius.dorel.model.dao.FeaturesOverviewDao;
import pl.sigitarius.dorel.model.db.FeaturesOverview;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class FeatureOverviewController implements Initializable {

    private Stage splash;
    private MsSqlConnection defaultConnection;

    @FXML
    private TableView<FeaturesOverview> featureOverviewTable;

    @FXML
    private TableColumn<FeaturesOverview, String> articleNumberCol;
    @FXML
    private TableColumn<FeaturesOverview, String> shortCol;
    @FXML
    private TableColumn<FeaturesOverview, String> longCol;

    private List<FeaturesOverview> featureImagesWebsiteList = new ArrayList<>();
    private ObservableList<FeaturesOverview> observableList;
    private FeaturesOverviewDao featuresOverviewDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        defaultConnection = MsSqlConnection.getDefaultConnection();

        featuresOverviewDao = new FeaturesOverviewDao(defaultConnection);

        featureOverviewTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        shortCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        longCol.setCellValueFactory(new PropertyValueFactory<>("path"));

        featureImagesWebsiteList = featuresOverviewDao.getAllFeatures();

        observableList = FXCollections.observableArrayList(featureImagesWebsiteList);
        featureOverviewTable.setItems(observableList);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
