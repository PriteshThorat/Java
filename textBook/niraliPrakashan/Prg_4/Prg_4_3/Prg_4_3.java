import java.lang.*;
import java.util.*;
import java.io.*;

public class Prg_4_3{
    public static void main(String[] args){
        int x, z;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        x = in.nextInt();

        try{
            z = 82 / x;
            System.out.println("Division: " + z);

            try{
                int a = 100 / (x - 1);
                short arr[] = {15};
                arr[10] = 25;
                System.out.println("Inner try end...");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array indexing wrong");
            }

            System.out.println("Outer try end...");
        }catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        
        System.out.println("Program end...");
    }
};