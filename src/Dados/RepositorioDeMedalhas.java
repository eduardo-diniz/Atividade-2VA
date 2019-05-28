package Dados;

import Exception.ElementoJaExisteException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
import com.sun.javafx.UnmodifiableArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
        if (med != null && !this.medalha.contains(med)) {
            
            throw new ElementoJaExisteException(med);
            
        } else {
            
            medalha.add(med);
        }

        }
 

    public List Listar() {

        return Collections.unmodifiableList(medalha);
    }

    public void atualizar(Medalha medNova) throws ElementoJaExisteException {

        if (this.medalha.contains(medNova)) {
            int indice = this.medalha.indexOf(medNova);
            this.medalha.set(indice, medNova);
        } else {

            throw new ElementoJaExisteException(medNova);
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
