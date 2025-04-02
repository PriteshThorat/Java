import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Server-side
class Q51 {
    private static final int PORT = 12345;
    private static List<ClientHandler> clients = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(10); // Handle up to 10 clients concurrently

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Chat Server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());
                ClientHandler clientHandler = new ClientHandler(clientSocket, clients);
                clients.add(clientHandler);
                pool.execute(clientHandler);
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        } finally {
            pool.shutdown();
        }
    }

    // Broadcast a message to all connected clients
    public static void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
        System.out.println(message); // Print message on the server console as well
    }

    // Remove a client from the list (when they disconnect)
    public static void removeClient(ClientHandler client) {
        clients.remove(client);
        broadcastMessage(client.getClientName() + " has left the chat.", null);
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;
    private String clientName;
    private List<ClientHandler> clients;

    public ClientHandler(Socket socket, List<ClientHandler> clients) {
        this.clientSocket = socket;
        this.clients = clients;
    }

    public String getClientName() {
        return clientName;
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Get client's name
            out.println("Enter your name:");
            clientName = in.readLine();
            System.out.println(clientName + " has joined the chat.");
            ChatServer.broadcastMessage(clientName + " has joined the chat.", this);

            String message;
            while ((message = in.readLine()) != null) {
                if (message.equalsIgnoreCase("/quit")) {
                    break;
                }
                ChatServer.broadcastMessage(clientName + ": " + message, this);
            }
        } catch (IOException e) {
            System.err.println("Error handling client " + clientName + ": " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Error closing socket for " + clientName + ": " + e.getMessage());
            }
            ChatServer.removeClient(this);
        }
    }
}