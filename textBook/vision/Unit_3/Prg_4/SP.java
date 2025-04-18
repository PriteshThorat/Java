import java.net.*;
import java.io.*;

public class SP {
    public static boolean prime(int num) {
        boolean prime = false;
        int i;

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            } else {
                prime = true;  
            }
        }
        return prime;
    }
    public static void main(String[] args) throws IOException{
        int port = 8088, num1;
        
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
                num1 = Integer.parseInt(temp);

                if(num1 == 1){
                    p.println("1 is not prime");
                }else if(prime(num1)){
                    p.println(num1 + " is prime");
                }else{
                    p.println(num1 + " is not prime");
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