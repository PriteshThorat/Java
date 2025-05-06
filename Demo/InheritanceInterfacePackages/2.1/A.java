import java.io.*;
import java.util.*;

class Base {
    Base(){
        System.out.println("This is a Base Class");
    }
};

class Derived extends Base {
    Derived(){
        System.out.println("This is a Derived Class");
    }
};

public class A {
    public static void main(String[] args) {
        Derived obj = new Derived();
    }
};