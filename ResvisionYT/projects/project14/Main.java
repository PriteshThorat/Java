class Base {
  int x;

  public int getX () {
    return x;
  }
  public void setX (int x) {
    this.x = x;
  }
  public void printMe () {
    System.out.println("I am an construtor");
  }
}

class Derived extends Base {
  int y;

  public int getY () {
    return y;
  }
  public void setY (int y) {
    this.y = y;
  }
}

public class Main {
  public static void main (String[] args) {
    Base b = new Base();

    b.setX(4);
    System.out.println(b.getX());

    Derived d = new Derived();
    d.setX(6);
    System.out.println(d.getX());
    d.setY(9);
    System.out.println(d.getY());
  }
}