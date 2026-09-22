import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    arrayDeque.add(65);
    arrayDeque.add(96);
    arrayDeque.addFirst(96);
    
    System.out.println(arrayDeque.getFirst());
    System.out.println(arrayDeque.getLast());

    System.out.println(arrayDeque);
  }
}
