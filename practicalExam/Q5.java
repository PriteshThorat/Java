// Write programs for implementation of different methods of String Buffer class.

public class Q5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + sb);

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        sb.delete(5, 6); 
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Current capacity: " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        System.out.println("Length of StringBuffer: " + sb.length());

        System.out.println("Character at index 2: " + sb.charAt(2));

        sb.setCharAt(2, 'Z');
        System.out.println("After setCharAt(2, 'Z'): " + sb);

        sb.setLength(5); 
        System.out.println("After setLength(5): " + sb);
    }
};