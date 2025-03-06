
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr1 {
    public static void main(String[] args) {
        System.out.println("Integer Wrapper Class Methods Demonstration");
        System.out.println("=========================================");
        
        // Creating Integer objects
        System.out.println("\n1. Creating Integer Objects:");
        Integer int1 = new Integer(100);  // Using constructor (deprecated in newer Java)
        Integer int2 = Integer.valueOf(200);  // Using valueOf method (preferred)
        Integer int3 = Integer.valueOf("300");  // From String
        Integer int4 = 400;  // Using autoboxing
        
        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);
        System.out.println("int3: " + int3);
        System.out.println("int4: " + int4);
        
        // Conversion methods
        System.out.println("\n2. Conversion Methods:");
        
        // intValue() - Converting Integer to primitive int
        int primitiveInt = int1.intValue();
        System.out.println("intValue(): " + primitiveInt);
        
        // Other primitive type conversions
        byte byteVal = int1.byteValue();
        short shortVal = int1.shortValue();
        long longVal = int1.longValue();
        float floatVal = int1.floatValue();
        double doubleVal = int1.doubleValue();
        
        System.out.println("byteValue(): " + byteVal);
        System.out.println("shortValue(): " + shortVal);
        System.out.println("longValue(): " + longVal);
        System.out.println("floatValue(): " + floatVal);
        System.out.println("doubleValue(): " + doubleVal);
        
        // toString methods
        System.out.println("\n3. String Conversion Methods:");
        
        // Integer to String
        String str1 = int1.toString();
        System.out.println("toString(): " + str1 + " (Type: " + str1.getClass().getName() + ")");
        
        // Integer to binary/octal/hex String
        String binaryStr = Integer.toBinaryString(int1);
        String octalStr = Integer.toOctalString(int1);
        String hexStr = Integer.toHexString(int1);
        
        System.out.println("toBinaryString(100): " + binaryStr);
        System.out.println("toOctalString(100): " + octalStr);
        System.out.println("toHexString(100): " + hexStr);
        
        // String to Integer
        System.out.println("\n4. String to Integer Methods:");
        
        int parsedInt = Integer.parseInt("500");
        System.out.println("parseInt(\"500\"): " + parsedInt);
        
        int parsedRadix = Integer.parseInt("101", 2);  // Convert binary String to int
        System.out.println("parseInt(\"101\", 2): " + parsedRadix);
        
        Integer valueOfInt = Integer.valueOf("600");
        System.out.println("valueOf(\"600\"): " + valueOfInt);
        
        Integer valueOfRadix = Integer.valueOf("FF", 16);  // Convert hex String to Integer
        System.out.println("valueOf(\"FF\", 16): " + valueOfRadix);
        
        // Compare methods
        System.out.println("\n5. Comparison Methods:");
        
        System.out.println("compare(100, 200): " + Integer.compare(int1, int2));
        System.out.println("int1.compareTo(int2): " + int1.compareTo(int2));
        System.out.println("int1.equals(100): " + int1.equals(100));
        System.out.println("int1 == int2: " + (int1 == int2));
        
        // Min, Max, Sum
        System.out.println("\n6. Math Operations:");
        
        System.out.println("max(100, 200): " + Integer.max(int1, int2));
        System.out.println("min(100, 200): " + Integer.min(int1, int2));
        System.out.println("sum(100, 200): " + Integer.sum(int1, int2));
        
        // Bit operations
        System.out.println("\n7. Bit Operations:");
        
        System.out.println("bitCount(15): " + Integer.bitCount(15));  // Count set bits
        System.out.println("highestOneBit(25): " + Integer.highestOneBit(25));
        System.out.println("lowestOneBit(25): " + Integer.lowestOneBit(25));
        System.out.println("numberOfLeadingZeros(15): " + Integer.numberOfLeadingZeros(15));
        System.out.println("numberOfTrailingZeros(16): " + Integer.numberOfTrailingZeros(16));
        System.out.println("rotateLeft(15, 2): " + Integer.rotateLeft(15, 2));
        System.out.println("rotateRight(15, 2): " + Integer.rotateRight(15, 2));
        System.out.println("reverse(15): " + Integer.reverse(15));
        System.out.println("reverseBytes(258): " + Integer.reverseBytes(258));
        
        // Constants
        System.out.println("\n8. Integer Constants:");
        
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.SIZE (bits): " + Integer.SIZE);
        System.out.println("Integer.BYTES: " + Integer.BYTES);
        
        // Utility methods
        System.out.println("\n9. Utility Methods:");
        
        System.out.println("Integer.hashCode(100): " + Integer.hashCode(100));
        System.out.println("int1.hashCode(): " + int1.hashCode());
        
        // Demonstration of auto-boxing and unboxing
        System.out.println("\n10. Autoboxing and Unboxing:");
        
        // Autoboxing (primitive to wrapper)
        Integer autoboxed = 500;
        System.out.println("Autoboxed value: " + autoboxed);
        
        // Unboxing (wrapper to primitive)
        int unboxed = int3;
        System.out.println("Unboxed value: " + unboxed);
        
        // Example of operations using autoboxing/unboxing
        Integer result = int1 + int2;  // Unboxing, addition, then autoboxing
        System.out.println("int1 + int2: " + result);
    }
}
