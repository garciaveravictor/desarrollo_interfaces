/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.pkg3.pkg8;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea438 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Instanciar circulo
        Circle bolita = new Circle(150, 150, 10);
        
        //Label
        Label fps = new Label("FPS = ");
        
        //Animacion
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2));
        tt.setNode(bolita);
        tt.setCycleCount(300);
 
        //Movimiento de la bola
        tt.toXProperty();
        tt.toYProperty();
              
        tt.play();
        
        Pane root = new Pane();
        
        root.getChildren().add(bolita);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Timeline Demo");
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
