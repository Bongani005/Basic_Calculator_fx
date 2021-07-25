package org.calculator_fx.controllers.services;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public interface StaticPaFunctionServices {
    void padFunction(ActionEvent actionEvent, Button button, TextField field, String name);
    void padZero(ActionEvent actionEvent, Button button, TextField field, String name);
    void padDot(ActionEvent actionEvent, Button button, TextField field, String name);
    void padEnableField(ActionEvent actionEvent, RadioButton radioButton, TextField field);
    void padDisableField(RadioButton radioButton);
    void clearScreen(ActionEvent actionEvent, Button button, TextField textField);
    void clearHistory(ActionEvent actionEvent, Button button, TextArea area);
    void addPlus(ActionEvent actionEvent, Button button, TextField textField);
    void subtract(ActionEvent actionEvent, Button button, TextField textField);
    void divide(ActionEvent actionEvent, Button button, TextField textField);
    void multiple(ActionEvent actionEvent, Button button, TextField textField);
    void equals(ActionEvent actionEvent, Button button, TextField textField, TextArea textArea);
    void tanTrig(ActionEvent actionEvent, Button button, TextField textField);
    void getSaveToFile(ActionEvent actionEvent, Button button, TextArea textArea);
}
