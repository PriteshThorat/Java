import java.lang.*;
import java.io.*;
import java.util.*;

class MyThread extends Thread{
    String msg[] = {"Java", "Supports", "Multithreading", "Concept"};

    MyThread(String name){
        super(name);
    }

    public void run(){
        display(getName());
        System.out.println("Exit from " + getName());
    }

    synchronized void display(String name){
        for(int i = 0; i < msg.length; i++){
            System.out.println(name + msg[i]);
        }
    }
};

public class Prg_4_18{
    public static void main(String[] args){
        MyThread t1 = new MyThread("Thread 1: ");
        MyThread t2 = new MyThread("Thread 2: ");
        t1.start();
        t2.start();
        System.out.println("Main thread exited");
    }
};