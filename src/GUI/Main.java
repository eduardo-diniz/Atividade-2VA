/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Exception.ElementoJaExisteException;
import Negocios.Beans.Medalha;
import Negocios.Beans.Modalidade;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import Negocios.Controlador;
import Negocios.Fachada;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author visitantere
 */
public class Main extends Application {

    public static void main(String[] args) {

        Medalha s = new Medalha(Modalidade.CURLING, Pais.ARG, TipoDeMedalhas.PRATA);

        try {
            Fachada.getinstance().inserir(s);
        }catch (ElementoJaExisteException k){
            
            
            
        }
        
        launch(args);
        

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Pane root = FXMLLoader.load(getClass().getResource("Tela.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
