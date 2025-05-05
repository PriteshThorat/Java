// Write programs to demonstrate use of Built in packages and User defined packages.

import java.util.ArrayList;  
import shapes.*;  

public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Circle myCircle = new Circle(5.0);  
        double area = myCircle.area();      
        System.out.println("\nArea of the circle: " + area);
    }
};