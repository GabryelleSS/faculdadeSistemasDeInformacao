package br.senac.javafxapp.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacao extends Application {
       public void start(Stage stage) throws Exception {
        Parent telaCalculadora = FXMLLoader.load(
                getClass().getResource(
                        "/br/senac/javafxapp/tela/Tela.fxml"
                )
        );
        
        Scene scene = new Scene(telaCalculadora);
        
        stage.setScene(scene);
        stage.show();
        
       }
}
