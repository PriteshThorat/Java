import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        int port = 12345;

        try{
            DatagramSocket socket = new DatagramSocket(port);

            byte[] buffer = new byte[1024];

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("Server Listening on port " + port);

            socket.receive(packet);

            String clientMsg = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Client Says: " + clientMsg);

            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};