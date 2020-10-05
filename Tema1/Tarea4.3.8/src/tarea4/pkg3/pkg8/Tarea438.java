/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.pkg3.pkg8;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import com.sun.javafx.perf.PerformanceTracker;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea438 extends Application {
    
    public static double bolitaSpeedX = 1;
    public static double bolitaSpeedY = 1;

    @Override
    public void start(Stage primaryStage) {
        
        //Instanciar circulo
        Circle bolita = new Circle(10);
        bolita.setTranslateX(300 * 0.5);
        bolita.setTranslateY(300 * 0.5);


        //Label
        Label fps = new Label();

        Pane root = new Pane();

        root.getChildren().add(bolita);
        root.getChildren().add(fps);

        Scene scene = new Scene(root, 400, 300);

        EventHandler<ActionEvent> eH = e -> {
            
            // Mostrar la frecuencia de refresco FPS
            PerformanceTracker perfTracker = PerformanceTracker.getSceneTracker(scene);

            fps.setText("FPS (Timeline) = " + perfTracker.getInstantFPS());
            
            System.out.println(bolita.getTranslateX());
            
            // Cambiar la dirección de la bola si llega a los extremos
            if (bolita.getTranslateX() < 0 || bolita.getTranslateX() > 400) {
                bolitaSpeedX *= -1;
            }
           
            if (bolita.getTranslateY() < 0 || bolita.getTranslateY() > 300) {
                bolitaSpeedY *= -1;
            }
            
            bolita.setTranslateX(bolita.getTranslateX() + bolitaSpeedX);
            bolita.setTranslateY(bolita.getTranslateY() + bolitaSpeedY);
            
        };

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(5), eH));
        animation.setCycleCount(Timeline.INDEFINITE);
        
        // iniciamos animation
        animation.play();

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
