import java.lang.*;
import java.io.*;
import java.util.*;

class NewThread implements Runnable{
    Thread t;
    String n;

    public NewThread(int pri, String name){
        n = name;
        t = new Thread(this, name);
        t.setPriority(pri);
        System.out.println("Thread: " + t);
    }

    @Override
    public void run(){
        for(int i = 100; i > 1; i--){
            try{
                System.out.println("Thread: " + n);
                Thread.sleep(10);
            }catch(InterruptedException e){}
        }
    }
    public void start(){
        t.start();
    }
};

public class Prg_4_17{
    public static void main(String[] args) throws InterruptedException{
        Thread.currentThread().setPriority(10);
        NewThread abc = new NewThread(7, "ABC");
        NewThread xyz = new NewThread(3, "XYZ");
        abc.start();
        xyz.start();
        Thread.sleep(1000);
        System.out.println("Main thread exiting.");
    }
};