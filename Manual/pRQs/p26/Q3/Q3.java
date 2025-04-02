import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Q3 {

    private static final int SERVER_PORT = 12345;
    private static final int CLIENT_PORT = 12346; // Different port for client to receive
    private static InetAddress serverAddress;
    private static String clientName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        clientName = scanner.nextLine();

        try {
            serverAddress = InetAddress.getByName("localhost"); // Replace with server IP if needed

            // Start receiving messages in a separate thread
            Thread receiverThread = new Thread(new MessageReceiver());
            receiverThread.start();

            // Start sending messages from the main thread
            try (DatagramSocket sendSocket = new DatagramSocket()) {
                System.out.println("Chat started. Type '/quit' to exit.");
                String message;
                while (true) {
                    message = scanner.nextLine();
                    byte[] sendBuffer = (clientName + ": " + message).getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, SERVER_PORT);
                    sendSocket.send(sendPacket);
                    if (message.equalsIgnoreCase("/quit")) {
                        break;
                    }
                }
            } catch (SocketException e) {
                System.err.println("Error creating send socket: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error sending message: " + e.getMessage());
            }

        } catch (UnknownHostException e) {
            System.err.println("Error resolving server address: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static class MessageReceiver implements Runnable {
        @Override
        public void run() {
            try (DatagramSocket receiveSocket = new DatagramSocket(CLIENT_PORT)) {
                byte[] receiveBuffer = new byte[1024];
                while (true) {
                    DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                    receiveSocket.receive(receivePacket);
                    String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    System.out.println(receivedMessage);
                }
            } catch (SocketException e) {
                System.err.println("Error creating receive socket: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error receiving message: " + e.getMessage());
            }
        }
    }
}