import java.io.*;
import java.lang.*;
import java.util.*;

public class PS2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sub1, sub2, sub3;
        float gp1, gp2, gp3;
        float cgpa;

        System.out.println("Enter 1st Subject Marks: ");
        sub1 = sc.nextInt();
        System.out.println("Enter 2nd Subject Marks: ");
        sub2 = sc.nextInt();
        System.out.println("Enter 3rd Subject Marks: ");
        sub3 = sc.nextInt();

        gp1 = sub1/10;
        gp2 = sub2/10;
        gp3 = sub3/10;

        cgpa = (gp1 + gp2 + gp3)/3;
        System.out.println("CGPA: " + cgpa);
    }
};