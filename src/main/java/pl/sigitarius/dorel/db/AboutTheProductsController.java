package pl.sigitarius.dorel.db;

import javafx.fxml.Initializable;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.utils.Configuration;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.util.ResourceBundle;

@Slf4j
public class AboutTheProductsController implements Initializable {

    private Stage splash;
    private Configuration conf;
    private MsSqlConnection defaultConnection;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Zaczytanie konfiguracji z pliku config.properties
        conf = new Configuration();
        defaultConnection = new MsSqlConnection("default", conf.get("default.host"),
                Integer.parseInt(conf.get("default.port")), conf.get("default.database"), conf.get("default.username"),
                conf.get("default.password"));
    }

    public void setSplash(Stage splash) {
        this.splash = splash;

    }
}
