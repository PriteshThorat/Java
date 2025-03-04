import java.lang.*;
import java.util.*;
import java.io.*;

public class Prg_4_4{
    public static void myMeth(){
        try{
            int arr[] = new int[-2];
            arr[4] = 10;
        }catch(ArithmeticException e){
            System.out.println("Exception: " + e);
        }
    }

    public static void main(String[] args){
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = in.nextInt();

        try{
            b = 40 / a;
            System.out.println("Division: " + b);
            Prg_4_4.myMeth();
        }catch(NegativeArraySizeException e){
            System.out.println("Exception: " + e);
        }

        System.out.println("Program end...");
    }
};