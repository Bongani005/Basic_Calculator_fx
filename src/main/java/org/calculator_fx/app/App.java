package org.calculator_fx.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.calculator_fx.controllers.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.sun.javafx.scene.control.skin.Utils.getResource;
import static javafx.fxml.FXMLLoader.getDefaultClassLoader;
import static javafx.fxml.FXMLLoader.load;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String location = "src/main/java/org/calculator_fx/view/calculator_design.fxml";
        FXMLLoader loading = new FXMLLoader();
        Parent root = loading.load(new FileInputStream(location));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }
}
