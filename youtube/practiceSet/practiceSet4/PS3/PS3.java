import java.io.*;
import java.util.*;
import java.lang.*;

public class PS3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        float amount = sc.nextFloat();

        if(amount >= 250000 && amount <= 500000){
            System.out.println("You paid " + ((amount * 5) / 100) + " as tax");
        }else if(amount >= 500000 && amount <= 1000000){
            System.out.println("You paid " + ((amount * 10) / 100) + " as tax");
        }else if(amount >= 1000000){
            System.out.println("You paid " + ((amount * 30) / 100) + " as tax");
        }else{
            System.out.println("No Tax");
        }
    }
};