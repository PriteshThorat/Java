import java.io.*;
import java.util.*;
import java.lang.*;

class Country{
  int population;
  int noOfStates;
  float currencyRate;

  Country(int x, int y){
    population = x;
    noOfStates = y;
  }

  void display(){
    System.out.println("Population: " + population);
    System.out.println("Number of States: " + noOfStates);
  }
};

public class Prg_2_6{
  public static void main(String[] args){
    Country c = new Country(100000, 10);
    c.display();
  }
};