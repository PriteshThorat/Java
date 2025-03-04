import java.io.*;
import java.util.*;
import java.lang.*;

public class Prg_2_26{
    public static void main(String[] args){
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(23);
        v.addElement(9.6f);
        v.addElement("Hello");
        v.addElement(42);

        System.out.println("Capacity after 4 additions: " + v.capacity());
        v.addElement(63.2);
        System.out.println("Current capacity: " + v.capacity());
        System.out.println("Current size: " + v.size());
        v.addElement(19.44);
        v.addElement(7);
        System.out.println("First element: " + (Integer) v.firstElement());
        System.out.println("Last element: " + (Integer) v.lastElement());
        if(v.contains(42))
            System.out.println("Vector contains 3.");
        System.out.println("Vector: " + v.toString());
        v.setSize(8);
        System.out.println("Vector: " + v.toString());
        Object o = new Object();
        o = v.clone();
        System.out.println("New Vector: " + o);
        v.removeAllElements();
        if(v.isEmpty())
            System.out.println("Vector is empty");
    }
};