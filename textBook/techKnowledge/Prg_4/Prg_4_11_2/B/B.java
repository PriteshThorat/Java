import java.net.*;
import java.io.*;

public class B{
    public static void main(String[] args) throws IOException{
        int f = 1, i, n;
        ServerSocket ss = new ServerSocket(100);
        Socket s = ss.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String) dis.readUTF();
        System.out.println("Server says, Hello " + str);
        ss.close();
        s.close();
    }
};