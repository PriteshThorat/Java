// Write a program to implement the following inheritance.

import java.lang.*;
import java.util.*;
import java.io.*;

interface Exam{
  int sportsMarks = 20;
};

class Student{
  int rollNo, m1, m2, m3;
  String sName;

  Scanner sc = new Scanner(System.in);

  void input(){
    System.out.print("Enter Roll No.: ");
    rollNo = sc.nextInt();
    System.out.print("Enter Name: ");
    sName = sc.next();
    System.out.print("Enter Marks: ");
    m1 = sc.nextInt();
    m2 = sc.nextInt();
    m3 = sc.nextInt();
  }
};

class Result extends Student implements Exam{
  public void display(){
    System.out.println("Roll No: " + rollNo);
    System.out.println("Name: " + sName);
    System.out.println("First Subject Marks: " + m1);
    System.out.println("Second Subject Marks: " + m2);
    System.out.println("Third Subject Marks: " + m3);
    System.out.println("Sports Subject Marks: " + sportsMarks);
  }
};

public class Q5b{
  public static void main(String[] args){
    Result r = new Result();
    r.input();
    r.display();
  }
};