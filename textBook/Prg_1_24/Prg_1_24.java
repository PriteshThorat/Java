import java.io.*;
import java.lang.*;

public class Prg_1_24{
    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            if(i % 2 == 0)
                continue;
                System.out.println("\n" + i);
        }
    }
};