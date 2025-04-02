import java.net.*;
import java.io.*;

public class B{
    public static void main(String[] args) throws Exception{
        int f = 1, i, n;

        ServerSocket ss = new ServerSocket(100);
        Socket s = ss.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());

        System.out.println("Server is waiting for request input from client");
        String str = (String) dis.readUTF();
        System.out.println("Server received input from client");
        n = Integer.parseInt(str);
        for(i = 1; i < n; i++){
            f = f * i;
        }
        dos.writeUTF(" " + f);
        System.out.println("Server send the response");

        ss.close();
        s.close();
    }
};