class MyThreadRunnable1 implements Runnable {
  @Override 
  public void run () {
    while (true) {
      System.out.println("I am MyThreadRunnable1");
    }
  }
}

class MyThreadRunnable2 implements Runnable {
  @Override 
  public void run () {
    while (true) {
      System.out.println("I am MyThreadRunnable2");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    MyThreadRunnable1 myThreadRunnable1 = new MyThreadRunnable1();
    Thread thread1 = new Thread(myThreadRunnable1);

    MyThreadRunnable2 myThreadRunnable2 = new MyThreadRunnable2();
    Thread thread2 = new Thread(myThreadRunnable2);

    thread1.start();
    thread2.start();
  }
}