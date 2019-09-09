package br.senac.adivinheNumero.telas;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JogoAdivinhacaoController {

    @FXML
    private Label attempts;
    @FXML
    private Label totalChances;
    @FXML
    private TextField numberThought;
    @FXML
    private Label vitoria;

    @FXML
    private void btnGuessNumber(ActionEvent event) {
        int numeroGerado = randomNumber();
        int numeroDigitado = Integer.valueOf(numberThought.getText());
        int lblAttempts = Integer.valueOf(attempts.getText());
        int lblTotalChances = Integer.valueOf(totalChances.getText());
         System.out.println(numeroGerado);
            
        
        lblAttempts += 1;
        String lblTotalAttempts = Integer.toString(lblAttempts);
        attempts.setText(lblTotalAttempts);
        
        if(lblTotalChances > 0) {
            lblTotalChances -= 1;
            
//            System.out.println(lblAttempts);;
            
            String lblTotalString = Integer.toString(lblTotalChances);
            totalChances.setText(lblTotalString);
        }
        
        if(numeroDigitado == numeroGerado) {
            vitoria.setText("Voce ganhou!");
            System.out.println("Voce ganhou!");
        }
    }
    
    public static int randomNumber() {
        Random numberRandom = new Random();
        
        int number = numberRandom.nextInt(31);
        
        return number;
    }
    
}

