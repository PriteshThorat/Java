import java.io.*;
import java.lang.*;
import java.util.*;

class Primary{
    int cal;

    Primary(int a){
        cal = a;
    }

    void show(){
        System.out.println("Super class cal: " + cal);
    }
};

class Secondary extends Primary{
    int cal;

    Secondary(int x, int y){
        super(y);
        cal = x;
    }

    void display(){
        System.out.println("Sub class cal: " + cal);
    }
};

public class Prg_2_48{
    public static void main(String[] args){
        Secondary s = new Secondary(15, 22);
        s.show();
        s.display();
    }
};