/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.pkg3.pkg4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea434 extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        //Text 
        Text texto = new Text(100, 50, "Programin is fun");

        Pane root = new Pane();
        
        root.getChildren().add(texto);

        Scene scene = new Scene(root, 300, 100);
        
        //Evento
        texto.setOnMouseDragged((MouseEvent evento) -> {
            texto.setX(evento.getX());
            texto.setY(evento.getY());
        });
                
        primaryStage.setTitle("Progaming is fun");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
