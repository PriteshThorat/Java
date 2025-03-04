import java.io.*;
import java.lang.*;
import java.util.*;

interface Constants{
    double PI = 3.14;
    String unit = " sq.cm";
};

interface Values{
    int cir = 2;
};

public class Prg_3_2 implements Constants{
    public static void main(String[] args){
        double rad = 5.83;
        System.out.println("Area of circle: ");
        System.out.println(PI * rad * rad + unit);
        System.out.println("Perimeter of circle: ");
        System.out.println(Values.cir * PI * rad);
    }
};