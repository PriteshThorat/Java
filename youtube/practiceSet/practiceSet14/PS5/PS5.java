import java.io.*;
import java.lang.*;
import java.util.*;

class CustomeException extends Exception{
    public CustomeException(){
        super("Array Index should be between 0 to 4 Index");
    }
};

public class PS5 {
    static void showArray(int[] array) throws CustomeException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array Index: ");
        int index = sc.nextInt();

        if (index < 0 || index >= array.length) {
            throw new CustomeException();
        }

        System.out.println("The Values at index " + index + " is " + array[index]);
    }

    public static void main(String[] args){
        int array[] = {4, 2, 34, 3, 23};
        int index;
        int i = 0;

        while(i < 5){
            try{
                showArray(array);
            }catch(CustomeException e){
                System.out.println(e);
            }

            i++;
        }
    }
};