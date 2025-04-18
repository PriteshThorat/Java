import java.net.*;
import java.io.*;

public class CP {
    public static void main(String[] args) throws Exception{
        Socket s;
        BufferedReader b;
        String  str;

        try{
            s = new Socket("localhost", 8088);
            b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter p = new PrintWriter(s.getOutputStream(), true);
            System.out.println("Enter Password: ");
            String s1 = bb.readLine();
            p.println(s1);
            while((str = b.readLine()) != null){
                System.out.println(str);
            }
            b.close();
            s.close();
        }catch(UnknownHostException e){
            System.out.print("UnknownException is " + e.toString());
        }catch(IOException e){
            System.out.print("IOException is " + e.toString());
        }
    }
};