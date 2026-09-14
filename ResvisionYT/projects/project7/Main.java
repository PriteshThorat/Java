public class Main {
  static void foo () {
    System.out.println("Good Morning bro!");
  }

  static void foo (String name) {
    System.out.println("Good Morning " + name + " bro!");
  };

  static void foo (String name, int age) {
    System.out.println("How are you, " + name);
    System.out.println("Your age is " + age);
  }

  static void change (int x) {
    x = 98;
  }

  static void change2 (int arr[]) {
    arr[0] = 97;
  }

  static void tellJoke () {
    System.out.println("What does a storm cloud wear under his raincoat? Thunderwear.");
  }

  public static void main (String args[]) {
    // tellJoke();

    // Case 1: Changing the Integer
    // int x = 45;
    // change(x);
    // System.out.println("The value of x after change is: " + x);

    // Case 2: Changing the Array
    // int marks[] = {52, 56, 98, 65};
    // change2(marks);
    // System.out.println("The value of 1st index after change is: " + marks[0]);

    // Method Overloading
    foo();
    foo("Pritesh");
    foo("Pritesh", 19);
  }
}
