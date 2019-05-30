/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Exception.ElementoNaoAtualizavelException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitantere
 */
public class Fachada {

    private static Fachada instance;

    private Controlador meda;

    private Fachada() {

        this.meda = new Controlador();

    }

    public static Fachada getinstance() {

        if (instance == null) {
            instance = new Fachada();

        }
        return instance;

    }

    public void inserir(Medalha med) throws ElementoJaExisteException {

        meda.inserir(med);

    }

    public List Listar() {

        return meda.Listar();

    }
    
    
    public void remover (Medalha medalhaRem) throws ElementoNaoExisteException {
        
         meda.remover(medalhaRem);
        
    }
    
    public void atualizar (Medalha  medAtualizada) throws ElementoNaoAtualizavelException {
    
        
        meda.atualizar(medAtualizada);
        
    }
    
    
}
