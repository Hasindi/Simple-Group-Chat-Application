import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("views/loginForm.fxml"));
        Scene mainScene = new Scene(parent);
        primaryStage.setTitle("Let's Chat...");
        primaryStage.setScene(mainScene);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}