import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    LinkedList<Integer> linkedList2 = new LinkedList<>();

    linkedList2.add(95);
    linkedList2.add(85);
    linkedList2.add(35);

    linkedList1.add(5);
    linkedList1.add(95);
    linkedList1.add(96);
    linkedList1.add(35);
    linkedList1.add(0, 67);
    linkedList1.add(0, 1);

    linkedList1.addAll(0, linkedList2);
    linkedList1.addLast(56);
    linkedList1.addFirst(69);

    linkedList1.set(0, 999);

    // linkedList1.clear();
    // System.out.println(linkedList1.contains(35));
    // System.out.println(linkedList1.indexOf(35));
    System.out.println(linkedList1.lastIndexOf(35));

    for (int i = 0; i < linkedList1.size(); i++) {
      System.out.print(linkedList1.get(i));

      if (linkedList1.size() - 1 != i) {
        System.out.print(", ");
      }
    }
  }
}