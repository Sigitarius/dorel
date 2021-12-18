package pl.sigitarius.dorel.utils;

import javafx.beans.property.SimpleObjectProperty;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RetentionFileChooser {
    public enum FilterMode {
        //Setup supported filters
        XLSX_FILES("Pliki XLSX", "*.xlsx"),
        XML_FILES("Pliki XML", "*.xml"),
    	SQL_FILES("Pliki SQL", "*.sql");

        private ExtensionFilter extensionFilter;

        FilterMode(String extensionDisplayName, String... extensions){
            extensionFilter = new ExtensionFilter(extensionDisplayName, extensions);
        }

        public ExtensionFilter getExtensionFilter(){
            return extensionFilter;
        }
    }

    private static FileChooser instance = null;
    private static SimpleObjectProperty<File> lastKnownDirectoryProperty = new SimpleObjectProperty<>();

    private RetentionFileChooser(){ }

    private static FileChooser getInstance(FilterMode... filterModes){
        if(instance == null) {
            instance = new FileChooser();
            instance.initialDirectoryProperty().bindBidirectional(lastKnownDirectoryProperty);
        }
        //Set the filters to those provided
        //You could add check's to ensure that a default filter is included, adding it if need be
        instance.getExtensionFilters().setAll(
                Arrays.stream(filterModes)
                        .map(FilterMode::getExtensionFilter)
                        .collect(Collectors.toList()));
        return instance;
    }

    public static File showOpenDialog(String title, FilterMode... filterModes){
        return showOpenDialog(null, title, filterModes);
    }

    public static File showOpenDialog(Window ownerWindow, String title, FilterMode...filterModes){
        FileChooser openDialog = getInstance(filterModes);
        openDialog.setTitle(title);
        File chosenFile = openDialog.showOpenDialog(ownerWindow);
        if(chosenFile != null){
            lastKnownDirectoryProperty.setValue(chosenFile.getParentFile());
        }
        return chosenFile;
    }
    
    public static File showOpenMultipleDialog(String title, FilterMode... filterModes){
    	return showOpenDialog(null, title, filterModes);
    }
    
    public static List<File> showOpenMultipleDialog(Window ownerWindow, String title, FilterMode...filterModes){
    	FileChooser openDialog = getInstance(filterModes);
    	openDialog.setTitle(title);
    	List<File> chosenFiles = openDialog.showOpenMultipleDialog(ownerWindow);
    	if(chosenFiles != null && chosenFiles.size() > 0){
    		lastKnownDirectoryProperty.setValue(chosenFiles.get(0).getParentFile());
    	}
    	return chosenFiles;
    }

    public static File showSaveDialog(String title, FilterMode... filterModes){
        return showSaveDialog(null, title, filterModes);
    }

    public static File showSaveDialog(Window ownerWindow, String title, FilterMode... filterModes){
        FileChooser saveDialog = getInstance(filterModes);
        saveDialog.setTitle(title);
        File chosenFile = saveDialog.showSaveDialog(ownerWindow);
        if(chosenFile != null){
            lastKnownDirectoryProperty.setValue(chosenFile.getParentFile());
        }
        return chosenFile;
    }
}