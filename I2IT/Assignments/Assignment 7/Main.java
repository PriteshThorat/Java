import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Boolean isEven (int num) {
        if (num < 2) {
            return false;
        }

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static Boolean isOdd (int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    static Boolean isPrime (int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

            return true;
        }

        return false;
    }

    static Boolean isPalindrome (int num) {
        String strNum = Integer.toString(num);
        String reverseNum = "";

        if (strNum.length() == 1) {
            return false;
        }

        for (int i = strNum.length() - 1; i >= 0; i--) {
            reverseNum += strNum.substring(i, i+1);
        }

        if (strNum.compareTo(reverseNum) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 6, element, choice;
        ArrayList<Integer> arrayList = new ArrayList<>();

        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Element Insertion");
            System.out.println("2. Check Even Numbers from Array");
            System.out.println("3. Check Odd Numbers from Array");
            System.out.println("4. Check Prime Numbers from Array");
            System.out.println("5. Check Palindrome Numbers from Array");
            System.out.println("6. Element Display");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the size of array: ");
                        size = sc.nextInt();

                        for (int i = 0; i < size; i++) {
                            System.out.print("Enter Element " + (i + 1) + ": ");
                            element = sc.nextInt();

                            arrayList.add(element);
                        }
                        break;
                    
                    case 2:
                        for (int i = 0; i < size; i++) { 
                            System.out.println(arrayList.get(i) + " is " + (isEven(arrayList.get(i)) ? " Even Number" : " is not Even Number"));
                        }
                        break;
                    
                    case 3:
                        for (int i = 0; i < size; i++) {
                            System.out.println(arrayList.get(i) + " is " + (isOdd(arrayList.get(i)) ? " Odd Number" : " is not Odd Number"));
                        }
                        break;

                    case 4:
                        for (int i = 0; i < size; i++) {
                            System.out.println(arrayList.get(i) + " is " + (isPrime(arrayList.get(i)) ? " Prime Number" : " is not Prime Number"));
                        }
                        break;
                    
                    case 5:
                        for (int i = 0; i < size; i++) {
                            System.out.println(arrayList.get(i) + " is " + (isPalindrome(arrayList.get(i)) ? " Palindrome Number" : " is not Palindrome Number"));
                        }
                        break;

                    case 6:
                        System.out.println(arrayList);
                        break;

                    case 7:
                        System.out.println("Program Terminated.");

                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (choice != 7);

        sc.close();
    }
}