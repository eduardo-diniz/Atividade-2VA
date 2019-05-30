package Dados;

import Exception.ElementoJaExisteException;
import Exception.ElementoNaoAtualizavelException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
import com.sun.javafx.UnmodifiableArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositorioDeMedalhas {

    private ArrayList<Medalha> medalha;

    private static RepositorioDeMedalhas instance;

    private RepositorioDeMedalhas() {

        this.medalha = new ArrayList<Medalha>();

    }

    public static RepositorioDeMedalhas getinstance() {

        if (instance == null) {
            RepositorioDeMedalhas.instance = new RepositorioDeMedalhas();

        } 
        return instance;

    }
    
    

    public void inserir(Medalha med) throws  ElementoJaExisteException {
        
        if (this.medalha.contains(med)) {
            
            throw new ElementoJaExisteException(med);
            
        } else if (med == null){
            
            System.out.println("ERRRO NULL POINT");
            
        }else{
            this.medalha.add(med);
            System.out.println("medalha inserida com sucesso");
        }

        }

    public List<Medalha> Listar() {

        return Collections.unmodifiableList(medalha);
    }

    public void atualizar(Medalha medAtualizada) throws ElementoNaoAtualizavelException {

        if (this.medalha.contains(medAtualizada)) {
            int indice = this.medalha.indexOf(medAtualizada);
            System.out.println(indice);
            this.medalha.set(indice, medAtualizada);
        } else {

            throw new ElementoNaoAtualizavelException(medAtualizada);
        }

    }

    public void remover(Medalha medalhaRem) throws ElementoNaoExisteException {

        if  (this.medalha.contains(medalhaRem)) {
            this.medalha.remove(medalhaRem);

        } else {

            throw new ElementoNaoExisteException(medalhaRem);

        }

    }

}
