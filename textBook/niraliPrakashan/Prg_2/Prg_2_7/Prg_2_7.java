import java.lang.*;
  
  class Rectangle{
    int length;
    int breadth;
  
    Rectangle(){
      length = 5;
      breadth = 6;
    }

    int area(){
      int rectArea = length * breadth;
      return rectArea;
    }
};

public class Prg_2_7{
  public static void main(String[] args){
    Rectangle r1 = new Rectangle();
    System.out.println("Area: " + r1.area());
  }
};