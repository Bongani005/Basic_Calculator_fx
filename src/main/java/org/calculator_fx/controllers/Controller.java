package org.calculator_fx.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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


    public void padNumberFunction(ActionEvent actionEvent) {
        Pad_Number_Functions.getInstance().padFunction(actionEvent,one,textField,"1");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,two,textField,"2");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,three,textField,"3");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,four,textField,"4");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,five,textField,"5");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,six,textField,"6");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,seven,textField,"7");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,eight,textField,"8");
        Pad_Number_Functions.getInstance().padFunction(actionEvent,nine,textField,"9");
        Pad_Number_Functions.getInstance().padZero(actionEvent,zero,textField,"0");
        Pad_Number_Functions.getInstance().padDot(actionEvent,dot,textField,".");
    }


    public void radioOff(ActionEvent actionEvent) {
        Pad_Number_Functions.getInstance().padDisableField(switch_OFF);
    }

    public void addFunction(ActionEvent actionEvent) {
        Operator_Functions.getInstance().addPlus(actionEvent,plus,textField);
        Operator_Functions.getInstance().subtract(actionEvent,subtract,textField);
        Operator_Functions.getInstance().multiple(actionEvent,multiple,textField);
        Operator_Functions.getInstance().divide(actionEvent,divide,textField);
        Operator_Functions.getInstance().equals(actionEvent,equals,textField,textarea_history);

    }


    public void clearFunction(ActionEvent actionEvent) {
        Pad_Number_Functions.getInstance().clearScreen(actionEvent,clear_text_field,textField);
    }

    public void bacspaceFunction(ActionEvent actionEvent) {
    }

    public void clearHistory(ActionEvent actionEvent) {
        Pad_Number_Functions.getInstance().clearHistory(actionEvent,clear_tex_area,textarea_history);
    }

    public void tanTrig(ActionEvent actionEvent) {
        Operator_Functions.getInstance().tanTrig(actionEvent,tan_function,textField);
    }

    public void saveHistory(ActionEvent actionEvent) {
        Save.getInstance().saveToFile(actionEvent,save_history,textarea_history);
    }

}
