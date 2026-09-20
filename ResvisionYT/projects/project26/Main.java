import myPackage.Jym;

class MyClass extends Jym {
  void method2 () {
    System.out.println(x);
    System.out.println(y); 
    // System.out.println(z); // Invalid
    // System.out.println(a); // Invalid
  }
}

public class Main {
  public static void main(String[] args) {
    // Jym j = new Jym();

    // System.out.println(j.x);
    // System.out.println(j.y); // Invalid
    // System.out.println(j.z); // Invalid
    // System.out.println(j.a); // Invalid

    MyClass myClass = new MyClass();
    myClass.method1();
  }
}