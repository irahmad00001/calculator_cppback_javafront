/**
 * Created by Public on 10/26/2022.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class FXPanel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("panel.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
}
