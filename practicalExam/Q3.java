// Write programs to demonstrate Use of Vectors.

import java.util.Vector;

public class Q3 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(2, 25); 

        System.out.println("Vector Elements: " + numbers);

        System.out.println("Element at index 3: " + numbers.get(3));

        numbers.remove(1); 
        System.out.println("After removing index 1: " + numbers);

        System.out.println("Size of vector: " + numbers.size());
        System.out.println("Capacity of vector: " + numbers.capacity());

        System.out.println("Iterating through Vector:");
        for (int num : numbers) {
            System.out.println(num);
        }

        if (numbers.contains(30)) {
            System.out.println("Vector contains 30");
        } else {
            System.out.println("Vector does not contain 30");
        }
    }
};