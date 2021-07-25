package org.calculator_fx.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.calculator_fx.controllers.services.StaticPaFunctionServices;
import org.calculator_fx.controllers.services.StaticPaFunctionServicesIMPL;

public class Controller {
    public TextField textField;
    public RadioButton switch_ON;
    public RadioButton switch_OFF;
    public Button percentage;
    public Button clear_text_field;
    public Button backspace;
    public Button fraction;
    public Button tan_function;
    public Button sin_function;
    public Button log_function;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button multiple;
    public Button four;
    public Button five;
    public Button six;
    public Button divide;
    public Button one;
    public Button two;
    public Button three;
    public Button subtract;
    public Button dot;
    public Button zero;
    public Button plus;
    public Button equals;
    public TextArea textarea_history;
    public Button clear_tex_area;
    public Button save_history;


    private StaticPaFunctionServices services = new StaticPaFunctionServicesIMPL();


    public void padNumberFunction(ActionEvent actionEvent) {
        services.padFunction(actionEvent,one,textField,"1");
        services.padFunction(actionEvent,two,textField,"2");
        services.padFunction(actionEvent,three,textField,"3");
        services.padFunction(actionEvent,four,textField,"4");
        services.padFunction(actionEvent,five,textField,"5");
        services.padFunction(actionEvent,six,textField,"6");
        services.padFunction(actionEvent,seven,textField,"7");
        services.padFunction(actionEvent,eight,textField,"8");
        services.padFunction(actionEvent,nine,textField,"9");
        services.padZero(actionEvent,zero,textField,"0");
        services.padDot(actionEvent,dot,textField,".");
    }


    public void radioOff(ActionEvent actionEvent) {
        services.padDisableField(switch_OFF);
    }

    public void addFunction(ActionEvent actionEvent) {
        services.addPlus(actionEvent,plus,textField);
        services.subtract(actionEvent,subtract,textField);
        services.multiple(actionEvent,multiple,textField);
        services.divide(actionEvent,divide,textField);
        services.equals(actionEvent,equals,textField,textarea_history);

    }


    public void clearFunction(ActionEvent actionEvent) {
        services.clearScreen(actionEvent,clear_text_field,textField);
    }

    public void bacspaceFunction(ActionEvent actionEvent) {
    }

    public void clearHistory(ActionEvent actionEvent) {
        services.clearHistory(actionEvent,clear_tex_area,textarea_history);
    }

    public void tanTrig(ActionEvent actionEvent) {
        services.tanTrig(actionEvent,tan_function,textField);
    }

    public void saveHistory(ActionEvent actionEvent) {
        services.getSaveToFile(actionEvent,save_history,textarea_history);
    }

}
