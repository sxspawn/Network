package ru.kovbasa.network;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import static ru.kovbasa.network.ServerConfig.hostName;
import static ru.kovbasa.network.ServerConfig.portNumber;

public class Client {
    public static void main(String[] args) throws Exception {

        try (Socket socket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("Hello from client");
            System.out.println(in.readLine());
        }
    }
}
