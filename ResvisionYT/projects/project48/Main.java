class MyGeneric<T1, T2> {
  int val;
  private T1 t1;
  private T2 t2;

  public MyGeneric (int val, T1 t1, T2 t2) {
    this.val = val;
    this.t1 = t1;
    this.t2 = t2;
  }

  public T1 getT1 () {
    return t1;
  }
  public T2 getT2 () {
    return t2;
  }
}

public class Main {
  public static void main (String[] args) {
    // ArrayList<Integer> arrayList = new ArrayList<>();

    // arrayList.add(95);
    // arrayList.add(62)

    MyGeneric<String, Boolean> myGeneric = new MyGeneric<>(23, "My String", true);

    String str = myGeneric.getT1();
    Boolean bol = myGeneric.getT2();

    System.out.println(str + " " + bol);
  }
}