import java.lang.*;
import java.io.*;
import java.util.*;

class MyThread implements Runnable{
    public void run(){
        task1();
        task2();
        task3();
    }

    void task1(){
        System.out.println("this is task1");
    }
    void task2(){
        System.out.println("this is task2");
    }
    void task3(){
        System.out.println("This is task3");
    }
};

public class Prg_4_13{
    public static void main(String[] args){
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.start();
    }
};