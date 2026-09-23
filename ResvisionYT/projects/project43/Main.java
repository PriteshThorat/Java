import java.util.Date;

public class Main {
  public static void main (String[] args) {
    // System.out.println(System.currentTimeMillis()/1000/3600/365);

    Date date = new Date();
    System.out.println(date);
    System.out.println(date.getTime());
    System.out.println(date.getDate());
    System.out.println(date.getSeconds());
    System.out.println(date.getYear());
  }
}