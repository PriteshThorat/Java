// Write a java program to sort an 1-d array in ascending order using bubble-sort.

import java.util.*;

public class Q4c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int array[] = new int[10];

    System.out.print("Enter 10 Elemets: ");
    for(int i = 0; i < array.length; i++){
      array[i] = sc.nextInt();
    }
    for(int i = 0; i < array.length - 1; i++){
      for(int j = 0; j < array.length - i - 1; j++){
        if(array[j] > array[j + 1]){
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    System.out.print("Sorted Data: ");
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }
};