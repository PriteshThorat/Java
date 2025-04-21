// Develop program to implement Single inheritance and Multilevel inheritance.

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " barks!");
    }
}

class Puppy extends Dog {
    Puppy(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " makes a tiny bark!");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();  

        Puppy puppy = new Puppy("Rocky");
        puppy.sound();  
    }
};