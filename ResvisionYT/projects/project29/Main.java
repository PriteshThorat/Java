class MyThread extends Thread {
  MyThread (String name) {
    super(name);
  }

  @Override 
  public void run () {
    System.out.println("I am MyThread");

    System.out.println("The ID of MyThread is " + threadId());
    System.out.println("The name of MyThread is " + getName());
  }
}

class MyRunnable implements Runnable {
  @Override 
  public void run () {
    System.out.println("I am MyRunnable");

    System.out.println("The ID of MyRunnable is " + Thread.currentThread().threadId());
    System.out.println("The name of MyRunnable is " + Thread.currentThread().getName());
  }
}

public class Main {
  public static void main(String[] args) {
    // MyThread myThread = new MyThread("MyThread");

    // myThread.start();
    // System.out.println("The ID of MyThread is " + myThread.threadId());
    // System.out.println("The name of MyThread is " + myThread.getName());

    MyRunnable myRunnable = new MyRunnable();
    Thread thread = new Thread(myRunnable, "MyRunnable");

    thread.start();
    // System.out.println("The ID of MyRunnable is " + thread.threadId());
    // System.out.println("The name of MyRunnable is " + thread.getName());
  }
}