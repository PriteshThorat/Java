import java.net.*;
import java.io.*;

public class A{
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 100);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println("Client application is sending request value");
        dos.writeUTF("5");
        String ans = (String) dis.readUTF();
        System.out.println("Client program recieved result from server");
        System.out.println("Square of 5 is: " + ans);
        s.close();
    }
};