import java.io.*;
import java.util.*;
import java.lang.*;

final class Demo1{
    public void display(){
        System.out.println("hi");
    }
};

public class Prg_2_46 /*extends Demo1*/{
    public static void main(String[] args){
        Demo1 d = new Demo1();
        d.display();
    }
};