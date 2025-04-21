// Write program to demonstrate various methods of URL class and URLConnection.

import java.io.*;
import java.net.*;
import java.util.*;

public class Q26 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com/index.html");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("File: " + url.getFile());
            System.out.println("Path: " + url.getPath());
            System.out.println("Port: " + url.getPort());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("User Info: " + url.getUserInfo());

            URLConnection connection = url.openConnection();

            connection.connect();

            System.out.println("\n--- URLConnection Info ---");
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLengthLong());
            System.out.println("Date: " + new Date(connection.getDate()));
            System.out.println("Last Modified: " + new Date(connection.getLastModified()));
            System.out.println("Expiration: " + new Date(connection.getExpiration()));

            System.out.println("\n--- Header Fields ---");
            Map<String, List<String>> headers = connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
};