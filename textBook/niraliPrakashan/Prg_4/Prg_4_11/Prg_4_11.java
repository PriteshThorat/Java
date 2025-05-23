import java.lang.*;
import java.util.*;
import java.io.*;

class NewThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start();
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

public class Prg_4_11{
    public static void main(String[] args) throws InterruptedException{
        new NewThread();

        for(int i = 5; i > 0; i--){
            System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
        }

        System.out.println("Main Thread exiting.");
    }
};