class MyException extends Exception {
  public MyException (String msg) {
    super(msg);
  }
  // @Override 
  // public String toString () {
  //   return "I am toString()";
  // }
  // @Override 
  // public String getMessage () {
  //   return "I am getMessage()";
  // }
}

class MaxAgeException extends Exception {
  @Override 
  public String toString () {
    return "Age cannot be greater than 125";
  }
  @Override 
  public String getMessage () {
    return "Make sure that the value of age entered is correct.";
  }
}

public class Main {
  public static void main(String[] args) {
    int a = 8;

    if (a < 10) {
      try {
        // throw new MyException("Error Msg from Constructor");
        throw new ArithmeticException("An Arithmetic Exception");
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
        System.out.println("Finished");
      }

      System.out.println("Yes Finished");
    }
  }
}
