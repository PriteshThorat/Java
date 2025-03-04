import java.io.*;
import java.util.*;
import java.lang.*;

class GrandFather{
    GrandFather(){
        System.out.println("This is GrandFather");
    }
};

class Father extends GrandFather{
    Father(){
        System.out.println("This is Father");
    }
};

class Child extends Father{
    Child(){
        System.out.println("This is Child");
    }
};

public class Prg_2_33{
    public static void main(String[] args){
        Child c = new Child();
    }
};