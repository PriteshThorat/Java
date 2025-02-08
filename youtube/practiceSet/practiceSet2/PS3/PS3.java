import java.io.*;
import java.util.*;
import java.util.*;

public class PS3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, n = 5;
        System.out.println("Enter the number: ");
        a = sc.nextInt();

        if (n > a){
            System.out.println("The Given number is Greater than Entered number");
        }else{
            System.out.println("The Given number is Less than Entered number");
        }
    }
};