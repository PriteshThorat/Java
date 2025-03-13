// Write a program to create a user defined exception in java.

import java.util.*;

class MyException extends Exception{
  public MyException(String msg){
    super(msg);
  }
};

public class Q2c{
  public static void main(String[] args){
    int a, b, c;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st No.: ");
    a = sc.nextInt();
    System.out.print("Enter 2nd No.: ");
    b = sc.nextInt();

    try{
      if(b == 0)
        throw new MyException("Divide BY Zero Exception");

      c = a / b;
      System.out.println(a + " / " + b + " = " + c);
    }catch(MyException e){
      System.out.println(e);
    }
  }
};