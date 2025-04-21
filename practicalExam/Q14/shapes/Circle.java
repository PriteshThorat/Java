// Write programs to demonstrate use of Built in packages and User defined packages.

package shapes;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
};