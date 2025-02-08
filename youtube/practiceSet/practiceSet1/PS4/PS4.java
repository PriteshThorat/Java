import java.io.*;
import java.util.*;
import java.lang.*;

public class PS4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float km;
        float miles;

        System.out.println("Enter the distance in km: ");
        km = sc.nextFloat();
        miles = km * 0.621371f;
        System.out.println("The discance in miles is: " + miles);
    }
};