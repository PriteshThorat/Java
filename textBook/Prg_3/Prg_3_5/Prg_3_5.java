import java.io.*;
import java.lang.*;
import java.util.*;

class Player{
    String name;

    void getName(String n){
        name = n;
    }
    void putName(){
        System.out.println("Name: " + name);
    }
};

class Records extends Player{
    float avg, sRate;

    void getData(float a, float s){
        avg = a;
        sRate = s;
    }
    void putData(){
        System.out.println("Records:- ");
        System.out.println("Average: " + avg);
        System.out.println("Strike Rate: " + sRate);
    }
};

interface IPL{
    void displayEarning();
};

interface Information{
    void getTeam(String t);
};

class Match extends Records implements IPL, Information{
    long earn;

    Match(long e){
        earn = e;
    }

    @Override
    public void displayEarning(){
        System.out.print("His earning: " + earn);
        System.out.println(" Rupees");
    }
    @Override
    public void getTeam(String t){
        System.out.println("Team: " + t);
    }
};

public class Prg_3_5{
    public static void main(String[] args){
        Match s = new Match(5600000);
        s.getName("Shane Warne");
        s.putName();
        s.getTeam("Rajasthan Royals");
        s.getData(30.52f, 123.45f);
        s.putData();
        s.displayEarning();
    }
};