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
import pl.sigitarius.dorel.model.dao.MainCollectionImageWebsiteDao;
import pl.sigitarius.dorel.model.db.MainCollectionImageWebsite;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class MainCollectionImageWebsiteController implements Initializable {

    private Stage splash;
    private MsSqlConnection defaultConnection;

    @FXML
    private TableView<MainCollectionImageWebsite> mainCollectionTable;

    @FXML
    private TableColumn<MainCollectionImageWebsite, String> articleNumberCol;
    @FXML
    private TableColumn<MainCollectionImageWebsite, String> pathCol;

    private List<MainCollectionImageWebsite> mainCollectionList = new ArrayList<>();
    private ObservableList<MainCollectionImageWebsite> observableList;
    private MainCollectionImageWebsiteDao mainCollectionImageWebsiteDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        defaultConnection = MsSqlConnection.getDefaultConnection();

        mainCollectionImageWebsiteDao = new MainCollectionImageWebsiteDao(defaultConnection);

        mainCollectionTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        pathCol.setCellValueFactory(new PropertyValueFactory<>("path"));

        mainCollectionList = mainCollectionImageWebsiteDao.getAllImages();

        observableList = FXCollections.observableArrayList(mainCollectionList);
        mainCollectionTable.setItems(observableList);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
