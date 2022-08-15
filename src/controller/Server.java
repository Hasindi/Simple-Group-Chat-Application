package controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private static ArrayList<ClientHandeler> clientHandelers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket accept;

        while (true) {
            System.out.println("Waiting for Client.....");
            accept = serverSocket.accept();
            System.out.println("client....");

            ClientHandeler clientHandeler = new ClientHandeler(accept,clientHandelers);
            clientHandelers.add(clientHandeler);
            clientHandeler.start();
        }

    }
}
