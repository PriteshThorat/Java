package myPackage;

import java.io.*;
import java.util.*;

public class Mathematics {
    public int add(int num1, int num2){
        return (num1 + num2);
    }
    public int sub(int num1, int num2){
        return (num1 - num2);
    }
    public int mul(int num1, int num2){
        return (num1 * num2);
    }
    public float div(int num1, int num2) throws ArithmeticException {
        return (float) (num1 / num2);
    }
};