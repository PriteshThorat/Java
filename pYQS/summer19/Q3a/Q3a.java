// Define a class student with int id and string name as data members and a method void SetData ( ). Accept and display the data for five students.

import java.lang.*;
import java.util.*;
import java.io.*;

class Student{
  int id;
  String name;

  void setData(int id, String name){
    this.id = id;
    this.name = name;
  }
};

public class Q3a{
  public static void main(String[] args){
    Student s[] = new Student[5];
    Scanner sc = new Scanner(System.in);

    int id;
    String name;

    for(int i = 0; i < 5; i++){
      s[i] = new Student();
      System.out.print("Enter ID: ");
      id = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter Name: ");
      name = sc.nextLine();
      s[i].setData(id, name);
    }
    for(int i = 0; i < 5; i++){
      System.out.println("Student " + (i + 1) + ": ");
      System.out.println("ID: " + s[i].id);
      System.out.println("Name: " + s[i].name);
    }
  }
};