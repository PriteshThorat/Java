import java.io.*;
import java.util.*;
import java.lang.*;

class Number{
  int max(int x, int y){
    if(x > y)
      return x;
    else
      return y;
  }

  int min(int x, int y){
    if(x < y)
      return x;
    else
      return y;
  }
}

class Prg_2_5{
  public static void main(String[] args){
    int a, b;
    int mx, mn;
    Number n = new Number();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    a = sc.nextInt();
    System.out.print("Enter the second number: ");
    b = sc.nextInt();
    mx = n.max(a, b);
    System.out.println("The maximum number is: " + mx);
    mn = n.min(a, b);
    System.out.println("The minimum number is: " + mn);
  }
};