// Write a Java program to find out the even numbers from 1 to 100 using for loop.

import java.util.*;

public class Q3a{
  public static void main(String[] args){
    System.out.println("Even No.: ");
    for(int i = 1; i <= 100; i++){
      if(i % 2 == 0)
        System.out.println(i);
    }
  }
};