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
import pl.sigitarius.dorel.model.dao.SellingPointsDao;
import pl.sigitarius.dorel.model.db.SellingPoints;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class SellingPointsController implements Initializable {

    private Stage splash;
    private MsSqlConnection defaultConnection;

    @FXML
    private TableView<SellingPoints> sellingPointsTable;

    @FXML
    private TableColumn<SellingPoints, String> articleNumberCol;
    @FXML
    private TableColumn<SellingPoints, String> uspIdCol;
    @FXML
    private TableColumn<SellingPoints, String> uspTitleCol;
    @FXML
    private TableColumn<SellingPoints, String> uspLongTextCol;
    @FXML
    private TableColumn<SellingPoints, String> uspImageWebsiteCol;

    private List<SellingPoints> sellingPointsList = new ArrayList<>();
    private ObservableList<SellingPoints> sellingPointsListObs;
    private SellingPointsDao sellingPointsDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        defaultConnection = MsSqlConnection.getDefaultConnection();

        sellingPointsDao = new SellingPointsDao(defaultConnection);

        sellingPointsTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        uspIdCol.setCellValueFactory(new PropertyValueFactory<>("uspId"));
        uspTitleCol.setCellValueFactory(new PropertyValueFactory<>("uspTitle"));
        uspLongTextCol.setCellValueFactory(new PropertyValueFactory<>("uspLongText"));
        uspImageWebsiteCol.setCellValueFactory(new PropertyValueFactory<>("uspImageWebsite"));

        sellingPointsList = sellingPointsDao.getAllSellingPoints();

        sellingPointsListObs = FXCollections.observableArrayList(sellingPointsList);
        sellingPointsTable.setItems(sellingPointsListObs);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
