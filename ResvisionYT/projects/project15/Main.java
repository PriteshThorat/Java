class Base {
  Base () {
    System.out.println("I am a construtor");
  }
  Base (int x) {
    System.out.println("I am an overloaded construtor with value of x as " + x);
  }
}

class Derived extends Base {
  Derived () {
    // super(0);
    
    System.out.println("I am a derived class construtor");
  }
  Derived (int x, int y) {
    super(x);

    System.out.println("I am a overloaded derived class construtor with value of y as " + y);
  }
}

class ChildOfDerived extends Derived {
  ChildOfDerived () {
    System.out.println("I am child of Derived Constructor");
  }
  ChildOfDerived (int x, int y, int z) {
    super(x, y);

    System.out.println("I am a overloaded child derived class construtor with value of z as " + z);
  }
}

public class Main {
  public static void main (String[] args) {
    // Base b = new Base();
    // Derived d = new Derived();
    // Derived d = new Derived(5, 6);
    ChildOfDerived cd = new ChildOfDerived(5, 6, 7);
  }
}