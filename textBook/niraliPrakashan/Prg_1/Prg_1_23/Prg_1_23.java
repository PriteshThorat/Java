import java.io.*;
import java.lang.*;

public class Prg_1_23{
    public static void main(String[] args){
        boolean t = true;
        a:
        {
            b:
            {
                c:
                {
                    System.out.println("Before the break");
                    if(t)
                        break b;
                    System.out.println("This will not execute");
                }
                System.out.println("This is after b");
            }
        }
    }
};