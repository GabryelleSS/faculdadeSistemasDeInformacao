package br.senac.javafxapp.tela;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaController {

    @FXML
    private TextField campoResultado;
    @FXML
    private TextField campoValorA;
    @FXML
    private TextField campoValorB;

    @FXML
    private void btnDivisao(ActionEvent event) {
        String campoNumbA = campoValorA.getText();
        String campoNumbB = campoValorB.getText();
        
        Double campoNumbATratadoA = Double.parseDouble(campoNumbA);
        Double campoNumbATratadoB = Double.parseDouble(campoNumbB);
        
        Double resultado = campoNumbATratadoA / campoNumbATratadoB;
        campoResultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnMultiplicacao(ActionEvent event) {
        String campoNumbA = campoValorA.getText();
        String campoNumbB = campoValorB.getText();
        
        Double campoNumbATratadoA = Double.parseDouble(campoNumbA);
        Double campoNumbATratadoB = Double.parseDouble(campoNumbB);
        
        Double resultado = campoNumbATratadoA * campoNumbATratadoB;
        campoResultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnAdicao(ActionEvent event) {
        String campoNumbA = campoValorA.getText();
        String campoNumbB = campoValorB.getText();
        
        Double campoNumbATratadoA = Double.parseDouble(campoNumbA);
        Double campoNumbATratadoB = Double.parseDouble(campoNumbB);
        
        Double resultado = campoNumbATratadoA + campoNumbATratadoB;
        campoResultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnSubtracao(ActionEvent event) {
        String campoNumbA = campoValorA.getText();
        String campoNumbB = campoValorB.getText();
        
        Double campoNumbATratadoA = Double.parseDouble(campoNumbA);
        Double campoNumbATratadoB = Double.parseDouble(campoNumbB);
        
        Double resultado = campoNumbATratadoA - campoNumbATratadoB;
        campoResultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnClear(ActionEvent event) {
        campoValorA.setText("");
        campoValorB.setText("");
        campoResultado.setText("");
    }

    @FXML
    private void btnIgual(ActionEvent event) {
    }
    
}
