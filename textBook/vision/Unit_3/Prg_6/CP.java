import java.net.*;
import java.io.*;

public class CP{
    public static void main(String[] args){
        try{
            Socket s = new Socket(InetAddress.getLocalHost(), 7);
            OutputStream os = s.getOutputStream();
            InputStream in = s.getInputStream();
            PrintWriter pw = new PrintWriter(os, true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader brs = new BufferedReader(new InputStreamReader(in));

            while(true){
                String n = br.readLine();
                pw.println(n);
                System.out.println(brs.readLine());
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
};