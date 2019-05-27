package Dados;

import Negocios.Beans.Medalha;
import com.sun.javafx.UnmodifiableArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RepositorioDeMedalhas {

    private ArrayList <Medalha> medalha;
    
    private static RepositorioDeMedalhas instance;
    
    private RepositorioDeMedalhas () {
        
        this.medalha = new ArrayList<Medalha>();
        
    }
    
    public static RepositorioDeMedalhas getinstance () {
        
        if (instance == null) 
        {
            RepositorioDeMedalhas.instance = new RepositorioDeMedalhas();
            
        } else 
        {
            
            
        }
        return instance;
        
    }
    //Falta implementar o metodo equals na classe medalha
    public void inserir (Medalha med){
        if (!this.medalha.contains(med)){
            
            medalha.add(med);
        }else {
            //Exceção
            
        }
        
    }
    
    public List Listar(){
        
        
        return Collections.unmodifiableList(medalha);
    }
    
    
    public void atualizar (Medalha medantiga, Medalha mednova){
        
        if (!this.medalha.contains(med)){
            this.medalha.set
                 
                
            
            
        }
        
    }
    
    
    public void remover (Medalha index){
        
        
        
    }
    }
    
    
            
}
