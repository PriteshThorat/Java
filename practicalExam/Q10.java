// Develop a program for implementation of different types of constructors.

class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(Student other) {
        this.id = other.id;
        this.name = other.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.print("Default Constructor: ");
        s1.display();

        Student s2 = new Student(101, "Alice");
        System.out.print("Parameterized Constructor: ");
        s2.display();

        Student s3 = new Student(s2);
        System.out.print("Copy Constructor: ");
        s3.display();
    }
};