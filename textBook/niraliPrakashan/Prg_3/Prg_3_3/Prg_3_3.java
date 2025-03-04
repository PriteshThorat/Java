import java.io.*;
import java.lang.*;
import java.util.*;

interface AreaCal{
    final double PI = 3.14;

    double areacalculation(double r);
};

class Circle implements AreaCal{
    @Override
    public double areacalculation(double r){
        double ar;
        ar = PI * r * r;
        return ar;
    }
};

public class Prg_3_3{
    public static void main(String[] args){
        double area;
        AreaCal ac = new Circle();
        area = ac.areacalculation(10.25);
        System.out.println("Area of Circle is: " + area);
    }
};