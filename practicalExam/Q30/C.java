// Write program that demonstrates connection oriented communication using socket.

import java.io.*;
import java.net.*;

public class C {
    public static void main(String[] args) {
        String serverAddress = "localhost"; 
        int port = 12345; 

        try {
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to server at " + serverAddress + ":" + port);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverResponse = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter serverRequest = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while (true) {
                System.out.print("Enter message to send to the server (type 'exit' to quit): ");
                message = userInput.readLine();

                if ("exit".equalsIgnoreCase(message)) {
                    break; 
                }

                serverRequest.println(message);

                String response = serverResponse.readLine();
                System.out.println("Server response: " + response);
            }

            userInput.close();
            serverResponse.close();
            serverRequest.close();
            socket.close();

        } catch (IOException e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
};