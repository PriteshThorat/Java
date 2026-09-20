class MyThread1 extends Thread {
  @Override 
  public void run () {
    while (true) {
      System.out.println("MyThread1 is running.");
    }
  }
}

class MyThread2 extends Thread {
  @Override 
  public void run () {
    while (true) {
      System.out.println("MyThread2 is running.");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    MyThread1 myThread1 = new MyThread1();
    MyThread2 myThread2 = new MyThread2();

    myThread1.start();
    myThread2.start();
  }
}