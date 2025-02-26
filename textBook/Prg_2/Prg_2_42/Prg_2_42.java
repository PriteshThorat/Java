import java.io.*;
import java.util.*;
import java.lang.*;

class Square{
    int side, val;

    Square(){}
    Square(int x){
        side = x;
    }

    void area(){
        val = side * side;
        System.out.println("Square side: " + side);
        System.out.println("Square area: " + val);
    }
};

class Rectangle extends Square{
    int len, wid, val;

    Rectangle(int x, int y){
        len = x;
        wid = y;
    }

    @Override
    void area(){
        val = len * wid;
        System.out.println("Rectangle length: " + len);
        System.out.println("Rectangle width: " + wid);
        System.out.println("Rectangle area: " + val);
    }
};

class Circle extends Square{
    float rad, val;

    Circle(float x){
        rad = x;
    }

    @Override
    void area(){
        val = 3.14f * rad * rad;
        System.out.println("Circle radius: " + rad);
        System.out.println("Circle area: " + val);
    }
};

public class Prg_2_42{
    public static void main(String[] args){
        Square s = new Square(18);
        Rectangle r = new Rectangle(5, 26);
        Circle c = new Circle(14.20f);
        Square ref;
        ref = s;
        ref.area();
        ref = r;
        ref.area();
        ref = c;
        ref.area();
    }
};