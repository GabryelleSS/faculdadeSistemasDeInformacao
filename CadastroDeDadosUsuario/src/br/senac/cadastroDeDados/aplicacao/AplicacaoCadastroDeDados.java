package br.senac.cadastroDeDados.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AplicacaoCadastroDeDados extends Application {
    public void start(Stage stage) throws Exception {
        Parent telaCadastroDeDados = FXMLLoader.load(
            getClass().getResource(
                "/br/senac/cadastroDeDados/telas/TelaCadastroDeDados.fxml"
            )
        );
        
        Scene scene = new Scene(telaCadastroDeDados);
        
        stage.setScene(scene);
        stage.show();
    }
}
