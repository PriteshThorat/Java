class MyThread1 extends Thread {
  @Override
  public void run () {
    int i = 0;

    while (i < 1000) {
      System.out.println("I am MyThread1");
      try {
        Thread.sleep(5000);
      } catch (Exception e) {
        System.out.println(e);
      }

      i++;
    }
  }
}

class MyThread2 extends Thread {
  @Override
  public void run () {
    int i = 0;

    while (i < 1000) {
      System.out.println("I am MyThread2");

      i++;
    }
  }
}

public class Main {
  public static void main (String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();

    t1.start();

    try {
      t1.join();
    } catch (Exception e) {
      System.out.println(e);
    }
    t2.start();
  }
}