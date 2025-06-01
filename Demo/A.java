import java.io.*;
import java.util.*;

class Level1 {
    public void display(){
        System.out.println("Calling Level1 Class display()");
    }
};

class Level2 extends Level1 {
    @Override
    public void display(){
        System.out.println("Calling Level2 Class display()");
    }
};

class Level3 extends Level2 {
    @Override 
    public void display(){
        System.out.println("Calling Level3 Class display()");
    }

    public void show(){
        System.out.println("Calling Level3 Class show()");
    }
};

public class A {
    public static void main(String[] args) {
        Level1 obj1 = new Level1();
        obj1.display();

        Level1 obj2 = new Level2();
        obj2.display();

        Level1 obj3 = new Level3();
        obj3.display();
        
        Level3 obj4 = new Level3();
        obj4.show();
    }
};