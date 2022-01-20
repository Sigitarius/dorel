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
import pl.sigitarius.dorel.model.dao.AttributeDao;
import pl.sigitarius.dorel.model.db.Attribute;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class AttributeController implements Initializable {

    private Stage splash;

    @FXML
    private TableView<Attribute> attributeTable;

    @FXML
    private TableColumn<Attribute, String> articleNumberCol;
    @FXML
    private TableColumn<Attribute, String> brandIdCol;
    @FXML
    private TableColumn<Attribute, String> brandLabelCol;
    @FXML
    private TableColumn<Attribute, String> familyIdCol;
    @FXML
    private TableColumn<Attribute, String> familyabelCol;
    @FXML
    private TableColumn<Attribute, String> lineIdCol;
    @FXML
    private TableColumn<Attribute, String> lineLabelCol;
    @FXML
    private TableColumn<Attribute, String> rangeIdCol;
    @FXML
    private TableColumn<Attribute, String> rangeLabelCol;
    @FXML
    private TableColumn<Attribute, String> aproxAgeIdCol;
    @FXML
    private TableColumn<Attribute, String> aproxAgeLabelCol;
    @FXML
    private TableColumn<Attribute, String> lengthClassIdCol;
    @FXML
    private TableColumn<Attribute, String> lengthClassLabelCol;


    private List<Attribute> attributeList = new ArrayList<>();
    private ObservableList<Attribute> attributeListObs;
    private AttributeDao attributeDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        MsSqlConnection defaultConnection = MsSqlConnection.getDefaultConnection();

        attributeDao = new AttributeDao(defaultConnection);

        attributeTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        brandIdCol.setCellValueFactory(new PropertyValueFactory<>("brandId"));
        brandLabelCol.setCellValueFactory(new PropertyValueFactory<>("brandLabel"));
        familyIdCol.setCellValueFactory(new PropertyValueFactory<>("familyId"));
        familyabelCol.setCellValueFactory(new PropertyValueFactory<>("familyLabel"));
        lineIdCol.setCellValueFactory(new PropertyValueFactory<>("lineId"));
        lineLabelCol.setCellValueFactory(new PropertyValueFactory<>("lineLabel"));
        rangeIdCol.setCellValueFactory(new PropertyValueFactory<>("rangeId"));
        rangeLabelCol.setCellValueFactory(new PropertyValueFactory<>("rangeLabel"));
        aproxAgeIdCol.setCellValueFactory(new PropertyValueFactory<>("approximateAgeTextExtId"));
        aproxAgeLabelCol.setCellValueFactory(new PropertyValueFactory<>("approximateAgeTextExtLabel"));
        lengthClassIdCol.setCellValueFactory(new PropertyValueFactory<>("lengthClassExtId"));
        lengthClassLabelCol.setCellValueFactory(new PropertyValueFactory<>("lengthClassExtLabel"));

        attributeList = attributeDao.getAttributeItems();

        attributeListObs = FXCollections.observableArrayList(attributeList);
        attributeTable.setItems(attributeListObs);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
