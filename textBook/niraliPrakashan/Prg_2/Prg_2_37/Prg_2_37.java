import java.io.*;
import java.util.*;
import java.lang.*;

class Box{
    int height;
    int depth;
    int length;

    Box(){
        height = depth = length = 10;
    }
    Box(int x, int y){
        height = x;
        depth = y;
    }
    Box(int x, int y, int z){
        height = x;
        depth = y;
        length = z;
    }
};

public class Prg_2_37{
    public static void main(String[] args){
        Box a = new Box();
        System.out.println("depth of a: " + a.depth);
        Box b = new Box(12, 23);
        System.out.println("depth of b: " + b.depth);
        Box c = new Box(99, 84, 36);
        System.out.println("depth of c: " + c.depth);
    }
};