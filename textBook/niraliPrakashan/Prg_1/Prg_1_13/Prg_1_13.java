import java.io.*;
import java.lang.*;

public class Prg_1_13{
    public static void main(String[] args){
        int a = 0, sum = 0;
        while(a <= 10){
            sum = sum + a;
            a++;
        }
        System.out.println("Addition is " + sum);
    }
};