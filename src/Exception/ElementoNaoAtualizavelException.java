/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import Negocios.Beans.Medalha;

/**
 *
 * @author Eduardo
 */
public class ElementoNaoAtualizavelException extends Exception {

    private Medalha qualquerMedalha;

    public ElementoNaoAtualizavelException(Medalha me) {

        super("O elemento não foi atualizado");

        this.qualquerMedalha = me;
    }

    public void setQualquerMedalha(Medalha qualquerMedalha) {
        this.qualquerMedalha = qualquerMedalha;
    }

    public Medalha getQualquerMedalha() {
        return qualquerMedalha;
    }

}
