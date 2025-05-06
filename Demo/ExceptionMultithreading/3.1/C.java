import java.io.*;
import java.util.*;

public class C {
    static float div(int num1, int num2) throws ArithmeticException {
        return (float) num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        try{
            System.out.println("The Division of " + num1 + " / " + num2 + " : " + div(num1, num2));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
};