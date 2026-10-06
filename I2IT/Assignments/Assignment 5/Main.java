import java.util.Scanner;

class Shape {
    void computeArea () {
        System.out.println("Area of Shape");
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override 
    void computeArea () {
        double area = 0.5 * base * height;

        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override 
    void computeArea () {
        double area = length * width;

        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    @Override 
    void computeArea () {
        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Area Calculation =====");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Shape shape;

        switch (choice) {
            case 1:
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();

                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();

                shape = new Triangle(base, height);

                shape.computeArea();

                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = sc.nextDouble();

                System.out.print("Enter width of rectangle: ");
                double width = sc.nextDouble();

                shape = new Rectangle(length, width);

                shape.computeArea();

                break;
            case 3:
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();

                shape = new Circle(radius);

                shape.computeArea();
                
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}