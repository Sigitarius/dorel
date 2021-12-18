package pl.sigitarius.dorel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pl.sigitarius.dorel.utils.Configuration;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnection implements Initializable{
     
	private static final Logger log = LogManager.getLogger();
	
    @FXML
    private Button testBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button cancelBtn;
    
    @FXML
    private Label testLbl;

    @FXML
    private TextField hostField;

    @FXML
    private TextField portField;

    @FXML
    private TextField databaseField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

	private boolean connected;

	Configuration conf;

	MsSqlConnection conn;

	private MainController mainController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		conf = new Configuration();
	}
	
	public void initDefaultConn(MsSqlConnection defaultConnection){
		conn = defaultConnection;
		fillFields();
	}

	private void fillFields() {
		hostField.setText(conn.getHost());
		portField.setText(String.valueOf(conn.getPort()));
		databaseField.setText(conn.getDatabase());
		usernameField.setText(conn.getUsername());
		passwordField.setText(conn.getPassword());
	}

    @FXML
    void cancel(ActionEvent event) {
		(((Node) event.getSource()).getScene()).getWindow().hide();
		log.info("Anulowano zapis ustawień połączenia");
    }

	@FXML
	void save(ActionEvent event) {
		String host = hostField.getText();
		String port = portField.getText();
		String database = databaseField.getText();
		String username = usernameField.getText();
		String password = passwordField.getText();
		
		conn.setHost(host);
		conn.setPort(Integer.parseInt(port));
		conn.setDatabase(database);
		conn.setUsername(username);
		conn.setPassword(password);
		
		conf.save(conn.getConnName() + ".password", password);
		conf.save(conn.getConnName() + ".host", host);
		conf.save(conn.getConnName() + ".port", port);
		conf.save(conn.getConnName() + ".database", database);
		conf.save(conn.getConnName() + ".username", username);
		conf.encryptPasswords();
		(((Node) event.getSource()).getScene()).getWindow().hide();
		log.info("Zapisano ustawienia połączenia do bazy danych");
	}
    
    

    @FXML
    void test(ActionEvent event) {
    	MsSqlConnection testConn = new MsSqlConnection("test", hostField.getText(), Integer.parseInt(portField.getText()), 
    													databaseField.getText(), usernameField.getText(), passwordField.getText());
    	try {
			testLbl.setText("");
    		testConn.testConnection();
    		testLbl.setText("OK");
    	} catch (SQLException e){
    		testLbl.setText("Błąd");
    	}
    }


	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
		
	}

}