
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr2 {
    public static void main(String[] args) {
        System.out.println("Primitive Data Type Wrapper Classes Demonstration");
        System.out.println("================================================");
        
        // Different ways to create Integer objects
        System.out.println("\n1. Integer Wrapper Class:");
        // Using constructor (deprecated in newer Java versions)
        Integer int1 = new Integer(100);
        // Using valueOf method (preferred)
        Integer int2 = Integer.valueOf(200);
        // Using autoboxing
        Integer int3 = 300;
        // From String
        Integer int4 = Integer.valueOf("400");
        
        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);
        System.out.println("int3: " + int3);
        System.out.println("int4: " + int4);
        
        // Different ways to create Double objects
        System.out.println("\n2. Double Wrapper Class:");
        // Using constructor (deprecated)
        Double double1 = new Double(10.5);
        // Using valueOf method
        Double double2 = Double.valueOf(20.75);
        // Using autoboxing
        Double double3 = 30.25;
        // From String
        Double double4 = Double.valueOf("40.55");
        
        System.out.println("double1: " + double1);
        System.out.println("double2: " + double2);
        System.out.println("double3: " + double3);
        System.out.println("double4: " + double4);
        
        // Different ways to create Boolean objects
        System.out.println("\n3. Boolean Wrapper Class:");
        // Using constructor (deprecated)
        Boolean bool1 = new Boolean(true);
        // Using valueOf method
        Boolean bool2 = Boolean.valueOf(false);
        // Using autoboxing
        Boolean bool3 = true;
        // From String
        Boolean bool4 = Boolean.valueOf("true");
        
        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
        System.out.println("bool4: " + bool4);
        
        // Different ways to create Character objects
        System.out.println("\n4. Character Wrapper Class:");
        // Using constructor (deprecated)
        Character char1 = new Character('A');
        // Using valueOf method
        Character char2 = Character.valueOf('B');
        // Using autoboxing
        Character char3 = 'C';
        
        System.out.println("char1: " + char1);
        System.out.println("char2: " + char2);
        System.out.println("char3: " + char3);
        
        // Different ways to create Byte objects
        System.out.println("\n5. Byte Wrapper Class:");
        // Using constructor (deprecated)
        Byte byte1 = new Byte((byte) 10);
        // Using valueOf method with byte
        Byte byte2 = Byte.valueOf((byte) 20);
        // Using valueOf method with String
        Byte byte3 = Byte.valueOf("30");
        // Using autoboxing
        Byte byte4 = 40;
        
        System.out.println("byte1: " + byte1);
        System.out.println("byte2: " + byte2);
        System.out.println("byte3: " + byte3);
        System.out.println("byte4: " + byte4);
        
        // Different ways to create Short objects
        System.out.println("\n6. Short Wrapper Class:");
        // Using constructor (deprecated)
        Short short1 = new Short((short) 100);
        // Using valueOf method with short
        Short short2 = Short.valueOf((short) 200);
        // Using valueOf method with String
        Short short3 = Short.valueOf("300");
        // Using autoboxing
        Short short4 = 400;
        
        System.out.println("short1: " + short1);
        System.out.println("short2: " + short2);
        System.out.println("short3: " + short3);
        System.out.println("short4: " + short4);
        
        // Different ways to create Long objects
        System.out.println("\n7. Long Wrapper Class:");
        // Using constructor (deprecated)
        Long long1 = new Long(1000L);
        // Using valueOf method with long
        Long long2 = Long.valueOf(2000L);
        // Using valueOf method with String
        Long long3 = Long.valueOf("3000");
        // Using autoboxing
        Long long4 = 4000L;
        
        System.out.println("long1: " + long1);
        System.out.println("long2: " + long2);
        System.out.println("long3: " + long3);
        System.out.println("long4: " + long4);
        
        // Different ways to create Float objects
        System.out.println("\n8. Float Wrapper Class:");
        // Using constructor (deprecated)
        Float float1 = new Float(10.5f);
        // Using valueOf method with float
        Float float2 = Float.valueOf(20.75f);
        // Using valueOf method with String
        Float float3 = Float.valueOf("30.25");
        // Using autoboxing
        Float float4 = 40.55f;
        
        System.out.println("float1: " + float1);
        System.out.println("float2: " + float2);
        System.out.println("float3: " + float3);
        System.out.println("float4: " + float4);
        
        // Conversion between primitive types and wrapper classes
        System.out.println("\n9. Conversions:");
        
        // Autoboxing - primitive to wrapper
        int primitiveInt = 100;
        Integer wrappedInt = primitiveInt; // autoboxing
        System.out.println("Autoboxing int to Integer: " + wrappedInt);
        
        // Unboxing - wrapper to primitive
        Double wrappedDouble = 200.5;
        double primitiveDouble = wrappedDouble; // unboxing
        System.out.println("Unboxing Double to double: " + primitiveDouble);
        
        // Explicit conversion
        String strValue = "123";
        int parsedValue = Integer.parseInt(strValue);
        System.out.println("String to int using parseInt: " + parsedValue);
        
        // Type Conversions
        System.out.println("\n10. Type Conversions Between Wrapper Classes:");
        
        Integer intValue = 500;
        System.out.println("Original Integer value: " + intValue);
        
        // Convert Integer to other wrapper types
        Double doubleFromInt = intValue.doubleValue();
        Float floatFromInt = intValue.floatValue();
        Long longFromInt = intValue.longValue();
        Short shortFromInt = intValue.shortValue();
        Byte byteFromInt = intValue.byteValue();
        
        System.out.println("Integer to Double: " + doubleFromInt);
        System.out.println("Integer to Float: " + floatFromInt);
        System.out.println("Integer to Long: " + longFromInt);
        System.out.println("Integer to Short: " + shortFromInt);
        System.out.println("Integer to Byte: " + byteFromInt);
    }
}
