import java.io.*;
import java.util.*;

class MyThread1 implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println("Thread1: " + i);

                if(i == 6){
                    try{
                        Thread.sleep(2000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
};

class MyThread2 implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                System.out.println("Thread2: " + i);
            }
        }
    }
};

public class B {
    public static void main(String[] args) {
        MyThread1 myT1 = new MyThread1();
        Thread t1 = new Thread(myT1);
        t1.start();

        MyThread2 myT2 = new MyThread2();
        Thread t2 = new Thread(myT2);
        t2.start();
    }
};