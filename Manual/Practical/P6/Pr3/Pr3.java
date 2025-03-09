
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr3 {
    public static void main(String[] args) {
        System.out.println("Number Class Methods Demonstration");
        System.out.println("==================================");
        
        // Create various Number subclass objects
        Integer intObj = new Integer(100);
        Double doubleObj = new Double(123.456);
        Float floatObj = new Float(78.9f);
        Long longObj = new Long(1000000L);
        Short shortObj = new Short((short)32);
        Byte byteObj = new Byte((byte)8);
        
        System.out.println("\nOriginal Number objects:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Long: " + longObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Byte: " + byteObj);
        
        System.out.println("\n1. Converting Integer object to primitive types:");
        System.out.println("intValue(): " + intObj.intValue());
        System.out.println("doubleValue(): " + intObj.doubleValue());
        System.out.println("floatValue(): " + intObj.floatValue());
        System.out.println("longValue(): " + intObj.longValue());
        System.out.println("shortValue(): " + intObj.shortValue());
        System.out.println("byteValue(): " + intObj.byteValue());
        
        System.out.println("\n2. Converting Double object to primitive types:");
        System.out.println("intValue(): " + doubleObj.intValue() + " (truncated)");
        System.out.println("doubleValue(): " + doubleObj.doubleValue());
        System.out.println("floatValue(): " + doubleObj.floatValue());
        System.out.println("longValue(): " + doubleObj.longValue() + " (truncated)");
        System.out.println("shortValue(): " + doubleObj.shortValue() + " (truncated)");
        System.out.println("byteValue(): " + doubleObj.byteValue() + " (truncated)");
        
        System.out.println("\n3. Converting Float object to primitive types:");
        System.out.println("intValue(): " + floatObj.intValue() + " (truncated)");
        System.out.println("doubleValue(): " + floatObj.doubleValue());
        System.out.println("floatValue(): " + floatObj.floatValue());
        System.out.println("longValue(): " + floatObj.longValue() + " (truncated)");
        System.out.println("shortValue(): " + floatObj.shortValue() + " (truncated)");
        System.out.println("byteValue(): " + floatObj.byteValue() + " (truncated)");
        
        System.out.println("\n4. Converting Long object to primitive types:");
        System.out.println("intValue(): " + longObj.intValue() + " (may lose precision)");
        System.out.println("doubleValue(): " + longObj.doubleValue());
        System.out.println("floatValue(): " + longObj.floatValue());
        System.out.println("longValue(): " + longObj.longValue());
        System.out.println("shortValue(): " + longObj.shortValue() + " (truncated)");
        System.out.println("byteValue(): " + longObj.byteValue() + " (truncated)");
        
        System.out.println("\n5. Converting Short object to primitive types:");
        System.out.println("intValue(): " + shortObj.intValue());
        System.out.println("doubleValue(): " + shortObj.doubleValue());
        System.out.println("floatValue(): " + shortObj.floatValue());
        System.out.println("longValue(): " + shortObj.longValue());
        System.out.println("shortValue(): " + shortObj.shortValue());
        System.out.println("byteValue(): " + shortObj.byteValue() + " (truncated)");
        
        System.out.println("\n6. Converting Byte object to primitive types:");
        System.out.println("intValue(): " + byteObj.intValue());
        System.out.println("doubleValue(): " + byteObj.doubleValue());
        System.out.println("floatValue(): " + byteObj.floatValue());
        System.out.println("longValue(): " + byteObj.longValue());
        System.out.println("shortValue(): " + byteObj.shortValue());
        System.out.println("byteValue(): " + byteObj.byteValue());
        
        System.out.println("\n7. Precision loss examples:");
        
        // Demonstrating precision loss
        Double largeDouble = new Double(1234567890.123456789);
        System.out.println("Original large double: " + largeDouble);
        System.out.println("Converted to float: " + largeDouble.floatValue() + " (precision loss)");
        
        Long largeLong = new Long(9223372036854775807L); // Max Long value
        System.out.println("Original large long: " + largeLong);
        System.out.println("Converted to int: " + largeLong.intValue() + " (value change due to overflow)");
        
        System.out.println("\n8. Number.xxxValue() methods with inheritance:");
        
        // Demonstrating polymorphism with Number class
        Number[] numbers = {intObj, doubleObj, floatObj, longObj, shortObj, byteObj};
        
        for (Number number : numbers) {
            System.out.println("\nFor Number object with value " + number + ":");
            System.out.println("intValue(): " + number.intValue());
            System.out.println("doubleValue(): " + number.doubleValue());
            System.out.println("floatValue(): " + number.floatValue());
            System.out.println("longValue(): " + number.longValue());
            System.out.println("shortValue(): " + number.shortValue());
            System.out.println("byteValue(): " + number.byteValue());
        }
        
        System.out.println("\n9. Comparing with additional conversion methods:");
        
        // Parse methods vs xxxValue() methods
        String numStr = "123.45";
        Double parsedDouble = Double.parseDouble(numStr);
        System.out.println("String \"" + numStr + "\" parsed to Double: " + parsedDouble);
        System.out.println("Then converted to int using intValue(): " + parsedDouble.intValue());
        
        Integer parsedInt = Integer.parseInt("500");
        System.out.println("String \"500\" parsed to Integer: " + parsedInt);
        System.out.println("Then converted to double using doubleValue(): " + parsedInt.doubleValue());
    }
}
