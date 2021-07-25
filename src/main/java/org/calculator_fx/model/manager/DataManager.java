package org.calculator_fx.model.manager;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.calculator_fx.model.dao.SaveToFile;
import org.calculator_fx.model.dao.SaveToFileIMPL;

import javax.inject.Inject;

public class DataManager {
    private static DataManager instance = new DataManager();
    private DataManager(){}
    public static DataManager getInstance(){
        return instance;
    }

    private SaveToFile saveToFile = new SaveToFileIMPL();

    public void saveToFile(ActionEvent actionEvent, Button button, TextArea textArea){
        saveToFile.saveToFile(actionEvent, button, textArea);
    }
}
