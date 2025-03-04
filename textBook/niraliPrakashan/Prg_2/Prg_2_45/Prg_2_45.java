import java.io.*;
import java.util.*;
import java.lang.*;

class A{
    final void display(){
        System.out.println("hi");
    }
};

public class Prg_2_45 extends A{
    /*@Override
    void display(){
        super.display();
        System.out.println("hello");
    }*/

    public static void main(String[] args){
        Prg_2_45 b = new Prg_2_45();
        b.display();
    }
};