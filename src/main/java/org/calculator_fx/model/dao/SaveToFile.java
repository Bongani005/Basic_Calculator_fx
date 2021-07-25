package org.calculator_fx.model.dao;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public interface SaveToFile {
    void saveToFile(ActionEvent actionEvent, Button button, TextArea textArea);
}
