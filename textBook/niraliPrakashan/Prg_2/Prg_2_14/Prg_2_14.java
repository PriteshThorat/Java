import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_2_14{
    public static void main(String[] args){
        average(15, 100);
        average(15, 100, 150);
        average(15, 100, 105, 210);
    }

    static void average(int ...num){
        double sum = 0, avg;
        int i;
        for(i = 0; i < num.length; i++){
            sum += num[i];
        }
        avg = sum / num.length;
        System.out.println("Average = " + avg);
    }
};