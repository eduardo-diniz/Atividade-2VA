package Negocios.Beans;

import java.util.Objects;

public class Medalha {

    private Modalidade modalidade;
    private Pais pais;
    private TipoDeMedalhas tipoDeMedalhas;

    public Medalha(Modalidade modalidade, Pais pais, TipoDeMedalhas tipoDeMedalhas) {

        this.modalidade = modalidade;
        this.pais = pais;
        this.tipoDeMedalhas = tipoDeMedalhas;

    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public Pais getPais() {
        return pais;
    }

    public TipoDeMedalhas getTipoDeMedalhas() {
        return tipoDeMedalhas;
    }

    @Override
    public boolean equals(Object obj) {

        boolean resultado = false;

        if (obj instanceof Medalha) {
            Medalha m = (Medalha) obj;
            if (this.modalidade.equals(m.getModalidade())) {

                resultado = true;
            }
        }
        return resultado;

    }

}
