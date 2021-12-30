package pl.sigitarius.dorel.utils;

import javafx.beans.property.SimpleObjectProperty;
import javafx.stage.DirectoryChooser;
import javafx.stage.Window;

import java.io.File;

public class RetentionDirectoryChooser {

    private static DirectoryChooser instance = null;
    private static final SimpleObjectProperty<File> lastKnownDirectoryProperty = new SimpleObjectProperty<>();

    private RetentionDirectoryChooser(){ }

    private static DirectoryChooser getInstance(){
        if(instance == null) {
            instance = new DirectoryChooser();
            instance.initialDirectoryProperty().bindBidirectional(lastKnownDirectoryProperty);
        }
        return instance;
    }

    public static File showOpenDialog(String title){
        return showDialog(null, title);
    }

    public static File showDialog(Window ownerWindow, String title){
        DirectoryChooser openDialog = getInstance();
        openDialog.setTitle(title);
        File chosenDirectory = openDialog.showDialog(ownerWindow);
        if(chosenDirectory != null){
            lastKnownDirectoryProperty.setValue(chosenDirectory.getParentFile());
        }
        return chosenDirectory;
    }
}