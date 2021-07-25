package org.calculator_fx.controllers.business;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.calculator_fx.controllers.requestresponse.GetRequestResponse;

public class OperatorFunctionIMPL implements OperatorFunction{

    private double num1;
    private double num2;
    private char operator;

    public void addPlus(ActionEvent actionEvent, Button button, TextField textField){
        if(actionEvent.getSource() == button) {
            setNum1(Double.parseDouble(textField.getText()));
            operator ='+';
            textField.setText("");
        }

    }

    public void subtract(ActionEvent actionEvent, Button button, TextField textField){
        if(actionEvent.getSource() == button) {
            setNum1(Double.parseDouble(textField.getText()));
            operator ='-';
            textField.setText("");
        }
    }

    public void divide(ActionEvent actionEvent, Button button, TextField textField){
        if(actionEvent.getSource() == button) {
            setNum1(Double.parseDouble(textField.getText()));
            operator ='/';
            textField.setText("");
        }
    }

    public void multiple(ActionEvent actionEvent, Button button, TextField textField){
        if(actionEvent.getSource() == button) {
            setNum1(Double.parseDouble(textField.getText()));
            operator ='*';
            textField.setText("");
        }
    }

    public void equals(ActionEvent actionEvent, Button button,TextField textField){
        double result = 0.0;
        if(actionEvent.getSource() == button){
            setNum2(Double.parseDouble(textField.getText()));
            switch (operator){
                case '+':
                    result = getNum1()+getNum2();
                    break;
                case '-':
                    result = getNum1()-getNum2();
                    break;
                case '*':
                    result = getNum1()*getNum2();
                    break;
                case '/':
                    result = getNum1()/getNum2();
                    break;
                default:
                    textField.setText("Invalid");
                    break;
            }
            textField.setText(String.valueOf(result));
        }
    }
    public void equals(ActionEvent actionEvent, Button button, TextField textField, TextArea textArea){
        double result = 0.0;
        if(actionEvent.getSource() == button){
            setNum2(Double.parseDouble(textField.getText()));
            switch (operator){
                case '+':
                    result = getNum1()+getNum2();
                    break;
                case '-':
                    result = getNum1()-getNum2();
                    break;
                case '*':
                    result = getNum1()*getNum2();
                    break;
                case '/':
                    result = getNum1()/getNum2();
                    break;
                default:
                    textField.setText("Invalid");
                    break;
            }
            textField.setText(String.valueOf(result));
            textArea.appendText(getNum1()+" "+operator+" "+getNum2()+" = "+textField.getText()+"\n");
        }
    }

    public void tanTrig(ActionEvent actionEvent, Button button, TextField textField){
        if(actionEvent.getSource() == button) {
            setNum1(Double.parseDouble(textField.getText()));
            textField.setText("");
            double value = Math.tan(getNum1());
            textField.setText(String.valueOf(value));
        }
    }

    @Override
    public void getSaveToFile(ActionEvent actionEvent, Button button, TextArea textArea) {
        GetRequestResponse getRequestResponse = new GetRequestResponse();
        getRequestResponse.setSaveToFileIMPL(actionEvent, button, textArea);
    }

    private double getNum1() {
        return num1;
    }

    private void setNum1(double num1) {
        this.num1 = num1;
    }

    private double getNum2() {
        return num2;
    }

    private void setNum2(double num2) {
        this.num2 = num2;
    }

}
