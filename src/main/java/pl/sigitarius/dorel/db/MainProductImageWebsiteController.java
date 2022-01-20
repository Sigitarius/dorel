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
import pl.sigitarius.dorel.model.dao.MainProductImageWebsiteDao;
import pl.sigitarius.dorel.model.db.MainProductImageWebsite;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class MainProductImageWebsiteController implements Initializable {

    private Stage splash;
    private MsSqlConnection defaultConnection;

    @FXML
    private TableView<MainProductImageWebsite> mainProductTable;

    @FXML
    private TableColumn<MainProductImageWebsite, String> articleNumberCol;
    @FXML
    private TableColumn<MainProductImageWebsite, String> pathCol;

    private List<MainProductImageWebsite> mainCollectionList = new ArrayList<>();
    private ObservableList<MainProductImageWebsite> observableList;
    private MainProductImageWebsiteDao mainProductImageWebsiteDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        defaultConnection = MsSqlConnection.getDefaultConnection();

        mainProductImageWebsiteDao = new MainProductImageWebsiteDao(defaultConnection);

        mainProductTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        pathCol.setCellValueFactory(new PropertyValueFactory<>("path"));

        mainCollectionList = mainProductImageWebsiteDao.getAllImages();

        observableList = FXCollections.observableArrayList(mainCollectionList);
        mainProductTable.setItems(observableList);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
