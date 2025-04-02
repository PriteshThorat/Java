import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Client-side
class Q52 {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 12345;
    private String clientName;

    public Q52(String name) {
        this.clientName = name;
    }

    public void run() {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("Connected to Chat Server.");

            // Send client name to the server
            String serverMessage;
            while ((serverMessage = in.readLine()) != null) {
                System.out.println(serverMessage);
                if (serverMessage.contains("Enter your name:")) {
                    out.println(clientName);
                    break;
                }
            }

            // Start a separate thread to read messages from the server
            new Thread(() -> {
                String messageFromServer;
                try {
                    while ((messageFromServer = in.readLine()) != null) {
                        System.out.println(messageFromServer);
                    }
                } catch (IOException e) {
                    System.err.println("Error reading from server: " + e.getMessage());
                }
            }).start();

            // Read messages from the user and send them to the server
            String messageToSent;
            while (true) {
                messageToSent = scanner.nextLine();
                out.println(messageToSent);
                if (messageToSent.equalsIgnoreCase("/quit")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.err.println("Could not connect to the server: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        ChatClient client = new ChatClient(name);
        client.run();
    }
}

/*public class ChatApplication {
    public static void main(String[] args) {
        // To run, start ChatServer in one terminal and multiple ChatClient instances in other terminals.
        System.out.println("Run ChatServer first, then run multiple ChatClient instances.");
    }
}*/