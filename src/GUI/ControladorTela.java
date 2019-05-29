package GUI;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Negocios.Beans.Medalha;
import Negocios.Beans.Modalidade;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import Negocios.Controlador;
import Negocios.Fachada;
import com.sun.javafx.collections.ImmutableObservableList;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;

public class ControladorTela implements EventHandler<Event> {

    @FXML
    private Button btnAdd;

    @FXML
    void addMed(ActionEvent event) {

    }

    Controlador c = new Controlador();

    @FXML
    private TableView<Medalha> tblClass;

    @FXML
    private ChoiceBox<TipoDeMedalhas> boxTipo;

    @FXML
    private ChoiceBox<Modalidade> boxMod;

    @FXML
    private ChoiceBox<Pais> boxPais;

    ObservableList<Medalha> m = FXCollections.observableArrayList();

    public ObservableList<Medalha> getMedalha() {

        m.addAll(RepositorioDeMedalhas.getinstance().Listar());

        return m;

    }

    public void initialize() {

        boxTipo.getItems().addAll(TipoDeMedalhas.values());
        boxMod.getItems().addAll(Modalidade.values());
        boxPais.getItems().addAll(Pais.values());
        tblClass.setItems(getMedalha());
//btnAdd.onAc
        //tblClass.setItems(FXCollections.observableList(RepositorioDeMedalhas.getinstance().Listar()));

    }

    @Override
    public void handle(Event event) {
        System.out.println("Funcionando ");
        if (event.getSource().equals(btnAdd)) {
            System.out.println("Funcionando 2 ");

            try {
                //Tentando imprimir a tabela na GUI
                //System.out.println(boxTipo.getValue(). + boxMod.getValue().toString() + boxPais.getValue().toString());
                c.inserir(new Medalha(boxMod.getValue(), boxPais.getValue(), boxTipo.getValue()));
                System.out.println("teste ok");
                tblClass.getItems().add(new Medalha(boxMod.getValue(), boxPais.getValue(), boxTipo.getValue()));
                
                System.out.println(boxMod.getItems());

            } catch (ElementoJaExisteException e) {
                //   sysout3

                Alert a1 = new Alert(AlertType.INFORMATION);

                a1.setTitle("Erro");
                a1.setHeaderText("Medalha Não Adicionada");
                a1.setContentText("A Medalha que vc tentou adicionar já existe");
            }
        }
    }

}
