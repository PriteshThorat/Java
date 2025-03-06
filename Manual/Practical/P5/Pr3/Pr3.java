
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr3 {
    public static void main(String[] args) {
        // Create a Vector with initial capacity of 4 and increment of 2
        Vector<Object> vector = new Vector<>(4, 2);
        
        System.out.println("Initial size: " + vector.size());
        System.out.println("Initial capacity: " + vector.capacity());
        
        // Insert different types of elements into the Vector
        System.out.println("\nAdding elements to the Vector:");
        
        // Adding Integer elements
        vector.addElement(100);
        vector.addElement(200);
        System.out.println("After adding Integers: " + vector);
        
        // Adding String elements
        vector.addElement("Java");
        vector.addElement("Programming");
        System.out.println("After adding Strings: " + vector);
        
        // Adding Float elements
        vector.addElement(3.14f);
        vector.addElement(2.718f);
        System.out.println("After adding Floats: " + vector);
        
        // Adding Character elements
        vector.addElement('A');
        vector.addElement('Z');
        System.out.println("After adding Characters: " + vector);
        
        // Adding Boolean elements
        vector.addElement(true);
        vector.addElement(false);
        System.out.println("After adding Booleans: " + vector);
        
        // Display current size and capacity
        System.out.println("\nCurrent size: " + vector.size());
        System.out.println("Current capacity: " + vector.capacity());
        
        // Display first and last elements
        System.out.println("\nFirst element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        
        // Check if Vector contains a specific element
        System.out.println("\nVector contains \"Java\": " + vector.contains("Java"));
        System.out.println("Vector contains 500: " + vector.contains(500));
        
        // Display all elements using Enumeration
        System.out.println("\nDisplaying elements using Enumeration:");
        Enumeration<Object> elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
        
        // Display all elements using for-each loop
        System.out.println("\nDisplaying elements using for-each loop:");
        for (Object element : vector) {
            System.out.println(element);
        }
        
        // Remove elements
        vector.removeElement("Java");
        vector.removeElementAt(0);  // Removes element at index 0
        
        System.out.println("\nAfter removing elements: " + vector);
        
        // Clear the Vector
        vector.clear();
        System.out.println("\nAfter clearing the Vector, size: " + vector.size());
        System.out.println("Is Vector empty? " + vector.isEmpty());
    }
}
