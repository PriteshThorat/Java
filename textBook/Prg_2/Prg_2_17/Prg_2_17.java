import java.io.*;
import java.lang.*;
import java.util.*;

class Rectangle extends Object{
  private double length, breadth;

  Rectangle(double x, double y){
    length = x;
    breadth = y;
  }

  public void area(){
    System.out.println("Area of rectangle is = " + length * breadth);
  }

  public void circumference(){
    System.out.println("Circumference of Rectangle is = " + 2 * (length * breadth));
  }
}

public class Prg_2_17{
  public static void main(String[] args){
    Rectangle r = new Rectangle(10, 20);
    Rectangle r1 = new Rectangle(10, 20);
    System.out.println("String Representaion = " + r.toString());
    System.out.println("Class Name: " + r.getClass());
    System.out.println("Hash Code: " + r.hashCode());
    System.out.println("r.equals(r1) = " + r.equals(r1));
  }
};