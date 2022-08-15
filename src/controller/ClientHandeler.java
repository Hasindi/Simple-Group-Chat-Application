package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandeler extends Thread{
    public static ArrayList<ClientHandeler> clientHandlers;
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;
    private PrintWriter printWriter;

    public ClientHandeler(Socket socket, ArrayList<ClientHandeler> clientHandelers) {

        try {
            this.socket = socket;
            this.clientHandlers = clientHandelers;
            this.printWriter = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void run() {
        try{
            String massage;
            while ((massage = bufferedReader.readLine()) != null) {
                if(massage.equalsIgnoreCase("exit")) {
                    break;
                }

                for(ClientHandeler c : clientHandlers) {
                    c.printWriter.println(massage);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
