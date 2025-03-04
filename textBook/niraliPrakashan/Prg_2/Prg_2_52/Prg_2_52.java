import java.io.*;
import java.lang.*;
import java.util.*;

class MyWork{
    static int x = 10;
    static int count = 1;
    
    static void display(){
        System.out.println("Static has initialized...");
    }
    static void increment(){
        System.out.println("Function caall: " + count);
        count++;
    }
};

public class Prg_2_52{
    public static void main(String[] args){
        MyWork.display();
        System.out.print("Value of x: ");
        System.out.println(MyWork.x);
        MyWork.increment();
        MyWork.increment();
        MyWork.increment();
    }
};