package pl.sigitarius.dorel.tasks;

import javafx.concurrent.Task;
import javafx.stage.Stage;
import javafx.stage.Window;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.listaplac.ELEMENT;
import pl.sigitarius.dorel.model.listaplac.ELEMENTY;
import pl.sigitarius.dorel.model.listaplac.LISTAPLAC;
import pl.sigitarius.dorel.model.listaplac.LISTYPLAC;
import pl.sigitarius.dorel.model.listaplac.ObjectFactory;
import pl.sigitarius.dorel.model.listaplac.PLATNOSC;
import pl.sigitarius.dorel.model.listaplac.PLATNOSCI;
import pl.sigitarius.dorel.model.listaplac.ROOT;
import pl.sigitarius.dorel.model.listaplac.WYPLATA;
import pl.sigitarius.dorel.model.listaplac.WYPLATY;
import pl.sigitarius.dorel.utils.Alert;
import pl.sigitarius.dorel.xml.ListaplacJAXBUtils;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@RequiredArgsConstructor
public class LoadPayroll extends Task {

    private final File xmlFile;
    private final File file;
    private final Stage splash;
    private final Window window;

    @Override
    protected Void call() {
        try {
            ROOT root = ListaplacJAXBUtils.getRootFromFile(xmlFile);

            LISTYPLAC listyplacOrginal = root.getLISTYPLAC();
            List<LISTAPLAC> listyPlacOrginal = listyplacOrginal.getLISTAPLAC();

            ROOT rootNew = new ObjectFactory().createROOT();
            LISTYPLAC listyPlac = new ObjectFactory().createLISTYPLAC();
            listyPlac.setBAZADOCID(listyplacOrginal.getBAZADOCID());
            listyPlac.setBAZAZRDID(listyplacOrginal.getBAZAZRDID());
            listyPlac.setWERSJA(listyplacOrginal.getWERSJA());
            listyPlac.getLISTAPLAC().add(null);

            listyPlacOrginal.forEach(l -> {
                AtomicReference<BigDecimal> wyplataWartosc = new AtomicReference<>(new BigDecimal(0));
                AtomicReference<BigDecimal> wyplataBrutto = new AtomicReference<>(new BigDecimal(0));
                AtomicReference<BigDecimal> wyplataPodstawa1 = new AtomicReference<>(new BigDecimal(0));
                List<ELEMENT> elementList = new ArrayList<>();
                List<PLATNOSC> platnoscList = new ArrayList<>();
                l.getWYPLATY().getWYPLATA().forEach(w -> {
                    wyplataWartosc.updateAndGet(v -> v.add(w.getWYPLATAWARTOSC()));
                    wyplataBrutto.updateAndGet(v -> v.add(w.getWYPLATABRUTTO()));
                    wyplataPodstawa1.updateAndGet(v -> v.add(w.getWYPLATAPODSTAWAPODAT1()));
                    elementList.addAll(w.getELEMENTY().getELEMENT());
                    platnoscList.addAll(w.getPLATNOSCI().getPLATNOSC());
                });
                List<WYPLATA> wyplataList = l.getWYPLATY().getWYPLATA();
                WYPLATA wyplata = wyplataList.get(0);
                wyplata.setWYPLATAWARTOSC(wyplataWartosc.get());
                wyplata.setWYPLATABRUTTO(wyplataBrutto.get());
                wyplata.setWYPLATAPODSTAWAPODAT1(wyplataPodstawa1.get());
                wyplata.setELEMENTY(new ELEMENTY());
                wyplata.getELEMENTY().getELEMENT().addAll(elementList);
                wyplata.setPLATNOSCI(new PLATNOSCI());
                wyplata.getPLATNOSCI().getPLATNOSC().addAll(platnoscList);
                l.setWYPLATY(new WYPLATY());
                l.getWYPLATY().getWYPLATA().add(wyplata);
            });
            listyPlac.getLISTAPLAC().addAll(listyPlacOrginal);
            rootNew.setLISTYPLAC(listyPlac);

            ListaplacJAXBUtils.saveRootToFile(rootNew, file);

        } catch (Exception e) {
            log.error("Error occured", e);
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    protected void succeeded() {
        splash.hide();
        new Alert(javafx.scene.control.Alert.AlertType.INFORMATION, "Przetwarzanie listy płac", "Zakończono",
                "Poprawnie zakończono przepisywanie obiektów " + xmlFile.getName(), window);
    }

    @Override
    protected void failed() {
        splash.hide();
        new Alert(javafx.scene.control.Alert.AlertType.ERROR, "Przetwarzanie listy płac", "Przerwano",
                "Wystąpił błąd podczas przetwarzania pliku " + xmlFile.getName(), window);
    }


}
