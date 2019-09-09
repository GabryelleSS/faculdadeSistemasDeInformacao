package br.senac.adivinheNumero.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JogoAdivnhacao extends Application {
    public void start(Stage stage) throws Exception {
        Parent telaJogoAdivinhacao = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/adivinheNumero/telas/JogoAdivinhacao.fxml"
                )
        );
        
        Scene scene = new Scene(telaJogoAdivinhacao);
        
        stage.setScene(scene);
        stage.show();
    }
}
