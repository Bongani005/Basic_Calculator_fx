package org.calculator_fx.controllers.business;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public interface StaticPadFunction {
    void padFunction(ActionEvent actionEvent, Button button, TextField field, String name);
    void padZero(ActionEvent actionEvent, Button button, TextField field, String name);
    void padDot(ActionEvent actionEvent, Button button, TextField field, String name);
    void padEnableField(ActionEvent actionEvent, RadioButton radioButton, TextField field);
    void padDisableField(RadioButton radioButton);
    void clearScreen(ActionEvent actionEvent, Button button, TextField textField);
    void clearHistory(ActionEvent actionEvent, Button button, TextArea area);

}
