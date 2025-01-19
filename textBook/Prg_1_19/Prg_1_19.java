import java.io.*;
import java.lang.*;

public class Prg_1_19{
    public static void main(String[] args){
        int i = 1, j = 1;
        System.out.println("Tables");
        while(i <= 2){
            while(j <= 10){
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            i++;
            System.out.println();
            System.out.println();
        }
    }
};