import java.io.*;
import java.lang.*;
import java.util.*;

class A{
    void show(){
        System.out.println("This is within class A");
    }
};

class B extends A{
    @Override
    void show(){
        System.out.println("This is Witihin B");
    }
};

class C extends B{
    @Override
    void show(){
        System.out.println("This is Within C");
    }
}

public class Prg_2_41{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        A ref;
        ref = obj1;
        ref.show();   
        ref = obj2;
        ref.show();
        ref = obj3;
        ref.show();
    }
};