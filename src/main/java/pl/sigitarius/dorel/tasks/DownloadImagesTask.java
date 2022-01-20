package pl.sigitarius.dorel.tasks;

import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import pl.sigitarius.dorel.model.dao.FeatureImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.MainCollectionImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.MainProductImageWebsiteDao;
import pl.sigitarius.dorel.model.db.FeatureImagesWebsite;
import pl.sigitarius.dorel.model.db.MainCollectionImageWebsite;
import pl.sigitarius.dorel.model.db.MainProductImageWebsite;
import pl.sigitarius.dorel.utils.Alert;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RequiredArgsConstructor
public class DownloadImagesTask extends Task {

    private final File downloadDirectory;
    private final ProgressBar progress;
    private final Stage splash;
    private final Window window;
    private final MsSqlConnection defaultConnection;

    public static final String PROTOCOL = "http";
    public static final String DORELDIGITAL_BASE_URL = "mam-prod.doreldigital.io";

    @Override
    protected Void call() {
        try {
            log.info("Getting images paths from DB");
            FeatureImageWebsiteDao featureImageWebsiteDao = new FeatureImageWebsiteDao(defaultConnection);
            MainCollectionImageWebsiteDao mainCollectionImageWebsiteDao = new MainCollectionImageWebsiteDao(defaultConnection);
            MainProductImageWebsiteDao mainProductImageWebsiteDao = new MainProductImageWebsiteDao(defaultConnection);
            List<FeatureImagesWebsite> featureImages = featureImageWebsiteDao.getAllImages();
            List<MainCollectionImageWebsite> mainCollectionImages = mainCollectionImageWebsiteDao.getAllImages();
            List<MainProductImageWebsite> mainProductImages = mainProductImageWebsiteDao.getAllImages();
            AtomicInteger index = new AtomicInteger(0);
            int size = featureImages.size();
            updateProgress(0, size);
            featureImages.forEach(i -> {
                try {
                    long articleNumber = i.getArticleNumber();
                    log.info("Downloading feature images for article " + articleNumber);
                    updateProgress(index.incrementAndGet(), size);
                    updateMessage("Przetwarzam " + index.get() + " rekord " + articleNumber);
                    String pathname = downloadDirectory + "\\" + articleNumber + "\\Feature";
                    File directory = new File(pathname);
                    if (!directory.exists()) {
                        directory.mkdirs();
                    }
                    Path p = Paths.get(i.getPath());
                    String fileName = p.getFileName().toString();

                    FileUtils.copyURLToFile(
                            new URL(PROTOCOL, DORELDIGITAL_BASE_URL, "/" + i.getPath().replaceAll(" ", "%20")),
                            new File(pathname + "\\" + fileName));
                } catch (IOException e) {
                    log.error("Error occurred while saving file", e);
                }
            });

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
                    Path p = Paths.get(i.getPath());
                    String fileName = p.getFileName().toString();

                    FileUtils.copyURLToFile(
                            new URL(PROTOCOL, DORELDIGITAL_BASE_URL, "/" + i.getPath().replaceAll(" ", "%20")),
                            new File(pathname + "\\" + fileName));
                } catch (IOException e) {
                    log.error("Error occurred while saving file", e);
                }
            });


            AtomicInteger indexP = new AtomicInteger(0);
            int sizeP = mainProductImages.size();
            updateProgress(0, size);
            mainProductImages.forEach(i -> {
                try {
                    long articleNumber = i.getArticleNumber();
                    log.info("Downloading Main product image for article " + articleNumber);
                    updateProgress(indexP.incrementAndGet(), sizeP);
                    updateMessage("Przetwarzam " + indexP.get() + " rekord " + articleNumber);
                    String pathname = downloadDirectory + "\\" + articleNumber + "\\Main product";
                    File directory = new File(pathname);
                    if (!directory.exists()) {
                        directory.mkdirs();
                    }
                    Path p = Paths.get(i.getPath());
                    String fileName = p.getFileName().toString();

                    FileUtils.copyURLToFile(
                            new URL(PROTOCOL, DORELDIGITAL_BASE_URL, "/" + i.getPath().replaceAll(" ", "%20")),
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
