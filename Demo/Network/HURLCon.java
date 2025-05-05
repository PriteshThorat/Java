import java.io.*;
import java.net.*;

public class HURLCon {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.example.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while((inputLine = input.readLine()) != null){
                response.append(inputLine);
            }

            input.close();
            System.out.println(response.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};