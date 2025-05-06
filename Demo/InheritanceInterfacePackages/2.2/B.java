import java.io.*;
import java.util.*;

interface Progrramming {
    void functionality();
    void syntax();
    void spaceComplexity();
    void timeComplexity();
};

interface APIs extends Progrramming {
    void get();
    void CORSError();
};

class Java implements APIs {
    @Override
    public void functionality(){
        System.out.println("The Java Functionality Defination");
    }
    public void syntax(){
        System.out.println("The Java Syntax Defination");
    }
    public void spaceComplexity(){
        System.out.println("The Java Space Complexity Defination");
    }
    public void timeComplexity(){
        System.out.println("The Java Time Complexity Defination");
    }
    public void get(){
        System.out.println("The Java APS's GET Method Defination");
    }
    public void CORSError(){
        System.out.println("The Java API's CORS Error Handling Defination");
    }
};

public class B {
    public static void main(String[] args) {
        Java obj = new Java();

        obj.functionality();
        obj.syntax();
        obj.spaceComplexity();
        obj.timeComplexity();
        obj.get();
        obj.CORSError();
    }
};