import java.net.*;
import java.io.*;

public class SP extends Thread {
    Socket client;

    public SP(Socket s){
        client = s;
        start();
    }
    
    @Override
    public void run(){
        try{
            OutputStream os = client.getOutputStream();
            InputStream in = client.getInputStream();
            PrintWriter pw = new PrintWriter(os, true);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while(true){
                String n = br.readLine();
                System.out.println("From Client = " + n);
                pw.println("Echo from Server = " + n);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(7);

            while(true){
                Socket s = ss.accept();
                SP tes = new SP(s);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
};