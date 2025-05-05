import java.io.*;
import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.example.com/page1?name=java#section1");

            System.out.println("Port: " + url.getPort());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("File: " + url.getFile());
            System.out.println("Fragment: " + url.getRef());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};