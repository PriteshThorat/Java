import java.io.*;
import java.util.*;
import java.lang.*;

class First{
    int val;

    void init(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        val = sc.nextInt();
    }

    int square(){
        return (val * val);
    }
};

class Second extends First{
    int mem;

    int cube(){
        mem = square() * val;
        return mem;
    }
};

public class Prg_2_34{
    public static void main(String[] args){
        Second s = new Second();
        s.init();
        System.out.println("Cube: " + s.cube());
    }
};