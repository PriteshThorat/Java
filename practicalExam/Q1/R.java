// Write program to demonstrate sending and receiving data through datagram.

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class R {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9876);
            byte[] buffer = new byte[1024];

            System.out.println("Receiver is waiting for a message...");

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
};