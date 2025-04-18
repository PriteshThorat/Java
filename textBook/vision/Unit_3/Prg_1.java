import java.net.*;

public class Prg_1{
    public static void main(String[] args) throws MalformedURLException{
        URL netAddress = new URL("https://wwww.msbte.com");
        System.out.println("Port: " + netAddress.getPort());
        System.out.println("Host: " + netAddress.getHost());
    }
};