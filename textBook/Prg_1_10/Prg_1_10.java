import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_1_10{
    public static void main(String args[]){
        int choice, num;
       Scanner scan = new Scanner(System.in);
       System.out.println("Menu....");
       System.out.println("1. Find postivie");
       System.out.println("2. Odd/Even");
       System.out.println("Enter your choice: ");
       choice = scan.nextInt();
       switch(choice){
        case 1:
            System.out.println("Enter number: ");
            num = scan.nextInt();
            if(num > 0)
                System.out.println("Postivie...");
            else
                System.out.println("Negative...");
        break;
        case 2:
            System.out.println("Enter number: ");
            num = scan.nextInt();
            if(num % 2 == 0)
                System.out.println("Even...");
            else
                System.out.println("Odd...");
        break;
        default:
            System.out.println("Wrong choice..");
       }
    }
};