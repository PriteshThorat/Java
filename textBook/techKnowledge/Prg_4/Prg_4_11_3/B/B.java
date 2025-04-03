import java.io.*;
import java.net.*;

public class B{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(100);
        Socket s = ss.accept();
        DataInputStream dis2 = new DataInputStream(s.getInputStream());
        DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
        String str = dis2.readUTF();
        String nums[] = str.split(",");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);
        int lar = 0;
        if(a > b && a > c){
            lar = a;
        }
        if(b > a && b > c){
            lar = b;
        }
        if(c > a && c > b){
            lar = c;
        }
        dos2.writeUTF("" + lar);
        ss.close();
        s.close();
    }
};