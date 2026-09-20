class MyThread extends Thread {
  MyThread (String name) {
    super(name);
  }

  @Override 
  public void run () {
    System.out.println("The ID of " + getName() + " is " + threadId());
  }
}

public class Main {
  public static void main(String[] args) {
    MyThread t1 = new MyThread("MyThread1");
    MyThread t2 = new MyThread("MyThread2");
    MyThread t3 = new MyThread("MyThread3");
    MyThread t4 = new MyThread("MyThread4");
    MyThread t5 = new MyThread("MyThread5 (most important)");

    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MIN_PRIORITY);
    t5.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}