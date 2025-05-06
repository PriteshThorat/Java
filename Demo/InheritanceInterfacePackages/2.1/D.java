import java.io.*;
import java.util.*;

class Base {
    public void display(){
        System.out.println("This is a Base Class Method");
    }
};

class Derived extends Base {
    @Override
    public void display(){
        System.out.println("This is a Derived Class Method");
    }
};

public class D {
    public static void main(String[] args) {
        Base b = new Base();
        b.display();

        Base d = new Derived();
        d.display();
    }
};