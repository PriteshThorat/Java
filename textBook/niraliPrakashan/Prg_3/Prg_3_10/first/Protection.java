package first;

public class Protection{
  int n = 5;
  private int n_pri = 10;
  protected int n_pro = 43;
  public int n_pub = 92;

  public Protection(){
    System.out.println("Base constructor");
    System.out.println("n_pri = " + n_pri);
    System.out.println("n_pro = " + n_pro);
    System.out.println("n_pub = " + n_pub);
  }
};

class Derived extends Protection{
  Derived(){
    System.out.println("Derived constructor");
    System.out.println("n = " + n);
    // System.out.println("n_pri = " + n_pri);
    System.out.println("n_pro = " + n_pro);
    System.out.println("n_pub = " + n_pub);
  }
}

class SamePackage{
  SamePackage(){
    Protection p = new Protection();
    System.out.println("same package constructor");
    System.out.println("n = " + p.n);
    // System.out.println("n_pri = " + p.n_pri);
    System.out.println("n_pro = " + p.n_pro);
    System.out.println("n_pub = " + p.n_pub);
  }
};