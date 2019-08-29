package br.senac.javafxapp2.telas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class TelaTesteController {

    @FXML
    private TextField txtValor1;
    @FXML
    private TextField txtValor2;
    private TextField txtValor3;
    @FXML
    private CheckBox checkboxUm;
    @FXML
    private CheckBox checkboxDois;
    @FXML
    private ToggleGroup estados;
    @FXML
    private Label lblnomeEstado;
    @FXML
    private RadioButton radioButtonUm;
    @FXML
    private RadioButton radioButtonDois;
    @FXML
    private ComboBox filmes;
    @FXML
    private TextField nomeFilme;
    @FXML
    private DatePicker date;
    
    @FXML
    public void btnMudaTexto(ActionEvent event) {
        String textoCaixaUm = txtValor1.getText();
        String textoCaixaDois = txtValor2.getText();
        
        txtValor3.setText(textoCaixaUm + " " + textoCaixaDois);
    }
    
    @FXML
    private void mudarCheckBoxUm(ActionEvent event) {
        boolean checkBox01 = checkboxUm.isSelected();
        
        if(checkBox01) {
            checkboxUm.setSelected(true);
            checkboxDois.setSelected(false);
        }
    }

    @FXML
    private void mudarCheckBoxDois(ActionEvent event) {
        boolean checkBox02 = checkboxDois.isSelected();
        
        if(checkBox02) {
            checkboxDois.setSelected(true);
            checkboxUm.setSelected(false);
        }
    }

    @FXML
    private void btnMudaEstado(ActionEvent event) {
        String radioBtnUm = radioButtonUm.getText();
        String radioBtnDois = radioButtonDois.getText();
        
        if(estados.getSelectedToggle() == radioButtonUm) {
            lblnomeEstado.setText(radioBtnUm);
        }
        else {
            lblnomeEstado.setText(radioBtnDois);
        }
    }
    
    @FXML
    private void initialize() {
        filmes.getItems().add("Star Wars");
        filmes.getItems().add("Harry Potter");
        filmes.getItems().add("Senhor dos Aneis");
    }

    @FXML
    private void btnMudaFilme(ActionEvent event) {
        if(filmes.getSelectionModel() 
                .getSelectedItem()
                .equals("Senhor dos Aneis")) {
            
            nomeFilme.setText("Senhor dos Aneis");
        }
        else {
            nomeFilme.setText("");
        }
    }

    @FXML
    private void btnSelecionaAData(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Data Selecionada");
        alert.setHeaderText("Aqui esta a mensagem que você selecionou:");
        
        alert.setContentText(date.getValue().toString());
        
        alert.showAndWait();
    }
    
    
}

        
        
