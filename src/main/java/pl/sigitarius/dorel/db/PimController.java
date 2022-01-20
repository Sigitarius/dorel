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
import pl.sigitarius.dorel.model.dao.PimDao;
import pl.sigitarius.dorel.model.db.Pim;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class PimController implements Initializable {

    private Stage splash;

    @FXML
    private TableView<Pim> pimTable;

    @FXML
    private TableColumn<Pim, Integer> idCol;
    @FXML
    private TableColumn<Pim, LocalDateTime> createdCol;
    @FXML
    private TableColumn<Pim, LocalDateTime> changedCol;
    @FXML
    private TableColumn<Pim, Long> parentIdCol;
    @FXML
    private TableColumn<Pim, Long> pdmarticleIdCol;
    @FXML
    private TableColumn<Pim, String> labelCol;
    @FXML
    private TableColumn<Pim, String> firstCollYearCol;
    @FXML
    private TableColumn<Pim, String> seoProdyctNameCol;
    @FXML
    private TableColumn<Pim, String> seoDescriptionCol;
    @FXML
    private TableColumn<Pim, String> articleNumberCol;
    @FXML
    private TableColumn<Pim, String> externalKeyCol;
    @FXML
    private TableColumn<Pim, String> skuCol;
    @FXML
    private TableColumn<Pim, String> ean13Col;
    @FXML
    private TableColumn<Pim, String> erpNameCol;
    @FXML
    private TableColumn<Pim, String> commercialNameCol;
    @FXML
    private TableColumn<Pim, String> grosWeightCol;
    @FXML
    private TableColumn<Pim, String> netWeightCol;
    @FXML
    private TableColumn<Pim, String> volumeCol;
    @FXML
    private TableColumn<Pim, String> productWeightCol;


    private List<Pim> pimList = new ArrayList<>();
    private ObservableList<Pim> pimListObs;
    private PimDao PimDao;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        MsSqlConnection defaultConnection = MsSqlConnection.getDefaultConnection();

        PimDao = new PimDao(defaultConnection);

        pimTable.setPlaceholder(new Label("Brak rekordów"));
        articleNumberCol.setCellValueFactory(new PropertyValueFactory<>("articleNumber"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        createdCol.setCellValueFactory(new PropertyValueFactory<>("created"));
        changedCol.setCellValueFactory(new PropertyValueFactory<>("changed"));
        parentIdCol.setCellValueFactory(new PropertyValueFactory<>("parentId"));
        pdmarticleIdCol.setCellValueFactory(new PropertyValueFactory<>("pdmarticleId"));
        labelCol.setCellValueFactory(new PropertyValueFactory<>("label"));
        firstCollYearCol.setCellValueFactory(new PropertyValueFactory<>("firstCollectionYear"));
        seoProdyctNameCol.setCellValueFactory(new PropertyValueFactory<>("seoProductName"));
        seoDescriptionCol.setCellValueFactory(new PropertyValueFactory<>("seoDescription"));
        externalKeyCol.setCellValueFactory(new PropertyValueFactory<>("externalKey"));
        skuCol.setCellValueFactory(new PropertyValueFactory<>("sku"));
        ean13Col.setCellValueFactory(new PropertyValueFactory<>("ean13BarcodeText"));
        erpNameCol.setCellValueFactory(new PropertyValueFactory<>("erpFullProductName"));
        commercialNameCol.setCellValueFactory(new PropertyValueFactory<>("commercialProductName"));
        grosWeightCol.setCellValueFactory(new PropertyValueFactory<>("grossWeight"));
        netWeightCol.setCellValueFactory(new PropertyValueFactory<>("netWeight"));
        volumeCol.setCellValueFactory(new PropertyValueFactory<>("volume"));
        productWeightCol.setCellValueFactory(new PropertyValueFactory<>("productWeight"));

        pimList = PimDao.getPimItems();

        pimListObs = FXCollections.observableArrayList(pimList);
        pimTable.setItems(pimListObs);
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
