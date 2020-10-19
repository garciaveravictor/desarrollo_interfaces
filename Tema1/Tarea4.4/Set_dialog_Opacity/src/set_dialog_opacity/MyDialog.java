package set_dialog_opacity;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
<<<<<<< Updated upstream
import javafx.scene.control.Label;
=======
>>>>>>> Stashed changes
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
<<<<<<< Updated upstream
=======
import jdk.internal.org.objectweb.asm.Label;
>>>>>>> Stashed changes

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class MyDialog extends Stage {
<<<<<<< Updated upstream

    public MyDialog(Stage owner) {
        
=======
    
    public MyDialog(Stage owner) {
>>>>>>> Stashed changes
        super();
        initOwner(owner);
        setTitle("title");
        setOpacity(.90);
<<<<<<< Updated upstream
        
=======
>>>>>>> Stashed changes
        Group root = new Group();
        Scene scene = new Scene(root, 250, 150, Color.WHITE);
        setScene(scene);

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        Label userNameLbl = new Label("User Name: ");
        gridpane.add(userNameLbl, 0, 1);

        Label passwordLbl = new Label("Password: ");
        gridpane.add(passwordLbl, 0, 2);
<<<<<<< Updated upstream
        
=======
>>>>>>> Stashed changes
        final TextField userNameFld = new TextField("Admin");
        gridpane.add(userNameFld, 1, 1);

        final PasswordField passwordFld = new PasswordField();
        passwordFld.setText("password");
        gridpane.add(passwordFld, 1, 2);

        Button login = new Button("Change");
        login.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                close();
            }
        });
<<<<<<< Updated upstream
        
=======
>>>>>>> Stashed changes
        gridpane.add(login, 1, 3);
        GridPane.setHalignment(login, HPos.RIGHT);
        root.getChildren().add(gridpane);
    }
<<<<<<< Updated upstream

=======
    
>>>>>>> Stashed changes
}
