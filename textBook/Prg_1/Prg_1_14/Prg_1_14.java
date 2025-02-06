import java.io.*;
import java.lang.*;

public class Prg_1_14{
    public static void main(String[] args){
        int num = 1;
        do{
            System.out.print("Square of ");
            System.out.print(num + ": ");
            System.out.println(num * num);
            num++;
        }while(num <= 10);
    }
};