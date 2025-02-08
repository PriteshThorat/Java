import java.io.*;
import java.util.*;
import java.lang.*;

public class PS2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sub1, sub2, sub3;
        System.out.println("Enter 1st Subject Marks: ");
        sub1 = sc.nextInt();
        System.out.println("Enter 2nd Subject Marks: ");
        sub2 = sc.nextInt();
        System.out.println("Enter 3rd Subject Marks: ");
        sub3 = sc.nextInt();

        float per = (sub1 + sub2 + sub3) / 3;

        if(per >= 40 && (sub1 >= 33 && sub2 >= 33 && sub3 >= 33)){
            System.out.println("Student is Passed");
        }else{
            System.out.println("Student is Failed");
        }
    }
};