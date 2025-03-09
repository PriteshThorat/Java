
import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        boolean isPrime = true;
        char choice;
        
        do {
            // Get a positive number from user
            do {
                System.out.print("Enter a positive number to check if it's prime: ");
                number = scanner.nextInt();
            } while (number <= 0); // Logical condition: Continue if number is not positive
            
            // Check if the number is prime
            isPrime = true;
            if (number == 1) {
                isPrime = false;
            } else {
                int i = 2;
                do {
                    // Using logical operator && in the condition
                    if (number % i == 0 && number != i) {
                        isPrime = false;
                        break;
                    }
                    i++;
                } while (i <= Math.sqrt(number)); // Logical condition: Check divisors up to square root
            }
            
            // Display result
            System.out.println(number + " is " + (isPrime ? "a prime number." : "not a prime number."));
            
            // Ask user if they want to continue
            System.out.print("Do you want to check another number? (Y/N): ");
            choice = scanner.next().charAt(0);
            
            // Continue loop using logical OR (||) to accept both lowercase and uppercase
        } while (choice == 'Y' || choice == 'y');
        
        System.out.println("Program terminated. Thank you!");
        scanner.close();
    }
}
