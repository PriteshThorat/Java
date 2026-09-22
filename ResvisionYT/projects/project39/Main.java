import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>(5);

    arrayList2.add(95);
    arrayList2.add(85);
    arrayList2.add(35);

    arrayList1.add(5);
    arrayList1.add(95);
    arrayList1.add(96);
    arrayList1.add(35);
    arrayList1.add(0, 67);
    arrayList1.add(0, 1);

    arrayList1.addAll(0, arrayList2);

    // arrayList1.clear();
    // System.out.println(arrayList1.contains(35));
    // System.out.println(arrayList1.indexOf(35));
    System.out.println(arrayList1.lastIndexOf(35));

    for (int i = 0; i < arrayList1.size(); i++) {
      System.out.print(arrayList1.get(i));

      if (arrayList1.size() - 1 != i) {
        System.out.print(", ");
      }
    }
  }
}