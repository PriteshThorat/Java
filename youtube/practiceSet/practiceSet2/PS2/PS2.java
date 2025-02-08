import java.io.*;
import java.util.*;
import java.lang.*;

public class PS2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Grade: ");
        char grade = sc.next().charAt(0);

        char encrptedGrade = (char) (grade + 8);
        System.out.println("Encrypted Grade: " + encrptedGrade);

        char decryptedGrade = (char) (encrptedGrade - 8);
        System.out.println("Decrypted Grade: " + decryptedGrade);
    }
};