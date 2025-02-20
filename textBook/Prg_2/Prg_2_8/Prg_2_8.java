import java.lang.*;
import java.io.*;
import java.util.*;

class StudentInfo{
  int rollno;
  int marks1;
  int marks2;
  int total;

  StudentInfo(){
    rollno = 2;
    marks1 = 30;
    marks2 = 40;
  }

  int total(){
    total = marks1 + marks2;
    return total;
  }

  void displayResult(){
    System.out.println("Rollno: " + rollno);
    System.out.println("Marks1: " + marks1);
    System.out.println("Marks2: " + marks2);
    System.out.println("Total: " + total());
  }
};

public class Prg_2_8{
  public static void main(String[] args){
    int total1, total2, grandTotal;
    StudentInfo s1 = new StudentInfo();
    StudentInfo s2 = new StudentInfo();
    total1 = s1.total();
    total2 = s2.total();
    grandTotal = total1 + total2;
    s1.displayResult();
    s2.displayResult();
    System.out.println("Grand Total: " + grandTotal);
  }
}