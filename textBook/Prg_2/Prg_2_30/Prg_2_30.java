import java.io.*;
import java.util.*;
import java.lang.*;

public class Prg_2_30{
    private Fruits myFruit;

    public Prg_2_30(Fruits fruits){
        this.myFruit = fruits;
    }

    public void getFruitDesc(){
        switch(myFruit){
            case GRAPE:
                System.out.println("A grape is a non-climacteric fruit.");
                break;
            case APPLE:
                System.out.println("The apple is the pomaceous fruit.");
                break;
            case MANGO:
                System.out.println("The mango is a fleshy stone fruit.");
                break;
            case LEMON:
                System.out.println("Lemons are slow growing varients of citrus.");
                break;
            default:
                System.out.println("No desc available.");
        }
    }

    public static void main(String[] args){
        Prg_2_30 grape = new Prg_2_30(Fruits.GRAPE);
        grape.getFruitDesc();
        Prg_2_30 apple = new Prg_2_30(Fruits.APPLE);
        apple.getFruitDesc();
        Prg_2_30 lemon = new Prg_2_30(Fruits.LEMON);
        lemon.getFruitDesc();
        Prg_2_30 guava = new Prg_2_30(Fruits.GUAVA);
        guava.getFruitDesc();
    }
};

enum Fruits{
    GRAPE, APPLE, MANGO, LEMON, GUAVA
};