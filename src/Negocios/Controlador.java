package Negocios;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Negocios.Beans.Medalha;


//Esboço do controlador
public class Controlador {

    private  RepositorioDeMedalhas repositorioMedalhas;
    
    
    
    public Controlador(RepositorioDeMedalhas r){
        
        this.repositorioMedalhas = r;
        
        
    }
    public void inserir(Medalha med) throws  ElementoJaExisteException{
    
    RepositorioDeMedalhas.getinstance().inserir(med);
}
    
    
    
}
