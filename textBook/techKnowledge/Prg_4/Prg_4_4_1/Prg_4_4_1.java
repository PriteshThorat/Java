import java.net.*;

public class Prg_4_4_1{
    public static void main(String[] args) throws UnknownHostException{
        InetAddress addr1 = InetAddress.getLocalHost();
        System.out.println(addr1);
        InetAddress addr2 = InetAddress.getByName("msbte.org.in");
        System.out.println(addr2);
        InetAddress addr3[] = InetAddress.getAllByName("www.google.com");
        for(int i = 0; i < addr3.length; i++)
            System.out.println(addr3[i]);
    }
};