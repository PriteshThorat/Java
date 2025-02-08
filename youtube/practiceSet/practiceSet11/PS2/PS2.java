import java.io.*;
import java.lang.*;
import java.util.*;

abstract class Pen{
    abstract void write();
    abstract void refill();
};

class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("The fountain pen writes");
    }
    @Override
    public void refill(){
        System.out.println("The fountain pen refills");
    }
    public void changeNib(){
        System.out.println("The fountain pen changes nib");
    }
};

public class PS2{
    public static void main(String[] args){
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
};