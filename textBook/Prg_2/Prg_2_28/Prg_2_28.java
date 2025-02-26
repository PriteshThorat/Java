import java.lang.*;
import java.util.*;
import java.io.*;

public class Prg_2_28{
    public static void main(String[] args){
        Integer x = 141;
        byte b = x.byteValue();
        System.out.println("Byte value: " + b);
        int hash = x.hashCode();
        System.out.println("Hash code: " + hash);
        int val = Integer.parseInt("63");
        System.out.println("Parsed value: " + val);
        String s = x.toString();
        System.out.println("String value: " + s);
        Integer y = Integer.valueOf("22");
        System.out.println("Short value: " + y.shortValue());
        String bin = Integer.toBinaryString(59);
        String oct = Integer.toOctalString(59);
        String hex = Integer.toHexString(59);
        System.out.println("Binary of 59: " + bin);
        System.out.println("Octal of 59: " + oct);
        System.out.println("Hex of 59: " + hex);
    }
};