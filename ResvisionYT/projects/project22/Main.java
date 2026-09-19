interface SampleInterface {
  void method1 ();
  void method2 ();
}

interface ChildSampleInterface extends SampleInterface {
  void method3 ();
  void method4 ();
}

class MySampleClass implements ChildSampleInterface {
  @Override 
  public void method1 () {
    System.out.println("Method 1");
  }
  @Override 
  public void method2 () {
    System.out.println("Method 2");
  }
  @Override 
  public void method3 () {
    System.out.println("Method 3");
  }
  @Override 
  public void method4 () {
    System.out.println("Method 4");
  }
}

public class Main {
  public static void main (String[] args) {
    MySampleClass mySampleClass = new MySampleClass();

    mySampleClass.method1();
    mySampleClass.method2();
    mySampleClass.method3();
    mySampleClass.method4();
  }
}