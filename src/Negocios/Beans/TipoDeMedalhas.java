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

/*@Override
    public boolean equals (Object obj){
        
        boolean igual = false;
        
        if (obj instanceof TipoDeMedalhas){
            
            TipoDeMedalhas t = (TipoDeMedalhas) obj;
            if (this.)
            
        }
        
    }*/
    
}

