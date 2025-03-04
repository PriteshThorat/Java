import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_2_18{
  public static void main(String[] args){
    int a[] = {2, 5, 6, 7, 8};
    System.out.println("Number of elements in array A: " + a.length);
    System.out.println("Elements in array A: ");
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + "\t");
    }
  }
};