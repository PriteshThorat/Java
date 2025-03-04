import java.io.*;
import java.lang.*;
import java.util.*;

abstract class Shape{
    double pi = 3.14;

    abstract void area();
    void display(){
        System.out.println("\n Non_abstract method of Class Shape");
    }
};

class Rectangle extends Shape{
    int l, b;

    Rectangle(int x, int y){
        l = x;
        b = y;
    }

    @Override
    void area(){
        System.out.println("\n Area of Rectangle");
        System.out.println("Length = " + l);
        System.out.println("Breadth = " + b);
        System.out.println("Area = " + (l * b));
    }
};

class Circle extends Shape{
    double r;

    Circle(double x){
        r = x;
    }

    @Override
    void area(){
        System.out.println("\n Area of circle");
        System.out.println("Radius = " + r);
        System.out.println("Area = " + (pi * r * r));
    }
};

public class Prg_2_51{
    public static void main(String[] args){
        Shape s;
        Rectangle r = new Rectangle(10, 5);
        s = r;
        s.area();
        Circle c = new Circle(2.5);
        c.area();
    }
};