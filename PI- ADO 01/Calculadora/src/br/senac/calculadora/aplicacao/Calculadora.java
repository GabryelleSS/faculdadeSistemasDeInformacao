package br.senac.calculadora.aplicacao;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculadora {
    public void start(Stage stage) throws Exception {
        Parent telaCalculadora = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/calculadora/telas/CalculadoraFX.fxml"
                )
        );
        
        Scene scene = new Scene(telaCalculadora);
        
        stage.setScene(scene);
        stage.setMaxHeight(400);
        stage.setMaxWidth(600);
        stage.setMinHeight(400);
        stage.setMinWidth(600);
        stage.show();
    }
}
