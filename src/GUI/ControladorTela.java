package GUI;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Negocios.Beans.Medalha;
import Negocios.Beans.Modalidade;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import Negocios.Controlador;
import Negocios.Fachada;
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

    Fachada f = Fachada.getinstance();

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

        tblClass.setItems(getMedalha());
        boxTipo.getItems().addAll(TipoDeMedalhas.values());
        boxMod.getItems().addAll(Modalidade.values());
        boxPais.getItems().addAll(Pais.values());
        //btnAdd.onAc
        
                tblClass.setItems(FXCollections.observableList(RepositorioDeMedalhas.getinstance().Listar()));

    }

    @Override
    public void handle(Event event) {
        if (event.getSource().equals(btnAdd)) {
            try {
                f.inserir(new Medalha(boxMod.getValue(), boxPais.getValue(), boxTipo.getValue()));
                tblClass.setItems(FXCollections.observableList(RepositorioDeMedalhas.getinstance().Listar()));
            } catch (ElementoJaExisteException e) {

                Alert a1 = new Alert(AlertType.INFORMATION);

                a1.setTitle("Erro");
                a1.setHeaderText("Medalha Não Adicionada");
                a1.setContentText("A Medalha que vc tentou adicionar já existe");
            }
        }
    }

}
