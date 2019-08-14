package br.senac.javafxapp.telas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class TelaInicialController {

    @FXML
    private Text txtMensagem;
    
    @FXML
    private TextArea textName;

    @FXML
    private void handleBtnAction(ActionEvent event) {
        txtMensagem.setText("Olá, " + textName.getText());
    }
}
