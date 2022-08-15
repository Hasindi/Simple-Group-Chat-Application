package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

    public ClientHandeler(Socket accept, ArrayList<ClientHandeler> clientHandelers) {
    }
}
