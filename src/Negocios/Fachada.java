/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Negocios.Beans.Medalha;
import java.util.ArrayList;


/**
 *
 * @author visitantere
 */
public class Fachada {

    private static Fachada instance;

    private Controlador meda;
    

private Fachada(){
    
    this.meda = new Controlador(RepositorioDeMedalhas.getinstance());
    
}

public static Fachada getinstance() {

        if (instance == null) {
            instance = new Fachada();
                
        }        
              return instance;


}



    
public void inserir(Medalha med) throws  ElementoJaExisteException{
    
    RepositorioDeMedalhas.getinstance().inserir(med);
}
}
