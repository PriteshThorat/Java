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

public class Prg_2_31{
    public static void main(String[] args){
        Super a = new Super();
        Sub b = new Sub();
        a.i = 5;
        a.j = 12;
        System.out.print("Contents of super: ");
        a.show();
        System.out.println();
        b.i = 11;
        b.j = 13;
        b.k = 17;
        System.out.print("Content of sub: ");
        b.show();
        b.display();
        System.out.println();
        System.out.print("Sum of i, j and k in sub: ");
        b.sum();
    }
};