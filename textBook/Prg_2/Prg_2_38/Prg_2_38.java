import java.io.*;
import java.lang.*;
import java.util.*;

class Maths{
    int cal;
    float val;

    int add(int x, int y){
        cal = x + y;
        return cal;
    }
    int add(int z){
        cal = z + 10;
        return cal;
    }
    float add(float x, float y){
        val = x + y;
        return val;
    }
};

public class Prg_2_38{
    public static void main(String[] args){
        Maths m = new Maths();
        System.out.println("52 + 41 = " + m.add(52, 41));
        System.out.println("52 + 10 = " + m.add(52));
        System.out.println("1.2 + 9.2 = " + m.add(1.2f, 9.2f));
    }
};