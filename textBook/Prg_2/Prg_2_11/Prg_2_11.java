import java.io.*;
import java.lang.*;
import java.util.*;

class Rectangle{
    int length, breadth;

    void show(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int calculate(){
        return (length * breadth);
    }
};

public class Prg_2_11{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.show(6, 6);
        int area = r.calculate();
        System.out.println("The area of a Rectangle is: " + area);
    }
};