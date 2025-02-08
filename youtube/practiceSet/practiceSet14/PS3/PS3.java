import java.util.*;

public class PS3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int array[] = {4, 2, 34, 3, 23};
        int index;
        int i = 0;

        while(i < 5){
            System.out.println("Enter Array Index: ");
            index = sc.nextInt();

            try{
                System.out.println("The Values at index " + index + " is " + array[index]);
                break;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error");
            }

            i++;
        }
    }
};