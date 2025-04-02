import java.io.*;
import java.net.*;
import java.util.*;

public class Prrg_4_8_1{
    public static void main(String[] args){
        try{
            URL url = new URL("https://msbte.ac.in/");
            URLConnection urlcon = url.openConnection();

            System.out.println(urlcon.getAllowUserInteraction());
            System.out.println(urlcon.getContentType());
            System.out.println(urlcon.getURL());
            System.out.println(urlcon.getDoInput());
            System.out.println(urlcon.getDoOutput());
            System.out.println(new Date(urlcon.getLastModified()));
            System.out.println(urlcon.getContentEncoding());

            Map <String, List<String>> header = urlcon.getHeaderFields();
            for(Map.Entry<String, List<String>> mp : header.entrySet()){
                System.out.println(mp.getKey() + " : ");
                System.out.println(mp.getValue().toString());
            }
            System.out.println();

            System.out.println("Complete source code of the URL is- ");
            System.out.println("--------------------------------------");

            BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String i;

            while((i = br.readLine()) != null){
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
};