import java.io.*;
import java.lang.*;
import java.util.*;

interface SYIT{
    int strength = 68;

    void displaySecond();
};

interface TYIT extends SYIT{
    int strength = 55;

    void displayThird();
    void displayAll();
};

class InfoTech implements TYIT{
    int total;

    @Override
    public void displaySecond(){
        System.out.println("SYIT: " + SYIT.strength);
    }
    @Override
    public void displayThird(){
        System.out.println("TYIT: " + TYIT.strength);
    }
    @Override
    public void displayAll(){
        total = SYIT.strength + TYIT.strength;
        System.out.println("Total: " + total);
    }
};

public class Prg_3_4{
    public static void main(String[] args){
        InfoTech x = new InfoTech();
        x.displaySecond();
        x.displayThird();
        x.displayAll();
    }
};