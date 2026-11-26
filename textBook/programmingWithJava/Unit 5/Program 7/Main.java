public class Main {
  public static void main(String[] args) {
    int a = 10, b = 5, c = 8, d = 2;
    float x = 6.4F, y = 3.0F;

    int answer1 = a * b + c / d;
    int answer2 = a * (b + c) / d;

    float answer3 = a / c;
    float answer4 = (float) a / c;
    float answer5 = a / y;

    int answer6 = a % c;
    float answer7 = x % y;

    boolean bool1 = a > b && c > d;
    boolean bool2 = a < b && c > d;
    boolean bool3 = a < b || c > d;
    boolean bool4 = !(a - b == c);
    System.out.println("Order of Evaluation");
    System.out.println("a * b + c / d = " + answer1);
    System.out.println("a * (b + c) / d = " + answer2);
    System.out.println("Type Conversion");
    System.out.println("a / c = " + answer3);
    System.out.println("(float) a / c = " + answer4);
    System.out.println("a / y = " + answer5);
    System.out.println("Modules Operations");
    System.out.println("a % c = " + answer6);
    System.out.println("x % y = " + answer7);
    System.out.println("Logical Operations");
    System.out.println("a > b && c > d = " + bool1);
    System.out.println("a < b && c > d = " + bool2);
    System.out.println("a < b || c > d = " + bool3);
    System.out.println("!(a - b == c) = " + bool4);
  }
}