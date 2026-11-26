import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  private static void numberingList (ArrayList<Integer> list) {
    list.add(1);
    list.add(2);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    numberingList(list);
    int total = 0;
    Iterator<Integer> iter = list.iterator();

    while (iter.hasNext()) {
      Integer val = iter.next();
      total = total + val;
    }
    System.out.println("The Total Amount is " + total);
  }
}