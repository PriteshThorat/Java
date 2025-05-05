import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        String serverAddr = "localhost";
        int port = 12345;

        try{
            DatagramSocket socket = new DatagramSocket();

            String msg = "Hello Server!";
            byte[] buffer = msg.getBytes();

            InetAddress serverIp = InetAddress.getByName(serverAddr);

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverIp, port);
            socket.send(packet);
            System.out.println("Data Successfully Sent");

            socket.close(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};