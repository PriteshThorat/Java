import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void isEven (int num) {}
    static void isOdd (int num) {}
    static void isPrime (int num) {}

    static void isPalindrome (int num) {
        String strNum = String.valueOf(num);
        String reverseNum = "";

        for (int i = strNum.length() - 1; i > -1; i--) {
            reverseNum += strNum.charAt(i);
        }
        System.out.println(reverseNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size, element;
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Enter the size of array: ");
        size = sc.nextInt();

        try {
            for (int i = 0; i < size; i++) {
                System.out.print("Enter Element " + (i + 1) + ": ");
                element = sc.nextInt();

                arrayList.add(element);
            }

            for (int i = 0; i < size; i++) {
                isPalindrome(arrayList.get(0));
                //System.out.println(arrayList.get(i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}