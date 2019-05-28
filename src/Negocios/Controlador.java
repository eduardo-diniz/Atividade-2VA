package Negocios;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
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
    
    public void atualizar(Medalha medNova) throws ElementoJaExisteException {
        
        repositorioMedalhas.getinstance().atualizar(medNova);
    }
    
    public void remover(Medalha medalhaRem) throws ElementoNaoExisteException {
        
        repositorioMedalhas.remover(medalhaRem);
        
    }
    
}
