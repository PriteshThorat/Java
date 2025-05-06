import java.io.*;
import java.util.*;

class MyThread1 extends Thread {
    MyThread1(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i = 1; i <= 50; i++){
            System.out.println(getName() + i);
        }
    }
};

class MyThread2 extends Thread {
    MyThread2(String name){
        super(name);
    }

    @Override 
    public void run(){
        for(int i = 50; i >= 1; i--){
            System.out.println(getName() + i);
        }
    }
};

public class A {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("MyThread1: ");
        MyThread2 t2 = new MyThread2("MyThread2: ");

        t1.start();
        t2.start();
    }
};