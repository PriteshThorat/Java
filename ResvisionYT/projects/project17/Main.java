class A {
  public void method2 () {
    System.out.println("I am method 2 of Class A");
  }
}

class B extends A {
  @Override 
  public void method2 () {
    System.out.println("I am method 2 of Class B");
  }
}

public class Main {
  public static void main(String[] args) {
    A a = new A();
    a.method2();

    B b = new B();
    b.method2();
  }
}