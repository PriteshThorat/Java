import java.io.*;
import java.net.*;

public class Prg_4_7_1{
    public static void main(String[] args) throws IOException{
        String st = "https://admissions.puchd.ac.in/";

        if(st.length() != 1){
            System.err.println("usage: java Prg_4_7_1 url");

            return;
        }

        URL url = new URL(st);
        System.out.println("Authority = " + url.getAuthority());
        System.out.println("File = " + url.getFile());
        System.out.println("Host = " + url.getHost());
        System.out.println("Path = " + url.getPath());
        System.out.println("Port = " + url.getPort());
        System.out.println("Protocol = " + url.getProtocol());
        System.out.println("Query = " + url.getQuery());
        System.out.println("Ref = " + url.getRef());
        System.out.println("User Info = " + url.getUserInfo());
        System.out.println();

        InputStream is = url.openStream();

        int ch;
        while((ch = is.read()) != -1)
            System.out.println((char) ch);
        is.close();
    }
};