package pl.sigitarius.dorel.utils;

import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class PersistentButtonToggleGroup extends ToggleGroup {

    public PersistentButtonToggleGroup() {
        super();
        getToggles().addListener((ListChangeListener<Toggle>) c -> {
            while (c.next()) {
                for (final Toggle addedToggle : c.getAddedSubList()) {
                    ((ToggleButton) addedToggle).addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent mouseEvent) {
                            if (addedToggle.equals(getSelectedToggle())) mouseEvent.consume();
                        }
                    });
                }
            }
        });
    }
}
