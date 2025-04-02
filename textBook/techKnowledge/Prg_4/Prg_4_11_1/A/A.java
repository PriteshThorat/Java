import java.net.*;
import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args) throws Exception{ 
        int num;

        Socket s = new Socket("localhost", 100);
        Scanner sc = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.println("Client application is sending request value");
        dos.writeUTF(" " + num);
        String ans = (String) dis.readUTF();
        System.out.println("Client program received result from server");
        System.out.println("Square of " + num + " is: " + ans);
        s.close();
    }
};