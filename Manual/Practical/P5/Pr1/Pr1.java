
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr1 {
    public static void main(String[] args) {
        // Creating a 3x3 multidimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Displaying the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        
        // Creating another matrix for operations
        int[][] secondMatrix = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        System.out.println("\nSecond Matrix:");
        displayMatrix(secondMatrix);
        
        // Performing addition of matrices
        System.out.println("\nMatrix Addition:");
        int[][] sum = addMatrices(matrix, secondMatrix);
        displayMatrix(sum);
        
        // Accessing specific elements
        System.out.println("\nAccessing Elements:");
        System.out.println("Element at position [1][2]: " + matrix[1][2]);
        
        // Modifying an element
        matrix[0][0] = 99;
        System.out.println("\nMatrix after modification:");
        displayMatrix(matrix);
    }
    
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Method to add two matrices
    public static int[][] addMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int cols = first[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        
        return result;
    }
}
