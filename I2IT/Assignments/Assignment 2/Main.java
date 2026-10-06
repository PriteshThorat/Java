import java.util.Scanner;

class Bag {
    String color;
    double weight;
    static int noOfObjects = 0;
    static double totalWeight = 0.0;

    Bag () {
        color = "Black";
        weight = 1.20;
        noOfObjects += 1;
        totalWeight += weight; 
    }

    Bag (String color, double weight) {
        this.color = color;
        this.weight = weight;
        noOfObjects += 1;
        totalWeight += weight;
    }

    public void display () {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = 0;
        String color;
        double weight;

        do {
            System.out.println("***** MENU ****");
            System.out.println("1. Color and weight from user");
            System.out.println("2. Default color and weight");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Color and weight: ");
                    color = sc.next();
                    weight = sc.nextDouble();
                    Bag b1 = new Bag(color, weight);
                    b1.display();
                    break;
                case 2:
                    Bag b2 = new Bag();
                    b2.display();
                case 3:
                default:
                    break;
            }
        } while (ch != 3);
        
        System.out.println("No of objects: " + Bag.noOfObjects);
        System.out.println("Total weight: " + Bag.totalWeight);

        sc.close();
    }
}