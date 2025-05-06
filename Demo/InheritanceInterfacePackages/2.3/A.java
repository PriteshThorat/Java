import myPackage.*;
import java.io.*;
import java.util.*;

class Database implements Methods {
    @Override
    public void getData(){
        System.out.println("Some Data");
    }
    public void getLength(){
        System.out.println("Some Length");
    }
};

public class A {
    public static void main(String[] args) {
        Mathematics math = new Mathematics();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + math.add(a, b));
        System.out.println("Subtraction: " + math.sub(a, b));
        System.out.println("Multiplication: " + math.mul(a, b));
        System.out.println("Division: " + math.div(a, b));

        System.out.println("-------------------------------------------");
        Database db = new Database();

        db.data();
        db.getData();
        db.getLength();
    }
};