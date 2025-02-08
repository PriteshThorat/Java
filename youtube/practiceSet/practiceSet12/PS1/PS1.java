import java.io.*;
import java.lang.*;
import java.util.*;

import myPackage.*;

public class PS1{
    public static void main(String[] args){
        Calculator c = new Calculator();
        ScCalculator sc = new ScCalculator();
        HybridCalculator hc = new HybridCalculator();

        c.method();
        sc.method();
        hc.method();
    }
};