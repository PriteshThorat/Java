import java.net.*;
import java.io.*;

public class B{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(100);
        Socket s = ss.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println("Server is waiting for request input from client");
        String str = (String) dis.readUTF();
        System.out.println("Server received input from client");
        int n = Integer.parseInt(str);
        int sq = n * n;
        dos.writeUTF("" + sq);
        System.out.println("Server sent the response");
        ss.close();
        s.close();
    }
};