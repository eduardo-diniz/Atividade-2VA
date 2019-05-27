package Negocios.Beans;

import java.util.Objects;

public class Medalha {

private Modalidade modalidade;	
private Pais pais;
private TipoDeMedalhas tipoDeMedalhas;



    @Override
    public boolean equals(Object obj) {
       
        boolean resultado = false;
        
        if (obj instanceof Medalha) {
            Medalha m = (Medalha) obj;
            if (this.modalidade.equals(m.modalidade.getNomeModalidade())){
                
                resultado = true;
            }
        }
    return resultado;
       
    }

   


}