package GUI;

import Dados.RepositorioDeMedalhas;
import Negocios.Beans.Medalha;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class ControladorTela {

    @FXML
    private Button btnAdd;

    @FXML
    void addMed(ActionEvent event) {

    }

    @FXML
    public void initialize() {

        tblClass.setItems(getMedalha());

    }
    @FXML
    private TableView<Medalha> tblClass;

    public ObservableList<Medalha> getMedalha() {

        ObservableList<Medalha> m = FXCollections.observableArrayList();
        m.addAll(RepositorioDeMedalhas.getinstance().Listar());
        return m;
    }

}
