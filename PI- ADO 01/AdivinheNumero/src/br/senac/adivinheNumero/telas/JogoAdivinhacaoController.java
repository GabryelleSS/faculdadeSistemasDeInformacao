package br.senac.adivinheNumero.telas;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class JogoAdivinhacaoController {

    @FXML
    private Label attempts;
    @FXML
    private Label totalChances;
    @FXML
    private TextField numberThought;
    @FXML
    private Text vitoria;
    @FXML
    private Button btnGuesseNumbers;
    
    int numeroGerado = RandomNumber();

    @FXML
    private void btnGuessNumber(ActionEvent event) {
        if(numberThought.getText() != null) {
            int numeroDigitado = Integer.valueOf(numberThought.getText());
            int lblAttempts = Integer.valueOf(attempts.getText());
            int lblTotalChances = Integer.valueOf(totalChances.getText());
            
            lblAttempts += 1;
            String lblTotalAttempts = Integer.toString(lblAttempts);
            attempts.setText(lblTotalAttempts);
            
            if(lblTotalChances > 0) {
                lblTotalChances -= 1;

                String lblTotalString = Integer.toString(lblTotalChances);
                totalChances.setText(lblTotalString);
                
                if(numeroGerado == numeroDigitado && lblTotalChances > 0) {
                    vitoria.setText("Voce ganhou!");
                }
                else if(lblTotalChances == 0 && numeroGerado != numeroDigitado) {
                    vitoria.setText("Voce perdeu! \n O número que pensei foi: " + numeroGerado);
                    
                    new Timer().schedule(new TimerTask() {
                        public void run() {
                           System.exit(0);
                        }
                    }, 2500L);
                }
            }
        }
    }
    
    public static int RandomNumber() {
        Random numberRandom = new Random();
        
        int number = numberRandom.nextInt((21) + 1);
        
        return number;
    }
}

// System.exit(0);

