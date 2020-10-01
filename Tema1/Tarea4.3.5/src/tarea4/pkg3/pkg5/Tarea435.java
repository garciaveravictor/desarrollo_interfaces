/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.pkg3.pkg5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea435 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Text
        Text texto = new Text(20, 20, "A");
        
        Pane root = new Pane();
        
        root.getChildren().add(texto);
        
        Scene scene = new Scene(root, 300, 250);
        
        //Evento
        scene.setOnKeyPressed((KeyEvent evento) -> {
            switch (evento.getCode()) {
                case LEFT:
                    texto.setX(texto.getX() - 10);
                    break;
                case RIGHT:
                    texto.setX(texto.getX() + 10);
                    break;
                case DOWN:
                    texto.setY(texto.getY() + 10);
                    break;
                case UP:
                    texto.setY(texto.getY() - 10);
                    break;
                default:   //TODO arreglar 
                    texto.setText(evento.getCode());
                    break;
            }
            
        });
        
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
