package Negocios;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Exception.ElementoNaoAtualizavelException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import java.util.Collections;
import java.util.List;

public class Controlador {
    
   
    
    private RepositorioDeMedalhas repositorioMedalhas;
    
    public Controlador() {
        
        this.repositorioMedalhas = RepositorioDeMedalhas.getinstance();
        
    }

    public void inserir(Medalha med) throws ElementoJaExisteException {
        
        repositorioMedalhas.getinstance().inserir(med);
    }
    
    public List Listar() {
        
        return repositorioMedalhas.getinstance().Listar();
        
    }
    
    public void atualizar(Medalha medAtualizada) throws ElementoNaoAtualizavelException {
        
    repositorioMedalhas.getinstance().atualizar(medAtualizada);
    }
    
    public void remover(Medalha medalhaRem) throws ElementoNaoExisteException {
        
        repositorioMedalhas.remover(medalhaRem);
        
    }
    
     public String toString(Medalha medalha) {
        return toString();
    }
     
     
     public void ordenarModalidade(){
         
         repositorioMedalhas.ordenarModalidade();
         
     }
     
     public List ordenarPaises(){
         
         
        return repositorioMedalhas.ordenarPaises();
     }
     
     public int contatorMedalhas(Pais pais, TipoDeMedalhas tipo){
             return repositorioMedalhas.contatorMedalhas(pais, tipo);
     }
  
             
             
}
