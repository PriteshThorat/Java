public class Main {
  public static int method () {
    try {
      int a = 50;
      int b = 0;
      int c = a / b;

      return c;
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("I am finally.");
    }

    return -1;
  }

  public static void main(String[] args) {
    int k = method();
    System.out.println(k);
  }
}