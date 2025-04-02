import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Q4 {

    private static final int SERVER_PORT = 12345;
    private static final int CLIENT_PORT = 12346;
    private static final int PACKET_SIZE = 1024;
    private static final String SERVER_ADDRESS = "localhost";

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopierUDP <source_file> <destination_file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            InetAddress serverIp = InetAddress.getByName(SERVER_ADDRESS);

            // Start the server in a separate thread
            Thread serverThread = new Thread(() -> startServer(destinationFile));
            serverThread.start();

            // Give the server a moment to start listening
            Thread.sleep(100);

            // Start the client to send the file
            startClient(sourceFile, serverIp);

            System.out.println("File copy process initiated. Check the server's output.");

        } catch (UnknownHostException e) {
            System.err.println("Error resolving server address: " + e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupted: " + e.getMessage());
        }
    }

    private static void startServer(String destinationFile) {
        try (DatagramSocket serverSocket = new DatagramSocket(SERVER_PORT);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            System.out.println("Server listening on port " + SERVER_PORT + " for file data.");

            byte[] buffer = new byte[PACKET_SIZE];
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                serverSocket.receive(receivePacket);

                int receivedLength = receivePacket.getLength();
                if (receivedLength > 0) {
                    fos.write(buffer, 0, receivedLength);
                    if (receivedLength < PACKET_SIZE) {
                        // Assuming the last packet is smaller than PACKET_SIZE
                        System.out.println("File transfer complete on server.");
                        break;
                    }
                } else {
                    // Handle potential empty packets or end of transmission signal
                    System.out.println("End of transmission signal received.");
                    break;
                }
            }
        } catch (SocketException e) {
            System.err.println("Error creating server socket: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error receiving or writing data on server: " + e.getMessage());
        }
    }

    private static void startClient(String sourceFile, InetAddress serverIp) {
        try (DatagramSocket clientSocket = new DatagramSocket(CLIENT_PORT);
             FileInputStream fis = new FileInputStream(sourceFile)) {
            System.out.println("Client started, reading file: " + sourceFile);

            byte[] buffer = new byte[PACKET_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                DatagramPacket sendPacket = new DatagramPacket(buffer, bytesRead, serverIp, SERVER_PORT);
                clientSocket.send(sendPacket);
                // Optionally add a small delay to avoid overwhelming the network/receiver
                // Thread.sleep(10);
            }

            // Send an empty packet or a smaller packet to signal the end of the file
            byte[] endSignal = new byte[1];
            DatagramPacket endPacket = new DatagramPacket(endSignal, 0, serverIp, SERVER_PORT);
            clientSocket.send(endPacket);

            System.out.println("File sending complete on client.");

        } catch (SocketException e) {
            System.err.println("Error creating client socket: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading or sending data on client: " + e.getMessage());
        }
    }
}