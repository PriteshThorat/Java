import java.io.*;
import java.util.*;
import java.lang.*;

class Fact{
  int num = 5;
  int fact = 1;

  public void factorial(){
    for(int i=1; i<=num; i++){
      fact = fact * i;
    }

    System.out.println("Number is: " + num);
    System.out.println("Factorial of number: " + fact);
  }
}

public class Prg_2_2{
  public static void main(String[] args){
    Fact f = new Fact();
    f.factorial();
  }
}