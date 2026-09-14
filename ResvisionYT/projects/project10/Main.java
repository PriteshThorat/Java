import java.util.Scanner;
//"The Fibono Series is "
public class Main {
  static String fibo (int n) {
    /*if (n == 10) {
      return "";
    }*/

    return  n  + fibo(n + 1);
  }
  
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number to upward the Fibonosis Series: ");
    int n = scanner.nextInt();

    String fibo = fibo(n);
    System.out.println(fibo);
  }
}
