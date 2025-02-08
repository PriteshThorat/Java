import java.io.*;
import java.lang.*;
import java.util.*;

abstract class Pen{
    abstract void write();
    abstract void refill();
};

class NoteBook extends Pen{
    @Override
    public void write(){
        System.out.println("Writing in NoteBook");
    }
    @Override
    public void refill(){
        System.out.println("Refilling NoteBook");
    }
};

public class PS1{
    public static void main(String[] args){
        Pen p = new NoteBook();
        p.write();
        p.refill();
    }
};