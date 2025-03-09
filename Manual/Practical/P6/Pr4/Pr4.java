
import java.io.*;
import java.lang.*;
import java.util.*;

public class Pr4 {
    public static void main(String[] args) {
        System.out.println("Converting String to Integer Object Demonstration");
        System.out.println("==============================================");
        
        // Different ways to convert String to Integer
        
        // Method 1: Using Integer.valueOf(String)
        System.out.println("\n1. Using Integer.valueOf(String):");
        String str1 = "100";
        Integer int1 = Integer.valueOf(str1);
        System.out.println("String: \"" + str1 + "\" converted to Integer: " + int1);
        System.out.println("Type of int1: " + int1.getClass().getName());
        
        // Method 2: Using Integer.parseInt(String) with autoboxing
        System.out.println("\n2. Using Integer.parseInt(String) with autoboxing:");
        String str2 = "200";
        Integer int2 = Integer.parseInt(str2); // parseInt returns primitive int, autoboxing converts to Integer
        System.out.println("String: \"" + str2 + "\" converted to Integer: " + int2);
        System.out.println("Type of int2: " + int2.getClass().getName());
        
        // Method 3: Using new Integer(String) constructor (deprecated in newer Java versions)
        System.out.println("\n3. Using Integer constructor (deprecated):");
        String str3 = "300";
        Integer int3 = new Integer(str3);
        System.out.println("String: \"" + str3 + "\" converted to Integer: " + int3);
        System.out.println("Type of int3: " + int3.getClass().getName());
        
        // Method 4: Using Integer.decode(String) for different number formats
        System.out.println("\n4. Using Integer.decode(String):");
        String decimalStr = "400";
        String hexStr = "0xFF"; // hexadecimal with 0x prefix
        String octalStr = "0100"; // octal with 0 prefix
        
        Integer decimalInt = Integer.decode(decimalStr);
        Integer hexInt = Integer.decode(hexStr);
        Integer octalInt = Integer.decode(octalStr);
        
        System.out.println("Decimal String: \"" + decimalStr + "\" converted to Integer: " + decimalInt);
        System.out.println("Hex String: \"" + hexStr + "\" converted to Integer: " + hexInt);
        System.out.println("Octal String: \"" + octalStr + "\" converted to Integer: " + octalInt);
        
        // Method 5: Using Integer.parseInt(String, radix) with specific radix (base)
        System.out.println("\n5. Using Integer.parseInt(String, radix):");
        String binaryStr = "1010"; // binary representation of 10
        String customHexStr = "FF"; // hex without 0x prefix
        
        Integer binaryInt = Integer.parseInt(binaryStr, 2);
        Integer hexInt2 = Integer.parseInt(customHexStr, 16);
        
        System.out.println("Binary String: \"" + binaryStr + "\" converted to Integer: " + binaryInt);
        System.out.println("Hex String: \"" + customHexStr + "\" converted to Integer: " + hexInt2);
        
        // Handling exceptions when converting invalid strings
        System.out.println("\n6. Handling exceptions:");
        try {
            String invalidStr = "123abc";
            Integer invalidInt = Integer.valueOf(invalidStr);
            System.out.println("This will not be printed due to exception");
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: Cannot convert \"123abc\" to Integer");
            System.out.println("Exception message: " + e.getMessage());
        }
        
        // Checking if a String can be converted to Integer
        System.out.println("\n7. Checking if a String can be converted to Integer:");
        String[] testStrings = {"500", "abc", "123.45", "-200", "0"};
        
        for (String str : testStrings) {
            boolean isValidInt = isValidInteger(str);
            System.out.println("String: \"" + str + "\" is " + 
                              (isValidInt ? "a valid Integer" : "not a valid Integer"));
        }
        
        // Converting String to Integer with boundary values
        System.out.println("\n8. Integer boundary values:");
        String maxIntStr = String.valueOf(Integer.MAX_VALUE);
        String minIntStr = String.valueOf(Integer.MIN_VALUE);
        
        Integer maxInt = Integer.valueOf(maxIntStr);
        Integer minInt = Integer.valueOf(minIntStr);
        
        System.out.println("MAX_VALUE String: \"" + maxIntStr + "\" to Integer: " + maxInt);
        System.out.println("MIN_VALUE String: \"" + minIntStr + "\" to Integer: " + minInt);
    }
    
    // Helper method to check if a String can be converted to Integer
    private static boolean isValidInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
