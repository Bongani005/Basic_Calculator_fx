package org.calculator_fx.controllers.services;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.calculator_fx.controllers.business.OperatorFunction;
import org.calculator_fx.controllers.business.OperatorFunctionIMPL;
import org.calculator_fx.controllers.business.StaticPadFunction;
import org.calculator_fx.controllers.business.StaticPadFunctionIMPL;

public class StaticPaFunctionServicesIMPL implements StaticPaFunctionServices{

    private StaticPadFunction staticPadFunction = new StaticPadFunctionIMPL();


    private OperatorFunction operatorFunction = new OperatorFunctionIMPL();

    @Override
    public void padFunction(ActionEvent actionEvent, Button button, TextField field, String name) {
        staticPadFunction.padFunction(actionEvent, button, field, name);
    }

    @Override
    public void padZero(ActionEvent actionEvent, Button button, TextField field, String name) {
        staticPadFunction.padZero(actionEvent, button, field, name);
    }

    @Override
    public void padDot(ActionEvent actionEvent, Button button, TextField field, String name) {
        staticPadFunction.padDot(actionEvent, button, field, name);
    }

    @Override
    public void padEnableField(ActionEvent actionEvent, RadioButton radioButton, TextField field) {
        staticPadFunction.padEnableField(actionEvent, radioButton, field);
    }

    @Override
    public void padDisableField(RadioButton radioButton) {
        staticPadFunction.padDisableField(radioButton);
    }

    @Override
    public void clearScreen(ActionEvent actionEvent, Button button, TextField textField) {
        staticPadFunction.clearScreen(actionEvent, button, textField);
    }

    @Override
    public void clearHistory(ActionEvent actionEvent, Button button, TextArea area) {
        staticPadFunction.clearHistory(actionEvent, button, area);
    }

    @Override
    public void addPlus(ActionEvent actionEvent, Button button, TextField textField) {
        operatorFunction.addPlus(actionEvent, button, textField);
    }

    @Override
    public void subtract(ActionEvent actionEvent, Button button, TextField textField) {
        operatorFunction.subtract(actionEvent, button, textField);
    }

    @Override
    public void divide(ActionEvent actionEvent, Button button, TextField textField) {
        operatorFunction.divide(actionEvent, button, textField);
    }

    @Override
    public void multiple(ActionEvent actionEvent, Button button, TextField textField) {
        operatorFunction.multiple(actionEvent, button, textField);
    }

    @Override
    public void equals(ActionEvent actionEvent, Button button, TextField textField, TextArea textArea) {
        operatorFunction.equals(actionEvent,button,textField,textArea);
    }

    @Override
    public void tanTrig(ActionEvent actionEvent, Button button, TextField textField) {
        operatorFunction.tanTrig(actionEvent, button, textField);
    }

    @Override
    public void getSaveToFile(ActionEvent actionEvent, Button button, TextArea textArea) {
        operatorFunction.getSaveToFile(actionEvent, button, textArea);
    }
}
