// Write a Java program in which thread A will display the even numbers between 1 to 50 and thread B will display the odd numbers between 1 to 50. After 3 iterations thread A should go to sleep for 500ms.

import java.util.*;

class MyThread1 extends Thread{
  int count;
  
  @Override
  public void run(){
    for(int i = 1; i <= 50; i++){
      if(i % 2 == 0){
        System.out.println("Thread1: " + i);
        count++;

        if(count % 3 == 0){
          try{
            Thread.sleep(500);
          }catch(Exception e){}
        }
      }
    }
  }
};

class MyThread2 extends Thread{
  @Override
  public void run(){
    for(int i = 1; i <= 50; i++){
      if(i % 2 != 0)
        System.out.println("Thread2: " + i);
    }
  }
};

public class Q5b{
  public static void main(String[] args){
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();

    t1.start();
    t2.start();
  }
};