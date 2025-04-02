import java.net.MalformedURLException;
import java.net.URL;

public class Q4 {

    public static void main(String[] args) {
        String urlString = "http://www.msbte.org.in";

        try {
            URL url = new URL(urlString);

            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort(); // Returns -1 if no port is specified in the URL
            String file = url.getFile(); // Returns an empty string if no file is specified

            System.out.println("URL: " + urlString);
            System.out.println("Protocol: " + protocol);
            System.out.println("Host: " + host);
            System.out.println("Port: " + port);
            System.out.println("File: " + file);

        } catch (MalformedURLException e) {
            System.err.println("Error: Invalid URL - " + urlString);
            System.err.println("Reason: " + e.getMessage());
        }
    }
}