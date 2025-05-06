import java.io.*;
import java.util.*;

interface Base1{
    void show();
};

class Base2 {
    public void out(){
        System.out.println("This is a Base2 Class out()");
    }
};

class Derived extends Base2 implements Base1 {
    public void display(){
        System.out.println("This is a Derived Class diplay()");
    }

    @Override
    public void show(){
        System.out.println("This is a Base1 Class show()");
    }
};

public class C {
    public static void main(String[] args) {
        Derived d = new Derived();

        d.out();
        d.show();
        d.display();
    }
};