package org.calculator_fx.model.dao;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.*;

public class SaveToFileIMPL implements SaveToFile{

    public void saveToFile(ActionEvent actionEvent, Button button,TextArea textArea){
        if(actionEvent.getSource() == button) {
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("doc.txt")))) {
                stringBuilder.append(textArea.getText());
                out.write("\n"+stringBuilder.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
