import java.io.*;
import java.lang.*;
import java.util.*;

class Maths{
    int var1, var2, var3;

    Maths(int x, int y){
        var1 = x;
        var2 = y;
    }

    void calculate(){
        var3 = var1 + var2;
        System.out.println("Addition: " + var3);
    }
};

class Arithmatic extends Maths{
    Arithmatic(int x, int y){
        super(x, y);
    }

    @Override
    void calculate(){
        var3 = var1 - var2;
        System.out.println("Subtraction: " + var3);
    }
};

public class Prg_2_40{
    public static void main(String[] args){
        Arithmatic a = new Arithmatic(30, 18);
        a.calculate();
    }
};