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
    Student s[5] = new Student();
    Scanner sc = new Scanner(System.in);

    int id;
    String name;

    for(int i = 0; i < 5; i++){
      System.out.print("Enter ID: ");
      id = sc.nextInt();
      System.out.println("Enter Name: ");
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