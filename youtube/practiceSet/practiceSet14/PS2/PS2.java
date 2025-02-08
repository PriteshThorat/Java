//import java.lang.*;
//import java.io.*;
import java.util.*;

public class PS2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1, num2, div;

        System.out.println("Enter num1: ");
        num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        num2 = sc.nextInt();

        try{
            div = num1 / num2;
            System.out.println("The Division of " + num1 + " and " + num2 + " is " + div);
        }catch(ArithmeticException e){
            System.out.println("HaHa");
        }catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }catch(Exception e){
            System.out.println(e);
        }
    }
};