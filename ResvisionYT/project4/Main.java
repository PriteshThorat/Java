import java.util.Scanner;

public class Main {
  public static void main (String args[]) {
    System.out.println("Taking input from the user!");

    Scanner sc = new Scanner(System.in);

    // System.out.print("Enter number 1: ");
    // int a = sc.nextInt();
    // float a = sc.nextFloat();
    // System.out.print("Enter number 2: ");
    //int b = sc.nextInt();
    // float b = sc.nextFloat();
    // int sum = a + b;
    // float sum = a + b;
    // System.out.println("The sum of these numbers is: " + sum);

    // boolean b1 = sc.hasNextInt();
    // System.out.print(b1);

    // String str = sc.next();
    // System.out.print(str);

    String str = sc.nextLine();
    System.out.print(str);

    sc.close();
  }
}