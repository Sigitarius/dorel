package pl.sigitarius.dorel;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class SplashStage extends Stage {
	
	public SplashStage(Stage stage) {
		Parent parent = null;
		try {
			parent = FXMLLoader.load(getClass().getResource("Splash.fxml"));
		} catch (IOException e) {
			log.error("Nie odnalazłem Splash screena", e);
		}
		Scene splashScene = new Scene(parent);

		splashScene.setFill(Color.TRANSPARENT);
		this.setScene(splashScene);
		this.initModality(Modality.APPLICATION_MODAL);
		this.initStyle(StageStyle.TRANSPARENT);

		this.setOnShowing(ev -> this.hide());

		this.setOnShown(ev -> {
			this.setX((stage.getX() + stage.getWidth()/2d) - this.getWidth()/2d);
			this.setY((stage.getY() + stage.getHeight()/2d) - this.getHeight()/2d);
			this.show();
        });
	}

	
	
}
