import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_2_22{
  public static void main(String[] args){
    int array[] = new int[10];
    for(int i = 0; i < 10; i++)
      array[i] = 3 * i;

    System.out.print("Original contents: ");
    display(array);
    Arrays.sort(array);

    System.out.print("Sorted: ");
    display(array);

    Arrays.fill(array, 2, 6 , 5);
    System.out.print("After fill(): ");
    display(array);
    Arrays.sort(array);
    System.out.print("After sorting again: ");
    display(array);
    System.out.print("The value 21 is at location ");
    int index = Arrays.binarySearch(array, 21);
    System.out.println(index);
  }

  static void display(int array[]){
    for(int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }
};