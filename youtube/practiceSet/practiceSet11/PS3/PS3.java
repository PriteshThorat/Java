import java.io.*;
import java.lang.*;
import java.util.*;

class Monkey{
    public void jump(){
        System.out.println("Monkey jumps");
    }
    public void bite(){
        System.out.println("Monkey bites");
    }
};

interface BasicAnimal{
    void eat();
    void sleep();
};

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Human eats");
    }
    @Override
    public void sleep(){
        System.out.println("Human sleeps");
    }
};

public class PS3{
    public static void main(String[] args){
        Human h = new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }
};