/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.pkg3.pkg6;


import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea436 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        //Instanciar circulo
        Circle circulo = new Circle(150, 150, 100, Color.web("white"));
        circulo.setStroke(Color.BLACK);
        circulo.setStrokeWidth(2); 
        
        //Instanciar rectangulo
        Rectangle rectangulo = new Rectangle(100, 50, Color.ORANGE);
        
        //Animacion
        PathTransition path = new PathTransition();
        path.setDuration(Duration.millis(4000));
        path.setPath(circulo);
        path.setNode(rectangulo);
        path.setCycleCount(Timeline.INDEFINITE);
        path.play();
        
        //Rotacion del rectangulo
        RotateTransition rt = new RotateTransition();
        rt.setDuration(Duration.millis(4000));
        rt.setByAngle(360);
        rt.setNode(rectangulo);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.play();
        
        Pane root = new Pane();
        
        root.getChildren().add(circulo);
        root.getChildren().add(rectangulo);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Path Transition Demo");
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
