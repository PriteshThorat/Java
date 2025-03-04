import java.io.*;
import java.lang.*;
import java.util.*;

class Super{
    int i, j;

    void show(){
        System.out.print("i and j: ");
        System.out.println( + i + " " + j);
    }
};

class Sub extends Super{
    int k;

    void display(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + j + k: " + (i + j + k));
    }
};

public class Prg_2_32{
    public static void main(String[] args){
        Super a;
        Sub b = new Sub();
        b.i = 11;
        b.j = 13;
        b.k = 17;
        System.out.println("Contents of sub: ");
        b.show();
        b.display();
        System.out.println();
        a = b;
        System.out.println("Contents of super: ");
        a.show();
        System.out.println();
        System.out.println("Sum of i, j and k in sub: ");
        b.sum();
    }
};