import java.lang.*;
import java.io.*;
import java.util.*;

class Sample{
  int x = 10, y = 20;
  void display(){
    System.out.println("Value of x= " + x);
    System.out.println("Value of y= " + y);
  }

  void add(){
    display();
    System.out.println("X + Y = " + (x + y));
  }
};

public class Prg_2_10{
  public static void main(String[] args){
    Sample s = new Sample();
    s.add();
  }
};