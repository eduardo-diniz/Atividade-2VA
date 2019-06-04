package Negocios.Beans;

public enum TipoDeMedalhas {

    OURO("Ouro"),
    PRATA("Prata"),
    BRONZE("Bronze");

    private String nomeMedalha;

    TipoDeMedalhas(String nome) {

        this.nomeMedalha = nome;

    }

    public String getNomeMedalha() {
        return nomeMedalha;
    }

}
