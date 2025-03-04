import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_2_27{
    public static void main(String[] args){
        Float f1 = 5.6f;
        Double d1 = 0.0 / 0.0;
        Double d2 = Double.MAX_VALUE;
        Float f = Float.parseFloat("6.3");
        System.out.println("Value: " + f);
        System.out.println("Max Double: " + d2);
        System.out.println("String: " + f);
        if(d1.isNaN())
            System.out.println("d1: " + d1);
    }
};