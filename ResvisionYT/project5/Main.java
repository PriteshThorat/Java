import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    float mark1, mark2, mark3, mark4, mark5;

    System.out.print("Enter Marks of 1st Subject: ");
    mark1 = sc.nextInt();
    System.out.print("Enter Marks of 2nd Subject: ");
    mark2 = sc.nextInt();
    System.out.print("Enter Marks of 3rd Subject: ");
    mark3 = sc.nextInt();
    System.out.print("Enter Marks of 4th Subject: ");
    mark4 = sc.nextInt();
    System.out.print("Enter Marks of 5th Subject: ");
    mark5 = sc.nextInt();

    float percentage = ((mark1 + mark2 + mark3 + mark4 + mark5) / 500) * 100 ;
    System.out.println("The total percntage is: " + percentage + "%");
  }
}