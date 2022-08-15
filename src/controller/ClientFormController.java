package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.*;
import java.net.Socket;

public class ClientFormController extends Thread{
    public TextField txtTypemsg;
    public VBox vBox;
    public Label lblUserName;
    public ImageView camera;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private Socket socket;

    public void initialize(){
        String userName = LoginFormController.userName;
        lblUserName.setText(userName);

        try {
            socket = new Socket("localhost", 8000);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            this.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendOnAction(ActionEvent actionEvent) {
    }

    public void SendImageClickOnAction(MouseEvent mouseEvent) {
    }
}
