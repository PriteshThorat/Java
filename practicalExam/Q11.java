// Develop program for implementation of interface.

interface Animal {
    void sound();  
    void sleep();  
}

class Dog implements Animal {
    public void sound() {
        System.out.println("The dog barks!");
    }
    
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("The cat meows!");
    }

    public void sleep() {
        System.out.println("The cat is sleeping.");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  
        dog.sleep();  

        Animal cat = new Cat();
        cat.sound();  
        cat.sleep();  
    }
};