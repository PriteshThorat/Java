import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_1_15{
    public static void main(String[] args){
        int fact = 1, num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = input.nextInt();
        for(int i = 1; i <= num; i++){
            fact = fact * i;
            System.out.println("Factorial: " + fact);
        }
    }
};