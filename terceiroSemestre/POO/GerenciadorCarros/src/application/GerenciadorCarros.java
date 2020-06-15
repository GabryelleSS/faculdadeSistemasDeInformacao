package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GerenciadorCarros extends Application {
    
     @Override
     public void start(Stage stage) throws Exception {
        Parent telaCadastro = FXMLLoader.load(getClass().getResource("/view/Gerenciador.fxml"));
        
        Scene scene = new Scene(telaCadastro);
        
        stage.setScene(scene);
        stage.setTitle("Gerenciador");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
