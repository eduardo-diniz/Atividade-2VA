package GUI;

import Dados.RepositorioDeMedalhas;
import Exception.ElementoJaExisteException;
import Exception.ElementoNaoAtualizavelException;
import Exception.ElementoNaoExisteException;
import Negocios.Beans.Medalha;
import Negocios.Beans.Modalidade;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import Negocios.Controlador;
import Negocios.Fachada;
import com.sun.javafx.collections.ImmutableObservableList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import Negocios.CompararPaises;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ControladorTela implements EventHandler<Event> {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnRem;

    @FXML
    private Button btnAtt;

    Controlador c = new Controlador();

    @FXML
    private TableColumn<Medalha, Pais> pais;

    @FXML
    private TableColumn<Medalha, Modalidade> mod;

    @FXML
    private TableColumn<Medalha, TipoDeMedalhas> med;

    @FXML
    private TableView<Medalha> tblClass;

    @FXML
    private ComboBox<Pais> boxPais2;

    @FXML
    private ChoiceBox<Modalidade> boxMod;

    @FXML
    private ChoiceBox<Pais> boxPais;

    @FXML
    private Button btnLMod;

    @FXML
    private Button btnLPaises;

    @FXML
    private Text nOuro;

    @FXML
    private Text nPrata;

    @FXML
    private Text nBronze;
    
     @FXML
    private ComboBox<TipoDeMedalhas> boxTipo;
     
     
    @FXML
    private ImageView corMedalha;

    ObservableList<Medalha> m = FXCollections.observableArrayList();

    public ObservableList<Medalha> getMedalha() {

        m.addAll(RepositorioDeMedalhas.getinstance().Listar());

        return m;

    }

    public void initialize() {

        boxTipo.getItems().addAll(TipoDeMedalhas.values());
        boxMod.getItems().addAll(Modalidade.values());
        boxPais.getItems().addAll(Pais.values());
        boxPais2.getItems().addAll(Pais.values());

        pais.setCellValueFactory(new PropertyValueFactory<>("pais"));
        mod.setCellValueFactory(new PropertyValueFactory<>("modalidade"));
        med.setCellValueFactory(new PropertyValueFactory<>("tipoDeMedalhas"));

        tblClass.setItems(FXCollections.observableList(c.Listar()));

    }

    @Override
    public void handle(Event event) {

        System.out.println("Funcionando o Handle");
        if (event.getSource().equals(btnAdd)) {
            System.out.println("Funcionando o botão adcionar ");

            try {
                //Tentando imprimir a tabela na GUI
                //System.out.println(boxTipo.getValue(). + boxMod.getValue().toString() + boxPais.getValue().toString());

                c.inserir(new Medalha(boxMod.getValue(), boxPais.getValue(), boxTipo.getValue()));

                System.out.println("Funcionando inserção de medalhas");
                //tblClass.setItems((ObservableList<Medalha>) new Medalha(boxMod.getValue(), boxPais.getValue(), boxTipo.getValue()));
                tblClass.setItems(FXCollections.observableList(c.Listar()));

                // System.out.println(boxMod.getItems());
            } catch (ElementoJaExisteException e) {

                Alert a1 = new Alert(Alert.AlertType.ERROR);

                a1.setTitle("Erro");
                a1.setHeaderText("Medalha Não Adicionada");
                a1.setContentText("A Medalha que vc tentou adicionar já existe");
                a1.showAndWait();
            }
        }
        if (event.getSource().equals(btnRem)) {

            try {

                c.remover(new Medalha(boxMod.getValue(), boxPais.getValue(), boxTipo.getValue()));

                tblClass.setItems(FXCollections.observableList(c.Listar()));

            } catch (ElementoNaoExisteException mm) {
                Alert a2 = new Alert(Alert.AlertType.ERROR);

                a2.setTitle("Erro");
                a2.setHeaderText("Medalha Não Removida");
                a2.setContentText("A Medalha que vc tentou remover não existe");
                a2.showAndWait();
            }

        }
        if (event.getSource().equals(btnAtt)) {

            try {
                c.atualizar(new Medalha(boxMod.getValue(), boxPais.getValue(), boxTipo.getValue()));
                tblClass.refresh();
                // tblClass.setItems(FXCollections.observableList(c.Listar()));

            } catch (ElementoNaoAtualizavelException ex) {

                Alert a3 = new Alert(Alert.AlertType.ERROR);

                a3.setTitle("Erro");
                a3.setHeaderText("Medalha Não Removida");
                a3.setContentText("A Medalha que vc tentou atualizar não existe");
                a3.showAndWait();
            }
        }

        if (event.getSource().equals(btnLMod)) {

            c.ordenarModalidade();
            tblClass.refresh();

        }
        if (event.getSource().equals(btnLPaises)) {

            c.ordenarPaises();

            tblClass.refresh();

        }
        if (event.getSource().equals(boxPais2)) {
            if (boxPais2.getSelectionModel().getSelectedItem() != null) {
                int ouro = c.contatorMedalhas(boxPais2.getSelectionModel().getSelectedItem(), TipoDeMedalhas.OURO);
                nOuro.setText("Ouro" + ouro);
                int prata = c.contatorMedalhas(boxPais2.getSelectionModel().getSelectedItem(), TipoDeMedalhas.PRATA);
                nPrata.setText("Prata" + prata);
                int bronze = c.contatorMedalhas(boxPais2.getSelectionModel().getSelectedItem(), TipoDeMedalhas.BRONZE);
                nBronze.setText("Bronze" + bronze);
            }

        } if (event.getSource().equals(boxMod)){
            if (boxMod.getSelectionModel().getSelectedItem() !=null){
                
                corMedalha.setImage(new Image (New    "ouro.png"));
                
            }
            
        }
    }

}