import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_4_8{
    public static void main(String[] args){
        try{
            // interval = 0;
            // int m = 100
            int []x = new int[-5];
            System.out.println("No output");
        }catch(ArithmeticException e){
            System.out.println("Exception: " + e);
        }finally{
            System.out.println("Program end");
            System.out.println("Bye bye...");
        }
    }
};