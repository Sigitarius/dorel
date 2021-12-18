package pl.sigitarius.dorel.utils;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Window;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class Alert {

	private Optional<ButtonType> result;
	
	
	public Alert(AlertType type, String title, String header, String content, Window owner){
		if(log != null){
			switch(type){
				case INFORMATION : 
					log.info(content);
					break;
				case WARNING:
					log.warn(content);
					break;
				case ERROR:
					log.error(content);
					break;
			default:
				log.info(content);
				break;
			}
		}
		javafx.scene.control.Alert alert = new javafx.scene.control.Alert(type);
		alert.initOwner(owner);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		setResult(alert.showAndWait());
	}


	public Optional<ButtonType> getResult() {
		return result;
	}


	public void setResult(Optional<ButtonType> result) {
		this.result = result;
	}
	
}
