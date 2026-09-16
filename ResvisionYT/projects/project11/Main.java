class Employee {
  int id;
  int salary;
  String name;

  public void printDetails () {
    System.out.println("My ID is " + id);
    System.out.println("And my name is " + name);
  }

  public int getSalary () {
    return salary;
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("This is our custom class.");

    Employee e = new Employee();
    Employee e1 = new Employee();

    e.id = 12;
    e.salary = 20000;
    e.name = "Pritesh Thorat";

    e1.id = 56;
    e1.salary = 600000;
    e1.name = "Artist";

    e.printDetails();
    e1.printDetails();

    int salary = e1.getSalary();
    System.out.println(salary);

    // System.out.println(e.id);
    // System.out.println(e.name);
  }
}