package pl.sigitarius.dorel.tasks;

import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import pl.sigitarius.dorel.model.db.MainCollectionImageWebsite;
import pl.sigitarius.dorel.utils.Alert;
import pl.sigitarius.dorel.utils.XlsxImporter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RequiredArgsConstructor
public class DownloadImagesFromXlsxTask extends Task {

    private final File xlsxFile;
    private final File downloadDirectory;
    private final ProgressBar progress;
    private final Stage splash;
    private final Window window;

    @Override
    protected Void call() {
        try {
            log.info("Getting images paths from XLSX");
            List<MainCollectionImageWebsite> mainCollectionImages = XlsxImporter.parseMainCollectionImage(xlsxFile);
            AtomicInteger index = new AtomicInteger(0);
            int size = mainCollectionImages.size();
            updateProgress(0, size);


            AtomicInteger indexC = new AtomicInteger(0);
            int sizeC = mainCollectionImages.size();
            updateProgress(0, size);
            mainCollectionImages.forEach(i -> {
                try {
                    long articleNumber = i.getArticleNumber();
                    log.info("Downloading Main collection image for article " + articleNumber);
                    updateProgress(indexC.incrementAndGet(), sizeC);
                    updateMessage("Przetwarzam " + indexC.get() + " rekord " + articleNumber);
                    String pathname = downloadDirectory + "\\" + articleNumber + "\\Main collection";
                    File directory = new File(pathname);
                    if (!directory.exists()) {
                        directory.mkdirs();
                    }
                    URL url = new URL(i.getPath());
                    String fileName = Paths.get(url.getFile()).getFileName().toString();

                    FileUtils.copyURLToFile(
                            new URL(i.getPath().replaceAll(" ", "%20")),
                            new File(pathname + "\\" + fileName));
                } catch (IOException e) {
                    log.error("Error occurred while saving file", e);
                }
            });


        } catch (Exception e) {
            log.error("Error occurred", e);
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    protected void succeeded() {
        splash.hide();
        progress.setVisible(false);
        new Alert(javafx.scene.control.Alert.AlertType.INFORMATION, "Zapisywanie obrazów na dysk", "Zakończono",
                "Poprawnie zakończono zapisywanie na dysk do folderu " + downloadDirectory.getAbsolutePath(), window);
        log.info("Downloading finished successfully");
    }

    @Override
    protected void failed() {
        splash.hide();
        progress.setVisible(false);
        new Alert(javafx.scene.control.Alert.AlertType.ERROR, "Zapisywanie obrazów na dysk", "Przerwano",
                "Wystąpił błąd podczas zapisu plików do folderu " + downloadDirectory.getAbsolutePath(), window);
        log.warn("Downloading finished with errors");
    }

}
