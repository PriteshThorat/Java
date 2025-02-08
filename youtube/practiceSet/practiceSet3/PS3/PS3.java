import java.io.*;
import java.util.*;
import java.lang.*;

public class PS3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String letter = "Dear <|name|>, Thanks a lot";

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String newLetter = letter.replace("<|name|>", name);
        System.out.println(newLetter);
    }
};