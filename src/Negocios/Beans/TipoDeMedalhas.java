package Negocios.Beans;

public enum TipoDeMedalhas {

OURO ("Ouro"),
PRATA("Prata"),
BRONZE("Bronze");

private String nomeMedalha;

TipoDeMedalhas (String nome){
    
    this.nomeMedalha = nomeMedalha;
    
}

    public String getNomeMedalha() {
        return nomeMedalha;
    }

    
}

