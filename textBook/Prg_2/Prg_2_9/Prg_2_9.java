import java.lang.*;

class StudentInfo{
  int rollno;
  int marks1;
  int marks2;
  int total;

  StudentInfo(int roll_no, int m1, int m2){
    rollno = roll_no;
    marks1 = m1;
    marks2 = m2;
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

public class Prg_2_9{
  public static void main(String[] args){
    int total1, total2, grandTotal;
    StudentInfo s1 = new StudentInfo(1, 50, 80);
    StudentInfo s2 = new StudentInfo(2, 40, 60);
    total1 = s1.total();
    total2 = s2.total();
    grandTotal = total1 + total2;
    s1.displayResult();
    s2.displayResult();
    System.out.println("Grand Total: " + grandTotal);
  }
};