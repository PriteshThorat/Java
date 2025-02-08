import java.io.*;
import java.util.*;
import java.util.*;

public class PS1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String lowerStr = str.toLowerCase();
        System.out.println("The Lower Case of " + str + " is " + lowerStr);
    }
};