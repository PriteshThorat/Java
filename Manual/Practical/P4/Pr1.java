
import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("String Class Methods Demonstration");
        System.out.println("=================================");
        
        // Creating strings
        String str1 = "Hello World";
        String str2 = new String("Java Programming");
        String str3 = "hello world";
        
        System.out.println("\n1. Basic String Information:");
        System.out.println("String 1: \"" + str1 + "\"");
        System.out.println("String 2: \"" + str2 + "\"");
        System.out.println("String 3: \"" + str3 + "\"");
        
        // length()
        System.out.println("\n2. Length Method:");
        System.out.println("Length of String 1: " + str1.length());
        
        // charAt()
        System.out.println("\n3. charAt() Method:");
        System.out.println("Character at index 4 in String 1: " + str1.charAt(4));
        
        // substring()
        System.out.println("\n4. substring() Methods:");
        System.out.println("Substring of String 1 (from index 6): " + str1.substring(6));
        System.out.println("Substring of String 1 (from index 0 to 5): " + str1.substring(0, 5));
        
        // concat()
        System.out.println("\n5. concat() Method:");
        System.out.println("Concatenation of String 1 and String 2: " + str1.concat(" - ").concat(str2));
        
        // indexOf()
        System.out.println("\n6. indexOf() Methods:");
        System.out.println("Index of 'o' in String 1: " + str1.indexOf('o'));
        System.out.println("Index of 'o' in String 1 starting from index 5: " + str1.indexOf('o', 5));
        System.out.println("Index of \"World\" in String 1: " + str1.indexOf("World"));
        
        // lastIndexOf()
        System.out.println("\n7. lastIndexOf() Methods:");
        System.out.println("Last index of 'o' in String 1: " + str1.lastIndexOf('o'));
        System.out.println("Last index of 'o' in String 1 before index 5: " + str1.lastIndexOf('o', 5));
        
        // equals() and equalsIgnoreCase()
        System.out.println("\n8. equals() and equalsIgnoreCase() Methods:");
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equals str3 (ignoring case): " + str1.equalsIgnoreCase(str3));
        
        // compareTo() and compareToIgnoreCase()
        System.out.println("\n9. compareTo() and compareToIgnoreCase() Methods:");
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str3: " + str1.compareToIgnoreCase(str3));
        
        // toLowerCase() and toUpperCase()
        System.out.println("\n10. toLowerCase() and toUpperCase() Methods:");
        System.out.println("String 1 to lowercase: " + str1.toLowerCase());
        System.out.println("String 1 to uppercase: " + str1.toUpperCase());
        
        // trim()
        String strWithSpaces = "   Trimmed String   ";
        System.out.println("\n11. trim() Method:");
        System.out.println("Original string with spaces: \"" + strWithSpaces + "\"");
        System.out.println("After trim(): \"" + strWithSpaces.trim() + "\"");
        
        // replace()
        System.out.println("\n12. replace() Methods:");
        System.out.println("Replacing 'l' with 'L' in String 1: " + str1.replace('l', 'L'));
        System.out.println("Replacing \"World\" with \"Java\" in String 1: " + str1.replace("World", "Java"));
        
        // startsWith() and endsWith()
        System.out.println("\n13. startsWith() and endsWith() Methods:");
        System.out.println("String 1 starts with \"Hello\": " + str1.startsWith("Hello"));
        System.out.println("String 1 ends with \"World\": " + str1.endsWith("World"));
        
        // contains()
        System.out.println("\n14. contains() Method:");
        System.out.println("String 1 contains \"ello\": " + str1.contains("ello"));
        
        // isEmpty()
        String emptyStr = "";
        System.out.println("\n15. isEmpty() Method:");
        System.out.println("Empty string is empty: " + emptyStr.isEmpty());
        System.out.println("String 1 is empty: " + str1.isEmpty());
        
        // split()
        String sentence = "This is a sample sentence for splitting";
        System.out.println("\n16. split() Method:");
        System.out.println("Original sentence: \"" + sentence + "\"");
        System.out.println("After splitting by space:");
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i+1) + ": " + words[i]);
        }
        
        // valueOf()
        System.out.println("\n17. valueOf() Method:");
        int num = 123;
        double dbl = 45.67;
        boolean bool = true;
        System.out.println("int to String: " + String.valueOf(num));
        System.out.println("double to String: " + String.valueOf(dbl));
        System.out.println("boolean to String: " + String.valueOf(bool));
        
        // toCharArray()
        System.out.println("\n18. toCharArray() Method:");
        char[] charArray = str1.toCharArray();
        System.out.print("String 1 as char array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        
        // format()
        System.out.println("\n\n19. format() Method:");
        String formatted = String.format("Formatted string: %d, %.2f, %s", 10, 12.345, "text");
        System.out.println(formatted);
        
        // join()
        System.out.println("\n20. join() Method:");
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println("Joined string: " + joined);
        
        scanner.close();
    }
}
