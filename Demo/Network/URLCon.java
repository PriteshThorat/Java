import java.net.*;
import java.io.*;

public class URLCon {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.example.com");
            URLConnection con = url.openConnection();

            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            while((inputLine = input.readLine()) != null){
                System.out.println(inputLine);
            }

            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};