import java.io.*;
import java.net.*;

public class CP {
    public static DatagramSocket ds;
    public static byte buffer[] = new byte[10000];
    public static byte bufferR[] = new byte[10000];
    public static int clientport = 789, serverport = 790;
    public static int a = 0;

    public static void main(String[] args) throws Exception {
        ds = new DatagramSocket(clientport);
        BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
        InetAddress ia = InetAddress.getByName("localhost");
        System.out.println("Enter the user name: ");
        String str = dis.readLine();
        buffer = str.getBytes();
        ds.send(new DatagramPacket(buffer, str.length(), ia, serverport));
        DatagramPacket p = new DatagramPacket(bufferR, bufferR.length);
        ds.receive(p);
        String psx = new String(p.getData(), 0, p.getLength());
        System.out.println("" + psx);
    }
};