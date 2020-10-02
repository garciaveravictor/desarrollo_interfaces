/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.pkg3.pkg7;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea437 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Instanciar Elipse
        Ellipse elipse = new Ellipse(100, 75);
        elipse.setFill(Color.RED);
        elipse.setStroke(Color.BLACK);
        elipse.setStrokeWidth(2);
        
        //Fade Transition
        FadeTransition ft = new FadeTransition(Duration.millis(4000), elipse);
        ft.setFromValue(1);
        ft.setToValue(0);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        
        //Evento de raton
        elipse.setOnMousePressed((MouseEvent evento) -> {
            ft.pause();
        });
        elipse.setOnMouseReleased((MouseEvent evento) -> {
            ft.play();
        });
        
        StackPane root = new StackPane();
        
        root.getChildren().add(elipse);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("PathTransitionDemo");
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
