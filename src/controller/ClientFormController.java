package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class ClientFormController extends Thread{
    public TextField txtTypemsg;
    public VBox vBox;
    public Label lblUserName;
    public ImageView camera;

    public void sendOnAction(ActionEvent actionEvent) {
    }

    public void SendImageClickOnAction(MouseEvent mouseEvent) {
    }
}
