import java.lang.*;
import java.util.*;
import java.io.*;

public class Prg_4_2{
    public static void main(String[] args){
        int x = 56;
        int y = 0;

        try{
            int z = x / y;
            System.out.println("Value: " + z);
        }catch(ArithmeticException e){
            System.out.println("getMessage:");
            System.out.println(e.getMessage());
            System.out.println("\n printStackTrace:");
            e.printStackTrace();
            System.out.println("\n toString:");
            System.out.println(e.toString());
            System.out.println("\n Referring object:");
            System.out.println(e);
        }
        System.out.println("\n End of program...");
    }
};