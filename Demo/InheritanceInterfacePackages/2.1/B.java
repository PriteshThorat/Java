import java.io.*;
import java.util.*;

class Base {
    Base(){
        System.out.println("This is a Base Class Constructor");
    }
};

class Derived1 extends Base {
    Derived1(){
        System.out.println("This is a Derived1 Class Constructor");
    }
};

class Derived2 extends Derived1 {
    Derived2(){
        System.out.println("This is a Derived2 Class Constructor");
    }
};

public class B {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();
    }
};