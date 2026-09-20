class NegativeRadiusException extends Exception {
  NegativeRadiusException () {
    super("Radius cannot be negative.");
  }
}

public class Main {
  public static double area (int r) throws NegativeRadiusException {
    if (r < 0) {
      throw new NegativeRadiusException();
    }

    double result = Math.PI * r * r;

    return result;
  }

  public static int divide (int a, int b) throws ArithmeticException {
    int result = a/b;

    return result;
  }

  public static void main(String[] args) {
    // try {
    //   int c = divide(6, 0);
    //   System.out.println(c);
    // } catch (Exception e) {
    //   System.out.println(e);
    // }

    try {
      double area = area(-5);
      System.out.println(area);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}