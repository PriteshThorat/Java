import java.io.*;
import java.net.*;

public class SP{
    public static DatagramSocket ds;
    public static int clientport = 789, serverport = 790;
    public static byte buffer[] = new byte[10000];
    public static byte bufferS[] = new byte[10000];

    public static void main(String[] args) throws Exception {
        int ret = 0;
        String temp = "";
        ds = new DatagramSocket(serverport);
        BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
        InetAddress ia = InetAddress.getByName("localhost");

        DatagramPacket p = new DatagramPacket(buffer, buffer.length);
        ds.receive(p);
        String psx = new String(p.getData(), 0, p.getLength());
        String s = "Hello ";
        temp = s.concat(psx);
        bufferS = temp.getBytes();
        ds.send(new DatagramPacket(bufferS, temp.length(), ia, clientport));
    }
};