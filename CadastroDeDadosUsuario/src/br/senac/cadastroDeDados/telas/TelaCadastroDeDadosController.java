package br.senac.cadastroDeDados.telas;

import br.senac.cadastroDeDados.modelo.User;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaCadastroDeDadosController {

    @FXML
    private TextField fieldFirstName;
    @FXML
    private TextField fieldLastName;
    @FXML
    private TextField fieldAddress;
    @FXML
    private TextField fieldPhone;
    
    String firstName;
    String lastName;
    String address;
    String phone;
    
    private List<User> tableDatas = new ArrayList();
    
    @FXML
    private TableColumn<User, String> tableName;
    @FXML
    private TableColumn<User, String> tableAddress;
    @FXML
    private TableColumn<User, String> tablePhone;

    @FXML
    private void btnSaveData(javafx.event.ActionEvent event) {
        firstName = fieldFirstName.getText();
        lastName = fieldLastName.getText();
        address = fieldAddress.getText();
        phone = fieldPhone.getText();
        
        System.out.print(firstName);
    }

    @FXML
    private void btnDisplayData(javafx.event.ActionEvent event) {
        User user = new User();
    }

    @FXML
    private void btnClear(javafx.event.ActionEvent event) {
        fieldFirstName.setText("");;
        fieldLastName.setText("");
        fieldAddress.setText("");
        fieldPhone.setText("");
    }
    
    public void initialize() {
        tableName.setCellValueFactory(
                new PropertyValueFactory("name")
        );
        
        tableAddress.setCellValueFactory(
                new PropertyValueFactory("telephone")
        );
        
//        tablePhone.setItems(
//                FXCollections.observableArrayList(tableDatas)
//        );
    }

}
