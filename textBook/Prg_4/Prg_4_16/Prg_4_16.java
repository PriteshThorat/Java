import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_4_16{
    public static void main(String[] args){
        Thread newThread = new Thread(new ThreadWithException());
        newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e){
                System.out.println("ERROR! An exception occurred in " + t.getName() + ". Cause: " + e.getMessage());
            }
        });
        newThread.start();
    }
};

class ThreadWithException implements Runnable{
    @Override
    public void run(){
        throw new RuntimeException("Application specific Exception!!");
    }
};