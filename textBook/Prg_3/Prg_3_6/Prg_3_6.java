import java.io.*;
import java.lang.*;
import java.util.*;

interface MyInterface{
    void callback(int param);
};

class Client implements MyInterface{
    @Override
    public void callback(int p){
        System.out.println("callback called with " + p);
    }
};

public class Prg_3_6{
    public static void main(String[] args){
        MyInterface c = new Client();
        c.callback(42);
    }
};