import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Enter two Values: ");
    Scanner sc = new Scanner(System.in);
    BigDecimal bd1 = sc.nextBigDecimal();
    BigDecimal bd2 = sc.nextBigDecimal();
    System.out.println("Result is = " + bd1.add(bd2));

    sc.close();
  }
}