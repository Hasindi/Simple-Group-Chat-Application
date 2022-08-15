package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginFormController {
    public TextField txtLogin;
    public Button btnLogin;
    public static String userName;

    public void loginOnAction(ActionEvent actionEvent) {
        userName = txtLogin.getText();

    }
}
