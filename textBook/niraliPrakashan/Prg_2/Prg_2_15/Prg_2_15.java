import java.io.*;
import java.lang.*;
import java.util.*;

class X{
    int a;

    X(){
        a = 0;
    }
};

public class Prg_2_15{
    public static void main(String[] args){
        X ob1 = new X();
        X ob2 = new X();
        ob1 = ob2;
    }
};