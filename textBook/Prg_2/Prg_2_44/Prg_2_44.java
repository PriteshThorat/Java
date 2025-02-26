import java.io.*;
import java.util.*;
import java.lang.*;

class A{
    final void meth(){
        System.out.println("This is a final method.");
    }
};

class B extends A{
    /*@Override
    void meth(){
        System.out.println("Illegal!");
    }*/
};

public class Prg_2_44{
    public static void main(String[] args){
        B b = new B();
        b.meth();
    }
};