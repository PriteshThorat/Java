import java.io.*;
import java.lang.*;
import java.util.*;

class NegativeOutputException extends Exception{
    private int det;

    NegativeOutputException(int a){
        det = a;
    }

    @Override
    public String toString(){
        return "NegativeOutputException" + " [" + det + "]";
    }
};

public class Prg_4_9{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z;

        try{
            z = x * y;
            if(z < 0)
                throw new NegativeOutputException(z);
            System.out.println("Output: " + z);
        }catch(NegativeOutputException e){
            System.out.println("Caught: " + e);
        }
    }
};