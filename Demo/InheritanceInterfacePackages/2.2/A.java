import java.io.*;
import java.util.*;

interface Demo {
    int data = 12;

    void display();
};

class Example implements Demo {
    public void show(){
        System.out.println("This is a Inteface Data: " + data);
    }

    @Override
    public void display(){
        System.out.println("This is a Example Class who implemented Demo Interface");
    }
};

public class A {
    public static void main(String[] args) {
        Example obj = new Example();

        obj.show();
        obj.display();
    }
};