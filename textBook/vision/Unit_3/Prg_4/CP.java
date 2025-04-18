import java.net.*;
import java.io.*;

public class CP {
    public static void main(String[] args) throws IOException{
        Socket s;
        BufferedReader b;
        String str;

        try{
            s = new Socket("127.0.0.1", 8088);
            b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter p = new PrintWriter(s.getOutputStream(), true);
            System.out.println("Enter number");
            String s1 = bb.readLine();
            p.println(s1);

            while((str = b.readLine()) != null){
                System.out.println(str);
            }
            b.close();
            s.close();
            p.close();
        }catch(UnknownHostException e){
            System.out.print("UnknownHostException is " + e.toString());
        }catch(IOException e){
            System.out.print("IOException is " + e.toString());
        }
    }
};