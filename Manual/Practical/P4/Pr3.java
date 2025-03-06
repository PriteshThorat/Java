
import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Multidimensional Array Implementation");
        System.out.println("====================================");
        
        // 1. Declaration and initialization of 2D array
        System.out.println("\n1. 2D Array Declaration and Initialization:");
        
        // Method 1: Declare and initialize in separate steps
        int[][] array1 = new int[3][4]; // 3 rows, 4 columns
        
        // Initialize the array with values
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                array1[i][j] = i + j;
            }
        }
        
        // Method 2: Declare and initialize in one step
        int[][] array2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        // 2. Displaying contents of 2D arrays
        System.out.println("\n2. Displaying 2D Arrays:");
        
        System.out.println("\nArray 1 (3x4):");
        displayArray(array1);
        
        System.out.println("\nArray 2 (3x4):");
        displayArray(array2);
        
        // 3. Accessing elements of 2D array
        System.out.println("\n3. Accessing Elements of 2D Array:");
        System.out.println("Element at row 1, column 2 of array2: " + array2[1][2]);
        
        // 4. Getting dimensions of 2D array
        System.out.println("\n4. Dimensions of 2D Array:");
        System.out.println("Number of rows in array2: " + array2.length);
        System.out.println("Number of columns in row 0 of array2: " + array2[0].length);
        
        // 5. Jagged arrays (2D arrays with variable length rows)
        System.out.println("\n5. Jagged Arrays:");
        
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[2];
        
        // Fill the jagged array
        for(int i = 0; i < jaggedArray.length; i++) {
            for(int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = i * 10 + j;
            }
        }
        
        // Display the jagged array
        System.out.println("\nJagged Array:");
        for(int i = 0; i < jaggedArray.length; i++) {
            for(int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "\t");
            }
            System.out.println();
        }
        
        // 6. 3D array example
        System.out.println("\n6. 3D Array Example:");
        
        // 3D array: 2 blocks, 3 rows, 4 columns
        int[][][] array3D = new int[2][3][4];
        
        // Initialize 3D array
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 4; k++) {
                    array3D[i][j][k] = i * 100 + j * 10 + k;
                }
            }
        }
        
        // Display 3D array
        System.out.println("\n3D Array (2x3x4):");
        for(int i = 0; i < 2; i++) {
            System.out.println("Block " + i + ":");
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 4; k++) {
                    System.out.print(array3D[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        // 7. Practical application: Matrix operations
        System.out.println("\n7. Matrix Operations:");
        
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        // Matrix addition
        System.out.println("\nMatrix A:");
        displayArray(matrixA);
        
        System.out.println("\nMatrix B:");
        displayArray(matrixB);
        
        System.out.println("\nMatrix A + Matrix B:");
        int[][] resultMatrix = new int[3][3];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        displayArray(resultMatrix);
        
        // Matrix multiplication
        System.out.println("\nMatrix A * Matrix B:");
        int[][] productMatrix = new int[3][3];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                productMatrix[i][j] = 0;
                for(int k = 0; k < 3; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        displayArray(productMatrix);
        
        scanner.close();
    }
    
    // Helper method to display 2D array
    public static void displayArray(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
