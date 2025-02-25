import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_2_25{
    public static void main(String[] args){
        String s[] = {"Nitin", "Arjun", "Pramod", "Vikas", "Vinay", "Sandeep"};
        String temp;

        for(int i = 0; i < s.length; i++)
            for(int j = 0; j < s.length; j++)
                if(s[i].compareTo(s[j]) < 0){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }

        System.out.println("Sorted strings: ");
        for(int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
};