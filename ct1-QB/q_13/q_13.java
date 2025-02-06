import java.io.*;
import java.util.*;
import java.lang.*;

// Single Inheritance

class Base{
  public void display(){
    System.out.println("Base class of Single Inheritance");
  }
};

class Derived extends Base{
  public void output(){
    System.out.println("Derived class of Single Inheritance");
  }
};

// Multilevel Inheritance

class Base1{
  public void display(){
    System.out.println("Base class of Multilevel Inheritance");
  }
}

class Derived1 extends Base1{
  public void display1(){
    System.out.println("Intermediate class of Multilevel Inheritance");
  }
}

class Derived2 extends Derived1{
  public void display2(){
    System.out.println("Derived class of Multilevel Inheritance");
  }
};

// Hierarchical Inheritance

class Base2{
  public void display(){
    System.out.println("Base class of Hierarchical Inheritance");
  }
}

class Derived3 extends Base2{
  public void display1(){
    System.out.println("1st Child class of Hierarchical Inheritance");
  }
}

class Derived4 extends Base2{
  public void display2(){
    System.out.println("2nd Child class of Hierarchical Inheritance");
  }
};

public class q_13{
  public static void main(String[] args){
    // Single Inheritance
    Derived d = new Derived();
    d.display();
    d.output();

    // Multilevel Inheritance
    Derived2 d1 = new Derived2();
    d1.display();
    d1.display1();
    d1.display2();

    // Hierarchical Inheritance
    Derived3 d2 = new Derived3();
    Derived4 d3 = new Derived4();
    d2.display();
    d2.display1();
    d3.display();
    d3.display2();
  }
};