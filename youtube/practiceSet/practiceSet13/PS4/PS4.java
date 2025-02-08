import java.io.*;
import java.util.*;
import java.lang.*;

class MyThread1 extends Thread{
    int i = 0;
    @Override
    public void run(){
        while(i < 10){
            System.out.println(this.getState());
            i++;
        }
    }
};

class MyThread2 extends Thread{
    int i=0;
    @Override
    public void run(){
        while(i < 10){
            System.out.println(this.getState());
            i++;
        }
    }
};

public class PS4{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.start();
        t2.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
};