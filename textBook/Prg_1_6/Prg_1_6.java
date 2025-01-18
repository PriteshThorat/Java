import java.io.*;
import java.lang.*;

public class Prg_1_6{
    public static void main(String args[]){
        int number = -52;
        System.out.println("Number is: " + number);
        if(number > 0)
        if(number % 2 == 0)
        System.out.println("It is positive & even");
        if(number < 0)
        if(number % 2 == 0)
        System.out.println("It is negative & even");
        if(number > 0)
        if(number % 2 != 0)
        System.out.println("It is positive & odd");
        if(number < 0)
        if(number % 2 != 0)
        System.out.println("It is negative & odd");
    }
};