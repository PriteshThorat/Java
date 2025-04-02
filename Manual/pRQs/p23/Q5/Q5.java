import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hostname: ");
        String hostname = scanner.nextLine();

        try {
            InetAddress inetAddress = InetAddress.getByName(hostname);
            System.out.println("IP Address of " + hostname + ": " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Error: Could not resolve hostname '" + hostname + "'.");
            System.err.println("Reason: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}