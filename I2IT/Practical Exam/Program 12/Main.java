// Design a Complex class using default and parameterized constructors and implement subtraction and division on complex numbers. 
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

  void subNumbers (Complex c1, Complex c2) {
    float realNumSub = c1.real - c2.real;
    float imgNumSub = c1.img - c2.img;

    System.out.println("The Subtraction of Real and Imaginary Number is " + realNumSub + " + " + imgNumSub + "i");
  }
  void divNumbers (Complex c1, Complex c2) {
    float denominator = (c2.real * c2.real) + (c2.img * c2.img);

    float realNumDiv = ((c1.real * c2.real) + (c1.img * c2.img)) / denominator;
    float imgNumDiv = ((c1.real * c2.img) - (c1.img * c2.real)) / denominator;

    System.out.println("The Division of Real and Imaginary Number is " + realNumDiv + " + " + imgNumDiv + "i");
  }
}

public class Main {
  public static void main(String[] args) {
    Complex complex = new Complex();

    Scanner sc = new Scanner(System.in);

    float real, img;

    System.out.print("Enter First Number (Real and Imaginary): ");
    real = sc.nextInt();
    img = sc.nextInt();

    Complex obj1 = new Complex(real, img);

    System.out.print("Enter Second Number (Real and Imaginary): ");
    real = sc.nextInt();
    img = sc.nextInt();

    Complex obj2 = new Complex(real, img);

    complex.subNumbers(obj1, obj2);
    complex.divNumbers(obj1, obj2);

    sc.close();
  }
}