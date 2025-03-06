
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr5 {
    public static void main(String[] args) {
        System.out.println("Vector Class Methods Demonstration");
        System.out.println("=================================");
        
        // Create a Vector with initial capacity of 5
        Vector<Object> vector = new Vector<>(5);
        
        System.out.println("1. Size and Capacity Methods:");
        System.out.println("Initial size: " + vector.size());
        System.out.println("Initial capacity: " + vector.capacity());
        
        // Add elements to the Vector
        System.out.println("\n2. Adding Elements Methods:");
        
        // addElement() method
        System.out.println("Adding elements using addElement():");
        vector.addElement(10);
        vector.addElement("Java");
        vector.addElement(25.5);
        vector.addElement('A');
        vector.addElement(true);
        System.out.println("Vector after addElement(): " + vector);
        
        // add() method
        System.out.println("\nAdding elements using add():");
        vector.add(100);
        vector.add(1, "Vector");  // Insert at index 1
        System.out.println("Vector after add(): " + vector);
        
        // addAll() method
        System.out.println("\nAdding elements using addAll():");
        ArrayList<String> list = new ArrayList<>();
        list.add("Collection");
        list.add("Framework");
        vector.addAll(list);
        System.out.println("Vector after addAll(): " + vector);
        
        // Size and capacity after additions
        System.out.println("\n3. Updated Size and Capacity:");
        System.out.println("Current size: " + vector.size());
        System.out.println("Current capacity: " + vector.capacity());
        
        // Access methods
        System.out.println("\n4. Element Access Methods:");
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        System.out.println("Element at index 2: " + vector.elementAt(2));
        System.out.println("Element at index 3: " + vector.get(3));
        
        // Search methods
        System.out.println("\n5. Searching Methods:");
        System.out.println("Index of 'Java': " + vector.indexOf("Java"));
        System.out.println("Last index of 'Framework': " + vector.lastIndexOf("Framework"));
        System.out.println("Contains 'Vector': " + vector.contains("Vector"));
        System.out.println("Contains 500: " + vector.contains(500));
        
        // Modification methods
        System.out.println("\n6. Modification Methods:");
        vector.set(0, 500);  // Replace element at index 0
        System.out.println("After set(0, 500): " + vector);
        
        vector.setElementAt("Modified", 4);  // Replace element at index 4
        System.out.println("After setElementAt(\"Modified\", 4): " + vector);
        
        // Remove methods
        System.out.println("\n7. Removal Methods:");
        vector.remove(1);  // Remove element at index 1
        System.out.println("After remove(1): " + vector);
        
        vector.removeElement("Java");  // Remove specific element
        System.out.println("After removeElement(\"Java\"): " + vector);
        
        vector.removeElementAt(0);  // Remove element at index 0
        System.out.println("After removeElementAt(0): " + vector);
        
        // Collection view methods
        System.out.println("\n8. Collection View Methods:");
        
        System.out.println("Elements using Enumeration:");
        Enumeration<Object> elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();
        
        System.out.println("\nElements using Iterator:");
        Iterator<Object> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        System.out.println("\nElements using ListIterator (backward):");
        ListIterator<Object> listIterator = vector.listIterator(vector.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
        
        // Size management methods
        System.out.println("\n9. Size Management Methods:");
        System.out.println("Current size: " + vector.size());
        vector.setSize(10);  // Increase size, new elements are null
        System.out.println("After setSize(10): " + vector);
        System.out.println("New size: " + vector.size());
        
        System.out.println("\nCurrent capacity: " + vector.capacity());
        vector.ensureCapacity(20);  // Ensure minimum capacity
        System.out.println("After ensureCapacity(20), capacity: " + vector.capacity());
        
        vector.trimToSize();  // Trim capacity to current size
        System.out.println("After trimToSize(), capacity: " + vector.capacity());
        
        // Clone and copy methods
        System.out.println("\n10. Clone and Copy Methods:");
        Vector<Object> clonedVector = (Vector<Object>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);
        
        // Convert to array
        System.out.println("\n11. Array Conversion Methods:");
        Object[] objArray = vector.toArray();
        System.out.print("Vector converted to Object array: [");
        for (int i = 0; i < objArray.length; i++) {
            System.out.print(objArray[i] + (i < objArray.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        // Clear the vector
        System.out.println("\n12. Clearing Methods:");
        vector.clear();  // Newer method (Java 2)
        System.out.println("After clear(): " + vector);
        System.out.println("Is Vector empty? " + vector.isEmpty());
        
        clonedVector.removeAllElements();  // Traditional method
        System.out.println("After removeAllElements() on cloned vector: " + clonedVector);
        System.out.println("Is cloned Vector empty? " + clonedVector.isEmpty());
    }
}
