// Write a program to input name and salary of employee and throw user defined exception if entered salary is negative.

import java.util.*;

class NegSalException extends Exception{
  public NegSalException(String msg){
    super(msg);
  }
};

public class Q6b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String name;
    int salary;

    System.out.print("Enter Name: ");
    name = sc.nextLine();
    System.out.print("Enter Salary: ");
    salary = sc.nextInt();

    try{
      if(salary < 0){
        throw new NegSalException("Salary Should be Greater than 0");
      }
    }catch(NegSalException e){
      System.out.println(e);
    }
  }
};