import java.net.*;

public class Prg_4_4_2{
    public static void main(String[] args) throws Exception{
        InetAddress addr1 = InetAddress.getByName("ptu.ac.in");
        InetAddress addr2 = InetAddress.getByName("msbte.org.in");

        System.out.println("\nIs " + addr1 + " equals " + addr2 + " ?: " + addr1.equals(addr2));
        System.out.println("\nHost Address of " + addr1 + " is: " + addr1.getHostAddress());
        System.out.println("\nHost Name of " + addr1 + " is: " + addr1.getHostName());
        System.out.println("\nIs " + addr1 + " a Multicast Address ?: " + addr1.isMulticastAddress());
        System.out.println("\nCoversion of " + addr1 + " to String is: " + addr1.toString());
    }
};