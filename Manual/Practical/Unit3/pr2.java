
import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to check if it's even or odd: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd using modulo operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        
        scanner.close();
    }
}
