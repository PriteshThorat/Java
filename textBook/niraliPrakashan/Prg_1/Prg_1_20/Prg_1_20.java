import java.io.*;
import java.lang.*;

public class Prg_1_20{
    public static void main(String[] args){
        int i = 1, j = 1, k;
        do{
            k = 3;
            do{
                System.out.print(" ");
                k--;
            }while(k >= i);
            j = 1;
            do{
                System.out.print(i + " ");
                j++;
            }while(j <= i);
            System.out.println();
            i++;
        }while(i <= 5);
    }
};