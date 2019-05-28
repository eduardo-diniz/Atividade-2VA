/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import Negocios.Beans.*;

/**
 *
 * @author Eduardo
 */
public class ElementoNaoExisteException extends Exception {

    private Medalha medalhaQualquer;

    public ElementoNaoExisteException(Medalha m) {
        super("Elemento não existe");
        this.medalhaQualquer = m;

    }

    public Medalha getMedalhaQualquer() {
        return medalhaQualquer;
    }

    public void setMedalhaQualquer(Medalha medalhaQualquer) {
        this.medalhaQualquer = medalhaQualquer;
    }

}
