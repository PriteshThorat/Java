import java.net.*;

public class Prg_2 {
    public static void main(String[] args) throws MalformedURLException{
        URL ul = new URL("https://www.msbte.com");
        String s1 = ul.getProtocol();
        String s2 = ul.getFile();
        String s3 = ul.getHost();
        int n = ul.getPort();

        System.out.println("Protocol name: " + s1);
        System.out.println("File name: " + s2);
        System.out.println("Host Name: " + s3);
        System.out.println("Port No: " + n);
        System.out.println("Exit: " + ul.toExternalForm());
    }
};