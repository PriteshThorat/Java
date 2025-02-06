import java.io.*;
import java.util.*;
import java.lang.*;

class Base{
  public void display(){
    System.out.println("Base class");
  }

  public void msg(){
    System.out.println("Base class msg");
  }
};

class Dervied extends Base{
  @Override
  public void display(){
    System.out.println("Derived class");
  }

  public void hii(){
    System.out.println("I am from hii method");
  }
};

public class q_11{ 
  public static void main(String[] args){
    Base d = new Dervied();
    d.display();
    // d.hii()
    d.msg();
  }
};