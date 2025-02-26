import java.io.*;
import java.util.*;
import java.lang.*;

abstract class Maths{
    int var1, var2, var3;

    abstract void calculate();
    void addition(){
        var3 = var1 + var2;
        System.out.println("Addition: " + var3);
    }
};

class Arithmetic extends Maths{
    Arithmetic(int x, int y){
        var1 = x;
        var2 = y;
    }

    @Override
    void calculate(){
        var3 = var1 - var2;
        System.out.println("Subtraction: " + var3);
    }
};

public class Prg_2_50{
    public static void main(String[] args){
        Arithmetic a = new Arithmetic(30, 18);
        a.calculate();
        a.addition();
    }
};