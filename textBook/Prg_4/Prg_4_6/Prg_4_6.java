import java.lang.*;
import java.io.*;
import java.util.*;

public class  Prg_4_6{
    public static void main(String[] args){
        int x = 10, y = 20;
        int z;
        z = x + y;

        try{
            throw new ArithmeticException();
        }catch(Exception e){
            System.out.println("Exception caught");
            System.out.println("Addition: " + z);
        }
    }
};