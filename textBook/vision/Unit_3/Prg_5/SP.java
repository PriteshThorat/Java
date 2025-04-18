import java.net.*;
import java.io.*;

public class SP {
    public static void main(String[] args) throws IOException{
        int port = 8088;
        PrintWriter p = null;
        Socket s = null;
        ServerSocket ss = null;

        try{
            ss = new ServerSocket(8088);
        }catch(IOException e){
            System.out.println("Port 8088 could not be found");
            System.exit(0);
        }

        while(true){
            try{
                s = ss.accept();
                p = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
                BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String temp = b.readLine();

                if(temp.equals("AdvanceJava")){
                    p.println("password is valid");
                }else{
                    p.println("password is invalid");
                }
                p.close();
                s.close();
                b.close();
            }catch(IOException e){
                System.out.println("Accept failed");
                System.exit(1);
            }
        }
    }
};