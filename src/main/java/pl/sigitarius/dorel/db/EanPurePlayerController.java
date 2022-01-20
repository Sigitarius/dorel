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
import pl.sigitarius.dorel.model.dao.EanSpecializedStoreDao;
import pl.sigitarius.dorel.model.db.Ean;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

@Slf4j
public class EanPurePlayerController implements Initializable {

    private Stage splash;
    private MsSqlConnection defaultConnection;

    @FXML
    private TableView<Ean> eanPurePlayerTable;

    @FXML
    private TableColumn<Ean, String> eanCol;

    private Set<Ean> eanList = new HashSet<>();
    private ObservableList<Ean> eanListObs;
    private EanSpecializedStoreDao eanSpecializedStoreDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        defaultConnection = MsSqlConnection.getDefaultConnection();

        eanSpecializedStoreDao = new EanSpecializedStoreDao(defaultConnection);

        eanPurePlayerTable.setPlaceholder(new Label("Brak rekordów"));
        eanCol.setCellValueFactory(new PropertyValueFactory<>("value"));

        eanList = eanSpecializedStoreDao.getEans();

        eanListObs = FXCollections.observableArrayList(eanList);
        eanPurePlayerTable.setItems(eanListObs);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
