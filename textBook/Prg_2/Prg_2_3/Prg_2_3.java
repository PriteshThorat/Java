import java.io.*;
import java.util.*;
import java.lang.*;

class Circle{
  int radius;
  float perimenter;
  float area;
}

public class Prg_2_3{
  public static void main(String[] args){
    final float PI = 3.14f;
    
    Circle c = new Circle();

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the radius: ");
    c.radius = sc.nextInt();
    c.perimenter = 2 * PI * (float) c.radius;
    c.area = PI * (float) c.radius * (float) c.radius;
    System.out.println("Perimenter: " + c.perimenter);
    System.out.println("Area: " + c.area);
  }
};