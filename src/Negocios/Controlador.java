package Negocios;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Exception.ElementoNaoAtualizavelException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controlador {

    private RepositorioDeMedalhas repositorioMedalhas;
    private ArrayList<Pais> ranking;

    public Controlador() {

        this.repositorioMedalhas = RepositorioDeMedalhas.getinstance();
        this.ranking = new ArrayList<Pais>();
        for (Pais p : Pais.values()) {
            ranking.add(p);

        }

    }


    public void inserir(Medalha med) throws ElementoJaExisteException {

        RepositorioDeMedalhas.getinstance().inserir(med);
    }

    public List Listar() {

        return RepositorioDeMedalhas.getinstance().Listar();

    }

    public void atualizar(Medalha medAntiga, Medalha medNova) throws ElementoNaoAtualizavelException {

        RepositorioDeMedalhas.getinstance().atualizar(medAntiga, medNova);
    }

    public void remover(Medalha medalhaRem) throws ElementoNaoExisteException {

        repositorioMedalhas.remover(medalhaRem);

    }

    public String toString(Medalha medalha) {

        return toString();
    }

    public void ordenarModalidade() {

        repositorioMedalhas.ordenarModalidade();

    }

    public List ordenarPaises() {

        return repositorioMedalhas.ordenarPaises();
    }

    public int contatorMedalhas(Pais pais, TipoDeMedalhas tipo) {

        return repositorioMedalhas.contatorMedalhas(pais, tipo);
    }
    
    public int ranking (Pais p){
        int indice = 0;
        indice = ranking.indexOf(p) + 1;
        
        return indice;
    }

    public int atualizarRanking() {
//Desculpa professor
    AtualizarQuadroDeMedalhas fim = new AtualizarQuadroDeMedalhas();
        Collections.sort(ranking, fim);
        return 0;
    }

}
