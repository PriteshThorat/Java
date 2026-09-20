class C1 {
  public int x = 5;
  protected int y = 7;
  int z = 34;
  private int a = 76;

  public void method1 () {
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(a);
  }
}

public class Main {
  public static void main(String[] args) {
    C1 c = new C1();

    // c.method1();
    System.out.println(c.x);
    System.out.println(c.y);
    System.out.println(c.z);
    // System.out.println(c.a);
  }
}