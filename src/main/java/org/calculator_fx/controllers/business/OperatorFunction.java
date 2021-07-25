package org.calculator_fx.controllers.business;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public interface OperatorFunction {
    void addPlus(ActionEvent actionEvent, Button button, TextField textField);
    void subtract(ActionEvent actionEvent, Button button, TextField textField);
    void divide(ActionEvent actionEvent, Button button, TextField textField);
    void multiple(ActionEvent actionEvent, Button button, TextField textField);
    void equals(ActionEvent actionEvent, Button button, TextField textField, TextArea textArea);
    void tanTrig(ActionEvent actionEvent, Button button, TextField textField);
    void getSaveToFile(ActionEvent actionEvent, Button button, TextArea textArea);
}
