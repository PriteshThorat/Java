import java.io.*;
import java.util.*;

abstract class Base {
    public void display(){
        System.out.println("This is Not a Abstract Method, so it's defination is in Base Class");
    }

    abstract public void show();
};

class Derived extends Base {
    @Override
    public void show(){
        System.out.println("This is a Abstract Methos, so it's defination in in Derived Class");
    }
};

public class E {
    public static void main(String[] args) {
        Derived d = new Derived();

        d.display();
        d.show();
    }
};