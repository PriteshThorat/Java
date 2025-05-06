import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        float div;

        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();

        try{
            div = num1 / num2;

            System.out.println("The Division of " + num1 + " / " + num2 + " : " + div);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
};