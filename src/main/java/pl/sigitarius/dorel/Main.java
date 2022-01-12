package pl.sigitarius.dorel;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;


@Slf4j
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        Thread.setDefaultUncaughtExceptionHandler(Main::showError);
        log.info("Starting application");

        Parent parent;
        FXMLLoader fxmlLoader;
        try {
            fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
            parent = fxmlLoader.load();
        } catch (IOException e) {
            log.error("Load error ", e);
            throw new RuntimeException();
        }


        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setTitle("Dorel");
        stage.setScene(scene);
        stage.setOnCloseRequest(s -> System.exit(0));
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.png")));
        stage.show();

        SplashStage splash = new SplashStage(stage);
        splash.initOwner(scene.getWindow());

        MainController mainController = fxmlLoader.getController();

        mainController.setSplash(splash);

    }

    private static void showError(Thread t, Throwable e) {
        log.error("***Default exception handler***");
        if (Platform.isFxApplicationThread()) {
            log.error("Error occurred", e);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText("Wystąpił błąd aplikacji");
            alert.setContentText("Aby poznać szczegóły sprawd log");
            alert.showAndWait();
        } else {
            log.error("An unexpected error occurred in "+t, e);

        }
    }
}
