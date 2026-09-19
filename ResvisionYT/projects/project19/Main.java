abstract class Parent {
  public Parent () {
    System.out.println("I am an Parent Class Constructor");
  }

  public void sayHello () {
    System.out.println("Hello");
  }
  abstract public void greet1();
  abstract public void greet2();
}

class Child extends Parent {
  @Override 
  public void greet1 () {
    System.out.println("Good Morning");
  }
  @Override 
  public void greet2 () {
    System.out.println("Good Afternoon");
  }
}

abstract class Child2 extends Parent {
  public void method () {
    System.out.println("I am good.");
  }
}

public class Main {
  public static void main(String[] args) {
    // Parent p = new Parent(); // Error
    // Child2 c2 = new Child2(); // Error

    Child c = new Child();
  }
}