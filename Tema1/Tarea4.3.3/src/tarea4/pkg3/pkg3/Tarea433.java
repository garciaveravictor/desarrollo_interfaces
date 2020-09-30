/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.pkg3.pkg3;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Tarea433 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button calcular = new Button("Calculate");
        
        
        
        //Tittles
        Label interest = new Label("Annual Interest Rate: ");
        Label year = new Label("Number of Years: ");
        Label amount = new Label("Loan Amount: ");
        Label mPayment = new Label("Monthly Payment: ");
        Label tPayment = new Label("Total Paymen: ");
        Label error = new Label();
        
        //Text fields
        TextField interestTf = new TextField();
        TextField yearTf = new TextField();
        TextField amountTf = new TextField();
        TextField mPaymentTf = new TextField();
        TextField tPaymentTf = new TextField();
        
        //Configuracion del Pane
        GridPane root = new GridPane();
        
        root.setVgap(10);
        root.setHgap(10);
        
        root.setAlignment(Pos.CENTER);
        
        //Label and TextField
        root.add(interest, 0, 0);
        root.add(interestTf, 1, 0);
        root.add(year, 0, 1);
        root.add(yearTf, 1, 1);
        root.add(amount, 0, 2);
        root.add(amountTf, 1, 2);
        root.add(mPayment, 0, 3);
        root.add(mPaymentTf, 1, 3);
        root.add(tPayment, 0, 4);
        root.add(tPaymentTf, 1, 4); 
        root.add(calcular, 1, 5);
        root.add(error, 0, 5);
        
        calcular.setOnAction((ActionEvent event) -> {
            
            double interesRate, numYear, lAmount;
            
            try {
                interesRate = Double.parseDouble(interestTf.getText());
                numYear = Double.parseDouble(yearTf.getText());
                lAmount = Double.parseDouble(amountTf.getText());
            } catch (NumberFormatException exception){
                System.out.println("Error se han introducido letras");
                error.setText("Introduzca solo numeros");
                error.setTextFill(Color.web("#ff0000"));
                
                return;
            }
            
            double mensual, aux;
            
            aux = interesRate / (100 * 12);
            mensual = (lAmount * aux)/(1 - Math.pow( (1 + aux), - 12 * numYear));
            
            mPaymentTf.setText("$" + new DecimalFormat("#.##").format(mensual));
            tPaymentTf.setText("$" + new DecimalFormat("#.##").format(mensual * 12 * numYear)); 
            
        });
        
        Scene scene = new Scene(root, 300, 250);
        
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
