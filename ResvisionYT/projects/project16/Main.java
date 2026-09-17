class MyClass {
  int a;

  MyClass (int a) {
    this.a = a;
  }

  public int getA () {
    return this.a;
  }
}

class SecondClass extends MyClass {
  SecondClass (int a) {
    super(a);

    System.out.println("I am an construtor");
  }
}

public class Main {
  public static void main (String[] args) {
    MyClass myClass = new MyClass(5);
    SecondClass secondClass = new SecondClass(5);

    System.out.println(myClass.getA());
  }
}
