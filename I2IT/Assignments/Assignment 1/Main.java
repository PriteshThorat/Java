import java.util.Scanner;

class complexOp {
  float real, img;
  
  complexOp () {
    real = 0;
    img = 0;
  }
  
  complexOp (float c1, float c2) {
    real = c1;
    img = c2;
  }
  
  public void addNumbers (complexOp c1, complexOp c2) {
    float real, img;
    
    real = (c1.real + c2.real);
    img = (c1.img + c2.img);
    
    System.out.println(" \n Addition of given complex number is : (" + real + ") + (" + img + ")i" );
  }

  public void subtractNumbers (complexOp c1, complexOp c2) {
    float real, img;
    
    real = (c1.real - c2.real);
    img = (c1.img - c2.img);

    System.out.println(" \n Subtraction of given complex number is : (" + real + ") + (" + img  + ")i");

  }

  public void multiplication (complexOp c1, complexOp c2) {
    float real, img;

    real = (c1.real * c2.real) - (c1.img * c2.img);
    img = (c1.real * c2.img) + (c1.img * c2.real);

    System.out.println(" \n Multiplication of given complex number is : " + real + " + " + img + "i");
  }

  public void divideNumber (complexOp c1, complexOp c2) {
    float denominator;
    float real, img;

    denominator = (c2.real * c2.real) + (c2.img * c2.img);

    real = ((c1.real * c2.real) + (c1.img * c2.img)) / denominator;
    img = ((c1.img * c2.real) - (c1.real * c2.real)) / denominator;

    System.out.println(" \n Division of given complex number is : " + real + " + " + img + "i");
  }
}

public class  Main {
  public static void main (String args[]) {
    int choice = 0;
    float num1, num2, ans;

    complexOp cal = new complexOp();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number (real and imaginary part): ");

    num1 = input.nextInt(); // Real Part
    num2 = input.nextInt(); // Imaginary Part

    complexOp obj1 = new complexOp(num1, num2);
    System.out.println("First number: " + "(" + num1 + ") + (" + num2 + ")i");

    System.out.print("Enter the Second number (Real and imaginary part: ");

    num1 = input.nextInt();
    num2 = input.nextInt();

    System.out.println("Second number: " + "(" + num1 + ") + ("  + num2 + ")i");

    complexOp obj2 = new complexOp(num1, num2);

    do {
      System.out.println("==============  MENU ====================");
      System.out.println("1. Addition: ");
      System.out.println("2. Subtraction: ");
      System.out.println("3. Multiplication: ");
      System.out.println("4. Division: ");
      System.out.println("5. Exit: ");
      System.out.print("Enter the choice: ");

      choice = input.nextInt();

      switch (choice) {
        case 1:
          cal.addNumbers(obj1, obj2);
          break;
        case 2:
          cal.subtractNumbers(obj1, obj2);
          break;
        case 3:
          cal.multiplication(obj1, obj2);
          break;
        case 4:
          cal.divideNumber(obj1, obj2);
          break;
        case 5:
          System.out.println("The program is terminated.");
          break;
        default:
          System.out.println("Invalid choice!");
      }
    } while(choice != 5);

    input.close();
  }
}