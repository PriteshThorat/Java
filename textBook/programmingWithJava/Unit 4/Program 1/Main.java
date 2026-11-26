import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int intNumber = 0;
    float floatNumber = 0.0f;

    try {
      System.out.print("Enter an Integer: ");
      intNumber = sc.nextInt();
      System.out.print("Enter a float number: ");
      floatNumber = sc.nextFloat();
    } catch (Exception e) {
      System.out.println("Input Error: " + e);
    } 
    System.out.println("intNumber = " + intNumber);
    System.out.println("floatNumber = " + floatNumber);

    sc.close();
  } 
}