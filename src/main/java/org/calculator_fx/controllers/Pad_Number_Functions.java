package org.calculator_fx.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Pad_Number_Functions{
    private static Pad_Number_Functions instance = new Pad_Number_Functions();
    private Pad_Number_Functions(){}
    public static Pad_Number_Functions getInstance(){
        return instance;
    }

    public void padFunction(ActionEvent actionEvent, Button button, TextField field, String name) {
        if(actionEvent.getSource() == button){
            field.setText(field.getText().concat(name));
        }
    }

    public void padZero(ActionEvent actionEvent, Button button, TextField field, String name) {
        if(actionEvent.getSource() == button){
            if(field.getText().equals(""))
                field.setText(name);
            else
                field.setText(field.getText().concat(name));
        }
    }

    public void padDot(ActionEvent actionEvent, Button button, TextField field, String name) {
        if(actionEvent.getSource() == button){
            if(field.getText().equals(""))
                field.setText("0"+name);
            else {
                if(!field.getText().isEmpty())
                    field.setText(field.getText());
                else if(field.getText().equals(field.getText()))
                    field.setText(field.getText().concat(name));
            }
        }
    }

    public void padEnableField(ActionEvent actionEvent, RadioButton radioButton, TextField field){
        if(actionEvent.getSource() == radioButton){
            field.setEditable(true);
        }
    }

    public void padDisableField(RadioButton radioButton){
        if(radioButton.isSelected()){
            System.exit(0);
        }
    }

    public void clearScreen(ActionEvent actionEvent, Button button, TextField textField){
        if(actionEvent.getSource() == button){
            textField.setText("");
        }
    }

    public void clearHistory(ActionEvent actionEvent, Button button, TextArea area){
        if(actionEvent.getSource() == button){
            area.setText("");
        }
    }
}
