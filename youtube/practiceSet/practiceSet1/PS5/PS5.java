import java.io.*;
import java.lang.*;
import java.util.*;

public class PS5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        boolean isInt = sc.hasNextInt();
        System.out.print("The given numbwer is " + (isInt ? "Integer" : "Not an Integer"));
    }
};