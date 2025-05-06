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

class Derived2 extends Base {
    Derived2(){
        System.out.println("This is a Derived2 Class Constructor");
    }
};

public class C {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2();
    }
};