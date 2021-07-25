package org.calculator_fx.controllers.requestresponse;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import lombok.Data;
import org.calculator_fx.model.dao.SaveToFileIMPL;
import org.calculator_fx.model.manager.DataManager;


public class GetRequestResponse {
    public void setSaveToFileIMPL(ActionEvent actionEvent, Button button, TextArea textArea){
        DataManager.getInstance().saveToFile(actionEvent, button, textArea);
    }
}
