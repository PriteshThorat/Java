
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr2 {
    public static void main(String[] args) {
        // Initialize integer array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.println("Displaying integer array elements using for-each loop:");
        // Using for-each loop to display integer array elements
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // Initialize String array
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        
        System.out.println("Displaying String array elements using for-each loop:");
        // Using for-each loop to display String array elements
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
        
        // Initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Displaying 2D array elements using nested for-each loops:");
        // Using nested for-each loops to display 2D array elements
        for(int[] row : matrix) {
            for(int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
