import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_2_29{
    public static void main(String[] args){
        Character ch = 'X';
        System.out.print("Char value: ");
        System.out.println(ch.charValue());
        if(Character.isDigit('0'))
            System.out.println("0 is digit");
        if(Character.isLowerCase('R'))
            System.out.println("R is lower case");
        else{
            System.out.println("R is upper case");
            System.out.print("Lower case: ");
            System.out.println(Character.toLowerCase('R'));
        }
        if(Character.isWhitespace(' '))
            System.out.println("Character is white space");
    }
};