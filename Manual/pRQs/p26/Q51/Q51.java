import java.io.*;
import java.net.*;

public class Q51 {
    private static final int PACKET_SIZE = 1024; // 1 KB packets

    public static void main(String[] args) {
        String filePath = "C:/Users/Admin/Downloads/Projects/Java/Manual/pRQs/p26/Q51/abc.txt"; // Change file path
        String receiverIP = "127.0.0.1"; // Change to receiver's IP
        int receiverPort = 9876; // Port number

        try (DatagramSocket socket = new DatagramSocket();
             FileInputStream fis = new FileInputStream(filePath)) {
            
            InetAddress receiverAddress = InetAddress.getByName(receiverIP);
            byte[] buffer = new byte[PACKET_SIZE];
            int bytesRead;

            // Sending file data in chunks
            while ((bytesRead = fis.read(buffer)) != -1) {
                DatagramPacket packet = new DatagramPacket(buffer, bytesRead, receiverAddress, receiverPort);
                socket.send(packet);
                Thread.sleep(10); // Prevent congestion
            }

            // Indicate end of file transfer with a special "EOF" message
            byte[] eofMessage = "EOF".getBytes();
            DatagramPacket eofPacket = new DatagramPacket(eofMessage, eofMessage.length, receiverAddress, receiverPort);
            socket.send(eofPacket);

            System.out.println("File sent successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
