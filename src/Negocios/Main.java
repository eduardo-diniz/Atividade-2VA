/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author visitantere
 */
public class Main extends Application {

    public static void main(String[] args) {

        
        launch(args);
        
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/GUI/Tela.fxml"));
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
