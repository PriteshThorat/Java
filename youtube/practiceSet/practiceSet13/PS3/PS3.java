import java.io.*;
import java.util.*;
import java.lang.*;

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
};

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
};

public class PS3{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        System.out.println(t2.getPriority());
    }
};