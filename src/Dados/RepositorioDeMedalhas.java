package Dados;

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

        } else {

        }
        return instance;

    }

    //Falta implementar o metodo equals na classe medalha
    public void inserir(Medalha med) {
        if (!this.medalha.contains(med)) {
            if (!this.medalha.equals(med)) {
                medalha.add(med);
            } else {
                //Exceção

            }

        }
    }

    public List Listar() {

        return Collections.unmodifiableList(medalha);
    }

    public void atualizar(Medalha medNova) {

        if (this.medalha.contains(medNova)) {
            int indice = this.medalha.indexOf(medNova);
            this.medalha.set(indice, medNova);
        } else {

            //exceção throw new ElementoNaoExisteException
        }

    }

    public void remover(Medalha medalhaRem) throws ElementoNaoExisteException {

        if (this.medalha.contains(medalhaRem)) {
            this.medalha.remove(medalhaRem);

        } else {

            throw new ElementoNaoExisteException(medalhaRem);

        }

    }

}
