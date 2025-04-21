// Write programs for implementation of different methods of String class.

public class Q4 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "  Java Programming  ";

        System.out.println("Length of str1: " + str1.length());

        System.out.println("Character at index 4: " + str1.charAt(4));

        System.out.println("Substring from index 6: " + str1.substring(6));
        System.out.println("Substring from index 0 to 5: " + str1.substring(0, 5));

        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        System.out.println("Original str2: \"" + str2 + "\"");
        System.out.println("Trimmed str2: \"" + str2.trim() + "\"");

        System.out.println("str1 equals 'hello world': " + str1.equals("hello world"));
        System.out.println("str1 equalsIgnoreCase 'hello world': " + str1.equalsIgnoreCase("hello world"));

        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));

        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'ld': " + str1.endsWith("ld"));

        String[] words = str1.split(" ");
        System.out.println("Splitting str1 into words:");
        for (String word : words) {
            System.out.println(word);
        }

        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
    }
};