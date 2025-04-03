import java.net.*;
import java.io.*;

public class A{
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 100);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println("Client application is sending user name");
        dos.writeUTF("Ravi Majitiha");
        s.close();
    }
};