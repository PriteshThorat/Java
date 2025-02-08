import java.io.*;
import java.util.*;
import java.lang.*;

class Rectangle{
    public int length, width;

    public Rectangle(){
        length = 4;
        width = 4;
    }
    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    public void display(){
        System.out.println("Area of Rectangle is " + (length * width));
    }
};

public class PS4{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.display();
        Rectangle r2 = new Rectangle(5, 6);
        r2.display();
    }
};