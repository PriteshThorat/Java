import java.util.HashSet;

public class Main {
  public static void main (String[] args) {
    HashSet<Integer> hashSet = new HashSet<>(6, 0.5f);

    hashSet.add(6);
    hashSet.add(96);
    hashSet.add(36);
    hashSet.add(65);
    hashSet.add(36);

    System.out.println(hashSet);
  }
}