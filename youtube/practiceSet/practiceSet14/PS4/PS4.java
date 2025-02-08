import java.io.*;
import java.lang.*;
import java.util.*;

class MyCustomeException extends Exception{
    MyCustomeException(String msg){
        super(msg);
    }
};

public class PS4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int array[] = {4, 2, 34, 3, 23};
        int index;
        int i = 0;

        while(i < 5){
            System.out.println("Enter Array Index: ");
            index = sc.nextInt();

            try{
                if(index >= 0 && index < 5){
                    System.out.println("The Values at index " + index + " is " + array[index]);
                    break;
                }else{
                    i++;
                    throw new MyCustomeException("Array Index should be between 0 to 4");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
};