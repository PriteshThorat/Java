import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_4_1{
    public static void main(String[] args){
        int x = 56;
        int y = 0;
        
        try{
            int z = x / y;
            System.out.println("Value: " + z);
        }catch(ArithmeticException e){
            System.out.println("DIVISION BY ZERO");
        }
        System.out.println("End of program...");
    }
};