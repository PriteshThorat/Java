import java.io.*;
import java.util.*;
import java.lang.*;

class Primary{
    int cal;

    void show(){
        System.out.println("Super class cal: " + cal);
    }
};

class Secondary extends Primary{
    int cal;

    Secondary(int x, int y){
        cal = x;
        super.cal = y;
    }

    void display(){
        System.out.println("Sub class cal: " + cal);
    }
};

public class Prg_2_47{
    public static void main(String[] args){
        Secondary s = new Secondary(15, 22);
        s.show();
        s.display();
    }
};