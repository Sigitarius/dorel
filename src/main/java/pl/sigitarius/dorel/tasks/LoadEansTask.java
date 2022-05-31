package pl.sigitarius.dorel.tasks;

import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.dao.EanPurePlayerDao;
import pl.sigitarius.dorel.model.dao.EanSpecializedStoreDao;
import pl.sigitarius.dorel.utils.Alert;
import pl.sigitarius.dorel.utils.MsSqlConnection;
import pl.sigitarius.dorel.utils.XlsxImporter;

import java.io.File;
import java.util.Set;

@Slf4j
@RequiredArgsConstructor
public class LoadEansTask extends Task {

    private final File xlsxFile;
    private final Type type;
    private final ProgressBar progress;
    private final Stage splash;
    private final Window window;
    private final MsSqlConnection defaultConnection;
    ;

    public enum Type {
        EAN_PUREPLAYER, EAN_SPECIALIZEDSTORE
    }

    @Override
    protected Void call() {
        try {
            log.info("Getting EANs from DB");

            Set<String> eans = XlsxImporter.parseEan(xlsxFile);
            switch (type) {
                case EAN_PUREPLAYER:
                    EanPurePlayerDao eanPurePlayerDao = new EanPurePlayerDao(defaultConnection);
                    eanPurePlayerDao.insertEans(eans);
                    break;
                case EAN_SPECIALIZEDSTORE:
                    EanSpecializedStoreDao eanSpecializedStoreDao = new EanSpecializedStoreDao(defaultConnection);
                    eanSpecializedStoreDao.insertEans(eans);
                    break;
            }

        } catch (Exception e) {
            log.error("Error occured", e);
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    protected void succeeded() {
        splash.hide();
        progress.setVisible(false);
        new Alert(javafx.scene.control.Alert.AlertType.INFORMATION, "Przetwarzane Eanów", "Zakończono",
                "Poprawnie zakończono przepisywanie obiektów " + xlsxFile.getName(), window);
        log.info("Saving objects to database finished successfully");
    }

    @Override
    protected void failed() {
        splash.hide();
        progress.setVisible(false);
        new Alert(javafx.scene.control.Alert.AlertType.ERROR, "Przetwarzane Eanów", "Przerwano",
                "Wystąpił błąd podczas przetwarzania pliku " + xlsxFile.getName(), window);
        log.warn("Saving objects to database finished with errors");
    }

}
