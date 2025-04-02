import java.io.*;
import java.net.*;

public class Q52 {
    private static final int PACKET_SIZE = 1024; // 1 KB packets
    private static final int PORT = 9876; // Must match sender's port

    public static void main(String[] args) {
        String savePath = "C:/Users/Admin/Downloads/Projects/Java/Manual/pRQs/p26/Q52/xyz.txt"; // Change file save path

        try (DatagramSocket socket = new DatagramSocket(PORT);
             FileOutputStream fos = new FileOutputStream(savePath)) {
            
            byte[] buffer = new byte[PACKET_SIZE];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("Waiting for file...");

            while (true) {
                socket.receive(packet);
                String receivedData = new String(packet.getData(), 0, packet.getLength());

                // Check for "EOF" to stop receiving
                if (receivedData.equals("EOF")) {
                    System.out.println("File received successfully!");
                    break;
                }

                // Write to file
                fos.write(packet.getData(), 0, packet.getLength());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
