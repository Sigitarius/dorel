package pl.sigitarius.dorel.tasks;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.dao.AboutTheProductsDao;
import pl.sigitarius.dorel.model.dao.AttributeDao;
import pl.sigitarius.dorel.model.dao.EanPurePlayerDao;
import pl.sigitarius.dorel.model.dao.EanSpecializedStoreDao;
import pl.sigitarius.dorel.model.dao.FeatureImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.FeaturesOverviewDao;
import pl.sigitarius.dorel.model.dao.MainCollectionImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.MainProductImageWebsiteDao;
import pl.sigitarius.dorel.model.dao.PimDao;
import pl.sigitarius.dorel.model.dao.SellingPointsDao;
import pl.sigitarius.dorel.model.db.Ean;
import pl.sigitarius.dorel.model.pim.Data;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.utils.Alert;
import pl.sigitarius.dorel.utils.MsSqlConnection;
import pl.sigitarius.dorel.xml.PimJAXBUtils;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@RequiredArgsConstructor
public class LoadObjectsTask extends Task {

    private final List<File> xmlFiles;
    private final Stage splash;
    private final Window window;
    private final MsSqlConnection defaultConnection;
    ;


    @Override
    protected Void call() {
        try {
            log.info("Getting EANs from DB");
            Platform.runLater(() -> splash.show());
            EanPurePlayerDao eanPurePlayerDao = new EanPurePlayerDao(defaultConnection);
            EanSpecializedStoreDao eanSpecializedStoreDao = new EanSpecializedStoreDao(defaultConnection);
            PimDao pimDao = new PimDao(defaultConnection);
            AboutTheProductsDao aboutTheProductsDao = new AboutTheProductsDao(defaultConnection);
            FeaturesOverviewDao featuresOverviewDao = new FeaturesOverviewDao(defaultConnection);
            FeatureImageWebsiteDao featureImageWebsiteDao = new FeatureImageWebsiteDao(defaultConnection);
            MainCollectionImageWebsiteDao mainCollectionImageWebsiteDao = new MainCollectionImageWebsiteDao(defaultConnection);
            MainProductImageWebsiteDao mainProductImageWebsiteDao = new MainProductImageWebsiteDao(defaultConnection);
            AttributeDao attributeDao = new AttributeDao(defaultConnection);
            SellingPointsDao sellingPointsDao = new SellingPointsDao(defaultConnection);

            Set<Ean> eanPP = eanPurePlayerDao.getEans();
            Set<Ean> eanSS = eanSpecializedStoreDao.getEans();

            log.info("Merging EANs");
            HashSet<Ean> eans = new HashSet<>();
            eans.addAll(eanPP);
            eans.addAll(eanSS);
            Set<String> eansStrings = eans.stream().map(Ean::getValue).collect(Collectors.toSet());

            log.info("Getting objects from XML file");

            xmlFiles.forEach(f -> {

                Data data = PimJAXBUtils.getDataFromFile(f);


                Supplier<Stream<Item>> itemsSup = () -> data.getItem().stream()
                        .filter(i -> eansStrings.contains(i.getEAN13BarcodeText()));

                AtomicInteger index = new AtomicInteger(0);
                long size = itemsSup.get().count();
                updateProgress(0, size);
                itemsSup.get().forEach(i -> {
                    long articleNumber = i.getArticleNumber();
                    log.info("Processing the article: " + articleNumber);
                    updateProgress(index.incrementAndGet(), size);
                    updateMessage("Przetwarzam plik " + f.getName() + " rekord " + index.get() + " : " + articleNumber);
                    pimDao.deletePimByArticleNumber(articleNumber);
                    aboutTheProductsDao.deleteByArticleNumber(articleNumber);
                    featuresOverviewDao.deleteByArticleNumber(articleNumber);
                    featureImageWebsiteDao.deleteByArticleNumber(articleNumber);
                    mainCollectionImageWebsiteDao.deleteByArticleNumber(articleNumber);
                    mainProductImageWebsiteDao.deleteByArticleNumber(articleNumber);
                    attributeDao.deleteByArticleNumber(articleNumber);
                    sellingPointsDao.deleteByArticleNumber(articleNumber);
                    pimDao.insertPim(i);
                    aboutTheProductsDao.insertAboutTheProducts(i);
                    featuresOverviewDao.insertFeatureOverview(i);
                    featureImageWebsiteDao.insertWebsiteImages(i);
                    if (!i.getMainCollectionImageWebsite().isEmpty()) {
                        mainCollectionImageWebsiteDao.insertMainCollectionImageWebsite(i);
                    }
                    if (!i.getMainProductImageWebsite().isEmpty()) {
                        mainProductImageWebsiteDao.insertMainProductImageWebsite(i);
                    }
                    attributeDao.insertAtribute(i);
                    sellingPointsDao.insertSellingPoints(i);
                });

            });


        } catch (Exception e) {
            log.error("Error occured", e);
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    protected void succeeded() {
        splash.hide();
        new Alert(javafx.scene.control.Alert.AlertType.INFORMATION, "Przetwarzanie obiektów PIM", "Zakończono",
                "Poprawnie zakończono przetwarzanie plików", window);
        log.info("Saving objects to database finished successfully");
    }

    @Override
    protected void failed() {
        splash.hide();
        new Alert(javafx.scene.control.Alert.AlertType.ERROR, "Przetwarzanie obiektów PIM", "Przerwano",
                "Wystąpił błąd podczas przetwarzania plików ", window);
        log.warn("Saving objects to database finished with errors");
    }

}
