import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddr = "localhost";
        int port = 12345;

        try{
            Socket s = new Socket(serverAddr, port);
            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter output = new PrintWriter(s.getOutputStream(), true);

            output.println("Hello Server!");
            String res = input.readLine();
            System.out.println("Server Says: " + res);

            s.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};