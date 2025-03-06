
import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        do {
            System.out.println("\nChoose a loop type to display numbers 1 to 20:");
            System.out.println("1. For Loop");
            System.out.println("2. While Loop");
            System.out.println("3. Do-While Loop");
            System.out.println("4. Display all three");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    displayUsingForLoop();
                    break;
                case 2:
                    displayUsingWhileLoop();
                    break;
                case 3:
                    displayUsingDoWhileLoop();
                    break;
                case 4:
                    displayUsingForLoop();
                    displayUsingWhileLoop();
                    displayUsingDoWhileLoop();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 0 and 4.");
            }
        } while(choice != 0);
        
        scanner.close();
    }
    
    // Display numbers 1 to 20 using for loop
    public static void displayUsingForLoop() {
        System.out.println("\nDisplaying numbers 1 to 20 using for loop:");
        for(int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Display numbers 1 to 20 using while loop
    public static void displayUsingWhileLoop() {
        System.out.println("\nDisplaying numbers 1 to 20 using while loop:");
        int i = 1;
        while(i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    
    // Display numbers 1 to 20 using do-while loop
    public static void displayUsingDoWhileLoop() {
        System.out.println("\nDisplaying numbers 1 to 20 using do-while loop:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 20);
        System.out.println();
    }
}
