
package Negocios;

import Negocios.Beans.Medalha;
import Negocios.Beans.Pais;
import java.util.Comparator;

/**
 *
 * @author visitantere
 */
public class CompararPaises implements Comparator<Medalha>{

  

    @Override
    public int compare(Medalha t, Medalha t1) {
      return t.getPais().getNomePais().compareTo(t1.getPais().getNomePais());
        
    }
    
    
    
}
