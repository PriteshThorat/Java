import java.io.*;
import java.lang.*;
import java.util.*;

public class PS3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Hello " + name + ", have a good day");
    }
}