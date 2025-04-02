//Write a program to print even and odd number using two threads with delay of 1000ms after each number.

import java.lang.*;
import java.io.*;
import java.util.*;

class Thread1 extends Thread{
  @Override
  public void run(){
    for(int i = 0; i < 100; i++){
      if(i % 2 == 0){
        try{
          System.out.println("Thread1: " + i);
          Thread.sleep(1000);
        }catch(Exception e){
          System.out.println(e);
        }
      }
    }
  }
};

class Thread2 extends Thread{
  @Override
  public void run(){
    for(int i = 0; i < 100; i++){
      if(i % 2 != 0){
        try{
          System.out.println("Thread2: " + i);
          Thread.sleep(1000);
        }catch(Exception e){
          System.out.println(e);
        }
      }
    }
  }
};

public class Q5c{
  public static void main(String[] args){
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();

    t1.start();
    t2.start();
  }
}