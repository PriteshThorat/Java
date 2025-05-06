import java.io.*;
import java.util.*;

class PasswordIncorrectException extends Exception{
    PasswordIncorrectException(String msg){
        super(msg);
    }
};

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass;
        System.out.print("Enter the Password: ");
        pass = sc.next();

        try{
            System.out.println(pass);
            if(!pass.equals("MSBTE")){
                throw new PasswordIncorrectException("The Password is Incorrect");
            }

            System.out.println("You'r Logged In");
        }catch(PasswordIncorrectException e){
            System.out.println(e);
        }finally{
            System.out.println("This will always Exected");
        }
    }
};