// Design a Complex class using default and parameterized constructors and implement addition and multiplication on complex numbers. 
// The program should accept input values from the user and display the result of each operation in standard complex number format. 

import java.util.Scanner;

class Complex {
  float real, img;

  Complex () {
    real = 0;
    img = 0;
  }
  Complex (float real, float img) {
    this.real = real;
    this.img = img;
  }

  void addNumber (Complex c1, Complex c2) {
    float realNumberAddition = c1.real + c2.real;
    float imgNumberAddition = c1.img + c2.img;

    System.out.println("Addition of Real and Imaginary Number is " + realNumberAddition + " + " + imgNumberAddition + "i");
  }
  void mulNumber (Complex c1, Complex c2) {
    float realNumberMul = (c1.real * c2.real) - (c1.img * c2.img);
    float imgNumberMul = (c1.real * c2.img) + (c1.img * c2.real);

    System.out.println("Multiplication of Real and Imaginary Number is " + realNumberMul + " + " + imgNumberMul + "i");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Complex complex = new Complex();

    float num1, num2;

    System.out.print("Enter the First Number (Real and Imaginary): ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();

    Complex obj1 = new Complex(num1, num2);

    System.out.print("Enter the Second Number (Real and Imaginary): ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();

    Complex obj2 = new Complex(num1, num2);

    complex.addNumber(obj1, obj2);
    complex.mulNumber(obj1, obj2);

    sc.close();
  }
}