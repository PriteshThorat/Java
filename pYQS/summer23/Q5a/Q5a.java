// Write a program to copy all elements of one array into another array.

import java.util.*;
import java.io.*;
import java.lang.*;

public class Q5a{
  public static void main(String[] args){
    int[] array1 = {5, 35, 32, 64, 75, 63};
    int[] array2 = new int[array1.length];

    System.out.println("The First Array: ");
    for(int i = 0; i < array1.length; i++){
      System.out.println(array1[i]);
      array2[i] = array1[i];
    }
    System.out.println("The Copied Array: ");
    for(int i = 0; i < array2.length; i++){
      System.out.println(array2[i]);
    }
  }
};