package br.senac.javafxapp2.telas;

import java.awt.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;

public class TelaTesteController {

    @FXML
    private Label lblTextModification;
    @FXML
    private TitledPane painelOpenClose;
   
    @FXML
    private void btnModification(javafx.event.ActionEvent event) {
        String label = lblTextModification.getText();
        lblTextModification.setText(label + " modificada");
    }

    @FXML
    private void btnOpenClose(javafx.event.ActionEvent event) {
        Boolean verificacao = painelOpenClose.isExpanded();
        
        if(verificacao) {
            painelOpenClose.setText("Estou fechado");
            painelOpenClose.setExpanded(false);
        } 
        else {
            painelOpenClose.setText("Estou aberto");
            painelOpenClose.setExpanded(true);
        }
    }
}
