import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_1_16{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("List Value = ");
        for(int x : list){
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println();
        String [] names = {"abc", "xyz", "test", "example"};
        System.out.print("String Array value = ");
        for(String name : names){
            System.out.print(name);
            System.out.print(", ");
        } 
    }
};