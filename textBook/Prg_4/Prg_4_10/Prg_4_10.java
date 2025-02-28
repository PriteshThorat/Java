import java.io.*;
import java.lang.*;
import java.util.*;

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.print(i + "\t");
        }
    }
};

public class Prg_4_10{
    public static void main(String[] args){
        MyThread obj = new MyThread();
        // Thread t = new Thread(obj);
        obj.start();
    }
};