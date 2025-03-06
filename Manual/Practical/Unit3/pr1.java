
import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Enter your income (per month): ");
        double income = scanner.nextDouble();
        
        System.out.println("Do you have a driver's license? (true/false): ");
        boolean hasLicense = scanner.nextBoolean();
        
        // Using if with multiple conditions and logical operators
        if (age >= 18 && income >= 30000) {
            System.out.println("You are an adult with sufficient income.");
            
            if (hasLicense && age >= 21) {
                System.out.println("You can apply for a car loan.");
            } else if (hasLicense && age < 21) {
                System.out.println("You can drive but need more age for a car loan.");
            } else {
                System.out.println("You should get a driver's license first.");
            }
        } else if (age >= 18 && income < 30000) {
            System.out.println("You are an adult but need more income for financial services.");
        } else if (age < 18 && age > 12) {
            System.out.println("You are a teenager and cannot apply for financial services.");
        } else {
            System.out.println("You are a child.");
        }
        
        // Using logical operators: AND (&&), OR (||), NOT (!)
        if ((age > 60 || income > 100000) && hasLicense) {
            System.out.println("You qualify for premium services.");
        }
        
        if (!(age < 18) && !(income < 10000)) {
            System.out.println("You meet the minimum requirements.");
        }
        
        scanner.close();
    }
}
