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
import pl.sigitarius.dorel.model.dao.AboutTheProductsDao;
import pl.sigitarius.dorel.model.db.AboutTheProducts;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class AboutTheProductsController implements Initializable {

    private Stage splash;
    private MsSqlConnection defaultConnection;

    @FXML
    private TableView<AboutTheProducts> atpTable;

    @FXML
    private TableColumn<AboutTheProducts, String> articleNumberCol;
    @FXML
    private TableColumn<AboutTheProducts, String> introTextCol;
    @FXML
    private TableColumn<AboutTheProducts, String> longDescCol;

    private List<AboutTheProducts> aboutList = new ArrayList<>();
    private ObservableList<AboutTheProducts> aboutListObs;
    private AboutTheProductsDao aboutTheProductsDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        defaultConnection = MsSqlConnection.getDefaultConnection();

        aboutTheProductsDao = new AboutTheProductsDao(defaultConnection);

        atpTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        introTextCol.setCellValueFactory(new PropertyValueFactory<>("introTextConsumer"));
        longDescCol.setCellValueFactory(new PropertyValueFactory<>("longDescription2NdPart"));

        aboutList = aboutTheProductsDao.getAboutTheProductsItems();

        aboutListObs = FXCollections.observableArrayList(aboutList);
        atpTable.setItems(aboutListObs);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
