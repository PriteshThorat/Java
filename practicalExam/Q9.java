// Write program to retrieve hostname and IP address using InetAddress class.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q9 {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();

            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("IP Address: " + localHost.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Unable to retrieve host information.");
            e.printStackTrace();
        }
    }
};