package myPackage;

import java.io.*;
import java.util.*;

public interface Methods {
    default void data(){
        System.out.println("This is a Default Method of Interface");
    }
    void getData();
    void getLength();
};