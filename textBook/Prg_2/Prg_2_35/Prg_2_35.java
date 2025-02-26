import java.io.*;
import java.util.*;
import java.lang.*;

class White{
    int num;

    White(int x){
        num = x;
    }
};

class Red extends White{
    Red(int y){
        super(y);
    }

    void print(){
        System.out.println("Value of num: " + num);
    }
};

class Magenta extends Red{
    int maggy;

    Magenta(int z){
        super(z);
        maggy = z;
    }
};

public class Prg_2_35{
    public static void main(String[] args){
        Magenta m = new Magenta(96);
        m.print();
        System.out.println("Value of maggy: " + m.maggy);
    }
};