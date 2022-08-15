package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public TextField txtLogin;
    public Button btnLogin;
    public static String userName;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        userName = txtLogin.getText();
        Stage stage = (Stage) txtLogin.getScene().getWindow();
        stage.close();

        Stage stage1 = new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/views/ClientForm.fxml"))));
        stage1.setTitle("Let's Chat....");
        stage1.setResizable(false);
        stage1.centerOnScreen();
        stage1.show();
    }
}
