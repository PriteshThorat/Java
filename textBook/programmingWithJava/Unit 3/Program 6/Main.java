import java.util.Scanner;

class SmartCard {
  int empIdn;

  public void markAttendance (Employee e) {
    empIdn = e.getEmpId();

    System.out.println("Employee " + empIdn + " is marked Present.");
  }

  public int getEmpIdn (Employee e) {
    return e.empid;
  }
}

class Employee {
  int empid;

  Employee () {
    System.out.print("Enter Employee ID: ");
    Scanner sc = new Scanner(System.in);
    this.empid = sc.nextInt();
    sc.close();
  }

  int getEmpId () {
    return empid;
  }
  public void login (SmartCard sc) {
    int eid = sc.getEmpIdn(this);
    System.out.println("Login Successful for Employee " + eid);
  }
}

public class Main {
  public static void main (String args[]) throws Exception {
    System.out.println("*** ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD ***");
    Employee e = new Employee();
    System.out.println("NEW EMPLOYEE IS CREATED");
    SmartCard scd = new SmartCard();
    scd.markAttendance(e);
    e.login(scd);
  }
}