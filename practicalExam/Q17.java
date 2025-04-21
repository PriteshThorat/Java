// Write programs for implementation of throw, throws clause.

import java.io.*;
import java.util.Scanner;

public class Q17 {

    public static void checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive!");
        } else {
            System.out.println("The number is positive.");
        }
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("non_existent_file.txt");
        BufferedReader fileInput = new BufferedReader(file);

        fileInput.readLine();
        fileInput.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        try {
            checkPositive(num);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in checkPositive: " + e.getMessage());
        }

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception caught in readFile: " + e.getMessage());
        }
        
        scanner.close();
    }
};