import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 12345;

        try{
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server is Listening on port " + port);

            Socket s = ss.accept();
            System.out.println("Clint connected: " + s.getInetAddress());

            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter output = new PrintWriter(s.getOutputStream(), true);

            output.println("Hello Client!");
            String res = input.readLine();
            System.out.println("Clinet Says: " + res);

            s.close();
            ss.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};