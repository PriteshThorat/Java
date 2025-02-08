import java.io.*;
import java.util.*;
import java.lang.*;

public class PS2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        
        String newStr = str.replace(" ", "_");
        System.out.println("New String: " + newStr);
    }
};