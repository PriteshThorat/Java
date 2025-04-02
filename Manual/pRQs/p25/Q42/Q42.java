import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

// Client-side program
class Q42 {
    private static final String SERVER_ADDRESS = "localhost"; // Replace with the actual server IP if needed
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("Connected to server at " + SERVER_ADDRESS + ":" + PORT);

            System.out.print("Enter User ID: ");
            String userId = scanner.nextLine();
            out.println(userId);

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            out.println(password);

            String response = in.readLine();
            System.out.println("Server response: " + response);

        } catch (IOException e) {
            System.err.println("Error connecting to server or during communication: " + e.getMessage());
        } finally {
            System.out.println("Client finished.");
        }
    }
}

/*
public class Q42 {
    public static void main(String[] args) {
        // To run, you need to start the CredentialServer first in one terminal,
        // and then run the CredentialClient in another terminal.
        System.out.println("Run CredentialServer first, then CredentialClient.");
    }
}
*/