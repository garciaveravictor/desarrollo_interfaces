package set_dialog_opacity;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Set_dialog_Opacity extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Dialog");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);

        primaryStage.setScene(scene);
        primaryStage.show();

        Stage myDialog = new MyDialog(primaryStage);
        myDialog.sizeToScene();
        myDialog.show();

    }

}