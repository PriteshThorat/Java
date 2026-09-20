import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int marks[] = {56, 35, 89};
    System.out.print("Enter the array Index: ");
    int index = sc.nextInt();
    System.out.print("Enter the number you want to divide with: ");
    int number = sc.nextInt();

    try {
      System.out.println("The value at array index entered is: " + marks[index]);
      System.out.println("The value of array-value/index is: " + marks[index]/number);
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}