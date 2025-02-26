import java.io.*;
import java.lang.*;
import java.util.*;

class Area{
    int area(int side){
        return (side * side);
    }
    float area(float radius){
        return (3.14f * radius * radius);
    }
    int area(int len, int wid){
        return (len * wid);
    }
};

public class Prg_2_39{
    public static void main(String[] args){
        Area s = new Area();
        int x, y;
        float z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square side: ");
        x = sc.nextInt();
        System.out.println("Area of square: " + s.area(x));
        System.out.print("Enter length & width: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Area of rect: " + s.area(x, y));
        System.out.print("Enter radius: ");
        z = sc.nextFloat();
        System.out.println("Area of circle: " + s.area(z));
    }
};