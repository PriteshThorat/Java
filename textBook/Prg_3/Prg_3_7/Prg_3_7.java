import java.io.*;
import java.lang.*;
import java.util.*;

interface Showable{
    void show();

    interface Message{
        void msg();
    };
};

public class Prg_3_7 implements Showable.Message{
    @Override
    public void msg(){
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args){
        Showable.Message m = new Prg_3_7();
        m.msg();
    }
};