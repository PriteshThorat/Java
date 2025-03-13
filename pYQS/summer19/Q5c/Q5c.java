// Write a program to create two threads. One thread will display the numbers from 1 to 50 (ascending order) and other thread will display numbers from 50 to 1 (descending order).

import java.io.*;
import java.lang.*;
import java.util.*;

class MyThread1 extends Thread{
  @Override
  public void run(){
    for(int i = 1; i <= 50; i++){
      System.out.println("Thread1: " + i);
    }
  }
};

class MyThread2 extends Thread{
  @Override
  public void run(){
    for(int i = 50; i >= 1; i--){
      System.out.println("Thread2: " + i);
    }
  }
};

public class Q5c{
  public static void main(String[] args){
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();

    t1.start();
    t2.start();
  }
};