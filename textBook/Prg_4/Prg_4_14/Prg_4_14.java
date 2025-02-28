import java.lang.*;
import java.io.*;
import java.util.*;

class Theatre extends Thread{
    String str;

    Theatre(String str){
        this.str = str;
    }

    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(str + ": " + i);

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
};

public class Prg_4_14{
    public static void main(String[] args){
        Theatre obj1 = new Theatre("Cut Ticket");
        Theatre obj2 = new Theatre("Show Chair");
        obj1.start();
        obj2.start();
    }
};