package br.senac.javafxapp2.aplicacao; 

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacao2 extends Application {
    
    public void start(Stage stage) throws Exception {
        Parent telaCadastro = FXMLLoader.load(
            getClass().getResource(
                    "/br/senac/javafxapp2/telas/TelaTeste.fxml"
            )
        );
        
        Scene scene = new Scene(telaCadastro);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
