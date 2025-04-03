import java.io.*;
import java.net.*;

public class A{
    public static void main(String[] args) throws IOException{
        int n1, n2, n3;
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter 3 numbers");
        n1 = Integer.parseInt(dis.readLine());
        n2 = Integer.parseInt(dis.readLine());
        n3 = Integer.parseInt(dis.readLine());
        Socket s = new Socket("localhost", 100);
        DataInputStream dis2 = new DataInputStream(s.getInputStream());
        DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
        dos2.writeUTF(n1 + ", " + n2 + ", " + n3);
        String ans = dis2.readUTF();
        System.out.println("Largest element is: " + ans);
        s.close();
    }
};