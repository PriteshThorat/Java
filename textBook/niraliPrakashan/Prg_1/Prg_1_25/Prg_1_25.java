import java.io.*;
import java.lang.*;

public class Prg_1_25{
    public static void main(String[] args){
        boolean t = true;
        System.out.println("Before the return.");
        if(t)
            return;
        System.out.println("This won't execute.");
    }
};