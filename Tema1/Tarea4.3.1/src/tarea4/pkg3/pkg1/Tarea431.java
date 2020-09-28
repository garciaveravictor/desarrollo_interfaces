package tarea4.pkg3.pkg1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea431 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle circulo = new Circle(150,150,50);
        
        
        //Reducir
        Button boton1 = new Button("Shrink");
        boton1.setOnAction((ActionEvent event) -> {
            circulo.setRadius(circulo.getRadius()-10);
        });
        
        //Agrandar
        Button boton2 = new Button("Enlarge");
        boton2.setOnAction((ActionEvent event) -> {
            circulo.setRadius(circulo.getRadius()+10);
        });
        
        AnchorPane root = new AnchorPane();
        
        //Anclar boton1
        AnchorPane.setTopAnchor(boton1, 250.0); 
        AnchorPane.setLeftAnchor(boton1, 50.0); 
        
        //Anclar boto2
        AnchorPane.setTopAnchor(boton2, 250.0); 
        AnchorPane.setLeftAnchor(boton2, 200.0); 
        
        root.getChildren().add(boton1);
        root.getChildren().add(boton2);
        root.getChildren().add(circulo);
        
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("ControlCircle");
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
