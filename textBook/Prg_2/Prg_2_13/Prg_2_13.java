import java.io.*;
import java.lang.*;
import java.util.*;

public class Prg_2_13{
    public static void main(String[] args){
        int add = 0;
        for(int i = 0; i < args.length; i++){
            add = add + Integer.parseInt(args[i]);
        }
        System.out.println("Addition: " + add);
    }
};