import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      int k;
      k = sc.nextInt();
      System.out.println("Integer part 1000 is divided by k is " + 1000/k);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("End of main function");
  }
}