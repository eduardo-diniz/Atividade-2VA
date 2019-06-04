package Dados;

/**
 *
 * @author Eduardo
 */
import Exception.ElementoJaExisteException;
import Exception.ElementoNaoAtualizavelException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import Negocios.CompararPaises;
import com.sun.javafx.UnmodifiableArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import static java.util.Objects.compare;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositorioDeMedalhas {

    private ArrayList<Medalha> medalha;

    private static RepositorioDeMedalhas instance;

    private RepositorioDeMedalhas() {

        this.medalha = new ArrayList<Medalha>();

    }

    public static RepositorioDeMedalhas getinstance() {

        if (instance == null) {
            RepositorioDeMedalhas.instance = new RepositorioDeMedalhas();

        }
        return instance;

    }

    public void inserir(Medalha med) throws ElementoJaExisteException {

        if (this.medalha.contains(med)) {

            throw new ElementoJaExisteException(med);

        } else if (med == null) {

        } else {
            this.medalha.add(med);

        }

    }

    public List<Medalha> Listar() {

        return Collections.unmodifiableList(medalha);
    }

    public void atualizar(Medalha medAntiga, Medalha medNova) throws ElementoNaoAtualizavelException {

        if (this.medalha.contains(medAntiga)
                && (!medalha.contains(medNova)
                || medAntiga.equals(medNova))) {
            int indice = this.medalha.indexOf(medAntiga);
            medalha.set(indice, medNova);
        } else {

            throw new ElementoNaoAtualizavelException(medAntiga);
        }

    }

    public void remover(Medalha medalhaRem) throws ElementoNaoExisteException {

        if (this.medalha.contains(medalhaRem) && (null != medalhaRem)) {

            this.medalha.remove(medalhaRem);

        } else {

            throw new ElementoNaoExisteException(medalhaRem);

        }

    }

    public void ordenarModalidade() {

        Collections.sort(medalha);

    }

    public List ordenarPaises() {

        CompararPaises compararpaises = new CompararPaises();

        Collections.sort(medalha, compararpaises);

        return medalha;

    }

    public int contatorMedalhas(Pais pais, TipoDeMedalhas tipo) {
        int resultado = 0;
        for (Medalha medalha : medalha) {
            if (medalha.getPais() == pais && medalha.getTipoDeMedalhas() == tipo) {
                resultado++;
            }
        }
        return resultado;
    }

}
