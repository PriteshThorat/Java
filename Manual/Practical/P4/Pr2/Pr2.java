
import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("StringBuffer Class Methods Demonstration");
        System.out.println("=======================================");
        
        // Creating StringBuffer objects
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer(20); // with initial capacity
        StringBuffer sb3 = new StringBuffer(); // default capacity 16
        
        System.out.println("\n1. Basic StringBuffer Information:");
        System.out.println("StringBuffer 1: \"" + sb1 + "\"");
        System.out.println("Initial Capacity of sb2: " + sb2.capacity());
        System.out.println("Default Capacity of sb3: " + sb3.capacity());
        
        // length() and capacity()
        System.out.println("\n2. length() and capacity() Methods:");
        System.out.println("Length of sb1: " + sb1.length());
        System.out.println("Capacity of sb1: " + sb1.capacity());
        
        // append() - various overloaded methods
        System.out.println("\n3. append() Methods:");
        sb1.append(" World");
        System.out.println("After appending string: " + sb1);
        
        sb1.append(123);
        System.out.println("After appending int: " + sb1);
        
        sb1.append(true);
        System.out.println("After appending boolean: " + sb1);
        
        sb1.append(3.14159);
        System.out.println("After appending double: " + sb1);
        
        sb1.append('!');
        System.out.println("After appending char: " + sb1);
        
        // insert() - various overloaded methods
        System.out.println("\n4. insert() Methods:");
        StringBuffer sb4 = new StringBuffer("Hello World");
        
        sb4.insert(5, " Beautiful");
        System.out.println("After inserting string: " + sb4);
        
        sb4.insert(0, 123);
        System.out.println("After inserting int at beginning: " + sb4);
        
        sb4.insert(3, false);
        System.out.println("After inserting boolean: " + sb4);
        
        sb4.insert(sb4.length(), 3.14);
        System.out.println("After inserting double at end: " + sb4);
        
        // delete() and deleteCharAt()
        System.out.println("\n5. delete() and deleteCharAt() Methods:");
        StringBuffer sb5 = new StringBuffer("Hello World Java");
        
        sb5.delete(5, 12);
        System.out.println("After deleting from index 5 to 11: " + sb5);
        
        sb5.deleteCharAt(0);
        System.out.println("After deleting character at index 0: " + sb5);
        
        // replace()
        System.out.println("\n6. replace() Method:");
        StringBuffer sb6 = new StringBuffer("Hello World");
        
        sb6.replace(6, 11, "Java");
        System.out.println("After replacing 'World' with 'Java': " + sb6);
        
        // reverse()
        System.out.println("\n7. reverse() Method:");
        StringBuffer sb7 = new StringBuffer("Hello World");
        
        sb7.reverse();
        System.out.println("After reversing: " + sb7);
        
        // charAt() and setCharAt()
        System.out.println("\n8. charAt() and setCharAt() Methods:");
        StringBuffer sb8 = new StringBuffer("Hello World");
        
        System.out.println("Character at index 4: " + sb8.charAt(4));
        
        sb8.setCharAt(0, 'h');
        System.out.println("After changing character at index 0 to 'h': " + sb8);
        
        // substring()
        System.out.println("\n9. substring() Methods:");
        StringBuffer sb9 = new StringBuffer("Hello World");
        
        System.out.println("Substring from index 6: " + sb9.substring(6));
        System.out.println("Substring from index 0 to 5: " + sb9.substring(0, 5));
        
        // indexOf() and lastIndexOf()
        System.out.println("\n10. indexOf() and lastIndexOf() Methods:");
        StringBuffer sb10 = new StringBuffer("Hello World Hello");
        
        System.out.println("Index of 'Hello': " + sb10.indexOf("Hello"));
        System.out.println("Last index of 'Hello': " + sb10.lastIndexOf("Hello"));
        System.out.println("Index of 'Hello' starting from index 1: " + sb10.indexOf("Hello", 1));
        
        // trimToSize()
        System.out.println("\n11. trimToSize() Method:");
        StringBuffer sb11 = new StringBuffer(100);
        sb11.append("Small Text");
        
        System.out.println("Capacity before trimToSize(): " + sb11.capacity());
        sb11.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb11.capacity());
        
        // ensureCapacity()
        System.out.println("\n12. ensureCapacity() Method:");
        StringBuffer sb12 = new StringBuffer(10);
        
        System.out.println("Initial capacity: " + sb12.capacity());
        sb12.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb12.capacity());
        
        // getChars()
        System.out.println("\n13. getChars() Method:");
        StringBuffer sb13 = new StringBuffer("Hello World");
        char[] charArray = new char[5];
        
        sb13.getChars(0, 5, charArray, 0);
        System.out.print("Characters copied to array: ");
        for (char c : charArray) {
            System.out.print(c);
        }
        
        // setLength()
        System.out.println("\n\n14. setLength() Method:");
        StringBuffer sb14 = new StringBuffer("Hello World");
        
        System.out.println("Before setLength(): " + sb14);
        sb14.setLength(5);
        System.out.println("After setLength(5): " + sb14);
        
        // codePointAt()
        System.out.println("\n15. codePointAt() Method:");
        StringBuffer sb15 = new StringBuffer("A");
        System.out.println("Unicode code point for 'A': " + sb15.codePointAt(0));
        
        // codePointBefore()
        System.out.println("\n16. codePointBefore() Method:");
        StringBuffer sb16 = new StringBuffer("AB");
        System.out.println("Unicode code point before index 1: " + sb16.codePointBefore(1));
        
        // codePointCount()
        System.out.println("\n17. codePointCount() Method:");
        StringBuffer sb17 = new StringBuffer("Hello");
        System.out.println("Code point count: " + sb17.codePointCount(0, sb17.length()));
        
        // offsetByCodePoints()
        System.out.println("\n18. offsetByCodePoints() Method:");
        StringBuffer sb18 = new StringBuffer("Hello World");
        System.out.println("Offset by 5 code points from index 0: " + sb18.offsetByCodePoints(0, 5));
        
        // subSequence()
        System.out.println("\n19. subSequence() Method:");
        StringBuffer sb19 = new StringBuffer("Hello World");
        System.out.println("SubSequence from index 0 to 5: " + sb19.subSequence(0, 5));
        
        // toString()
        System.out.println("\n20. toString() Method:");
        StringBuffer sb20 = new StringBuffer("Hello World");
        String str = sb20.toString();
        System.out.println("Converted to String: " + str);
        System.out.println("Is it a String? " + (str instanceof String));
        
        scanner.close();
    }
}
