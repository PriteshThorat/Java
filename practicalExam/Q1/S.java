// Write program to demonstrate sending and receiving data through datagram.

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class S {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            String message = "Hello from DatagramSender!";
            byte[] buffer = message.getBytes();

            InetAddress receiverAddress = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverAddress, 9876);

            socket.send(packet);
            System.out.println("Message sent.");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
};