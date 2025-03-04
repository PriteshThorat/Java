import java.io.*;
import java.util.*;
import java.lang.*;

interface Mango{
    void display();
};

class Summer implements Mango{
    public void display(){
        System.out.println("First Display method... ");
    }
};

class Winter implements Mango{
    public void display(){
        System.out.println("Second Display method... ");
    }
}

public class Prg_3_1{
    public static void main(String[] args){
        Mango m = new Summer();
        Mango w = new Winter();
        m.display();
        w.display();
    }
};