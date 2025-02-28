package Prg_3_10;

class Protection2 extends first.Protection{
  Protection2(){
    System.out.println("Keen constructor");
    // System.out.println("n = " + n);
    // System.out.println("n_pri = " + n_pri);
    System.out.println("n_pro = " + n_pro);
    System.out.println("n_pub = " + n_pub);
  }
};

public class OtherPackage{
  OtherPackage(){
    first.Protection p = new first.Protection();
    // System.out.println("n = " + p.n);
    // System.out.println("n_pri = " + p.n_pri);
    // System.out.println("n_pro = " + p.n_pro);
    System.out.println("n_pub = " + p.n_pub);;
  }
};