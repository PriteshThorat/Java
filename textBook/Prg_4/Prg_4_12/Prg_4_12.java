import java.io.*;
import java.lang.*;
import java.util.*;

class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();
    }

    public void run(){
        for(int i = 5; i > 0; i--){
            System.out.println("Child Thread: " + i);

            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
        System.out.println("Exiting child thread.");
    }
};

public class Prg_4_12{
    public static void main(String[] args) throws InterruptedException{
        new NewThread();

        for(int i = 5; i > 0; i--){
            System.out.println("Main Thread: " + i);
            Thread.sleep(10000);
        }

        System.out.println("Main thread exiting");
    }
};