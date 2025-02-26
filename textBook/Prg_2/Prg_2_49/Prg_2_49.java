import java.io.*;
import java.util.*;
import java.lang.*;

abstract class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
};

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    @Override
    double area(){
        System.out.println("Inside Area of Rectangle.");
        return dim1 * dim2;
    }
};

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    @Override
    double area(){
        System.out.println("Inside Area of Triangle.");
        return dim1 * dim2 / 2;
    }
};

public class Prg_2_49{
    public static void main(String[] args){
        // Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        System.out.println("Area is " + r.area());
        System.out.println("Area is " + t.area());
    }
};