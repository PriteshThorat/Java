import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

// Server-side program
class Q41 {
    private static final int PORT = 12345;
    private static final Map<String, String> userCredentials = new HashMap<>();

    static {
        // Initialize some user credentials (replace with a more secure method in a real application)
        userCredentials.put("user1", "pass123");
        userCredentials.put("testuser", "securepwd");
        userCredentials.put("guest", "guest123");
    }

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Credential Server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from: " + clientSocket.getInetAddress());

                // Create a new thread to handle each client connection
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
            ) {
                String userId = in.readLine();
                String password = in.readLine();

                if (userId != null && password != null && userCredentials.containsKey(userId)) {
                    String storedPassword = userCredentials.get(userId);
                    if (password.equals(storedPassword)) {
                        out.println("Authentication successful");
                        System.out.println("Authentication successful for user: " + userId);
                    } else {
                        out.println("Authentication failed: Incorrect password");
                        System.out.println("Authentication failed for user: " + userId + " (incorrect password)");
                    }
                } else {
                    out.println("Authentication failed: Invalid user ID");
                    System.out.println("Authentication failed for user: " + userId + " (invalid user ID)");
                }

            } catch (IOException e) {
                System.err.println("Error communicating with client: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                    System.out.println("Client disconnected: " + clientSocket.getInetAddress());
                } catch (IOException e) {
                    System.err.println("Error closing client socket: " + e.getMessage());
                }
            }
        }
    }
}