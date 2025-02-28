import java.lang.*;
import java.io.*;
import java.util.*;

public class Prg_4_15{
    public static void main(String[] args){
        System.out.println("This is first statement");
        Thread t = new Thread();
        System.out.println("Current Thread: " + t);
        System.out.println("Its name: " + t.getName());
        System.out.println("Its priority: " + t.getPriority());
    }
};