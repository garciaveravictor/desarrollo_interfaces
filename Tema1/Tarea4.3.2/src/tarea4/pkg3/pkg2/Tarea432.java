
package tarea4.pkg3.pkg2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea432 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        //Boton Nuevo
        Button nuevo = new Button("Nuevo");
        nuevo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        //Boton abrir
        Button abrir = new Button("Abrir");
        abrir.setOnAction(new EventHandler<ActionEvent>() {           
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir Proceso");
            }
        });
        
        //Boton guardar
        Button guardar = new Button("Guardar");
        guardar.setOnAction(new EventHandler<ActionEvent>() {           
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar Proceso");
            }
        });
        
        //Boton imprimir
        Button imprimir = new Button("Imprimir");
        imprimir.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir Proceso");
            }
        });
        
        //Configuracion del Pane
        GridPane root = new GridPane();
        
        root.setVgap(10);
        root.setHgap(10);
        
        root.setAlignment(Pos.CENTER);
        
        root.add(nuevo, 0, 0 );
        root.add(abrir, 1 ,0 );
        root.add(guardar, 2, 0);
        root.add(imprimir, 3, 0);
        
        
        
        Scene scene = new Scene(root, 300, 50);
        
        primaryStage.setTitle("AnonymousHandlerDemo");
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
