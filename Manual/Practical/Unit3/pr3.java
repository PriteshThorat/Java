
import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        System.out.print("The character '" + ch + "' is ");
        
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("a vowel.");
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("a digit.");
                break;
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
                System.out.println("an arithmetic operator.");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    System.out.println("a consonant.");
                else
                    System.out.println("a special character.");
        }
        
        scanner.close();
    }
}
