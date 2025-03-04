import java.io.*;
import java.lang.*;
import java.util.*;

class Nation{
  String name;
  long pop;

  Nation(String n, long p){
    name = n;
    pop = p;
  }

  void display(){
    System.out.println("Nation: " + name);
    System.out.println("Population: " + pop);
  }
};

public class Prg_3_8{
  public static void main(String[] args){
    Nation asia[] = new Nation[3];
    asia[0] = new Nation("Korea", 56233314);
    asia[1] = new Nation("Iran", 35264124);
    asia[2] = new Nation("Singapore", 2356660);
    for(int i = 0; i < 3; i++)
      asia[i].display();
  }
};