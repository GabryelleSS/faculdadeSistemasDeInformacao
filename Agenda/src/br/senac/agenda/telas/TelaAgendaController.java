package br.senac.agenda.telas;

import br.senac.agenda.modelo.Contato;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaAgendaController {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtTelephone;
    
    // Aqui eh o tipo da List que aumenta o tamanho conforme eh populado.
    private List<Contato> listaContato = new ArrayList();
    @FXML
    private TableView<Contato> tableContats;
    @FXML
    private TableColumn<String, String> tableName;
    @FXML
    private TableColumn<String, String> tableTelephone;
    
    @FXML
    public void initialize() {
        tableName.setCellValueFactory(
                new PropertyValueFactory("name")
        );
        
        tableTelephone.setCellValueFactory(
                new PropertyValueFactory("telephone")
        );
        
        tableContats.setItems(
                FXCollections.observableArrayList(listaContato)
        );
        
    }

    @FXML
    private void btnSaveInfo(ActionEvent event) {
        Contato contato = new Contato();
        
        contato.setName(txtName.getText());
        contato.setTelephone(txtTelephone.getText());
        
        listaContato.add(contato);
    }

    @FXML
    private void btnClear(ActionEvent event) {
        txtName.setText("");
        txtTelephone.setText("");
    }

    @FXML
    private void btnCharge(ActionEvent event) {
        tableContats.setItems(
                FXCollections.observableArrayList(listaContato)
        );
    }
}
