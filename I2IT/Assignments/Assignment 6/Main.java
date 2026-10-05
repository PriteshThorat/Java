import java.util.Scanner;

class DivisionByZeroException extends Exception {
    DivisionByZeroException () {
        super("DivisionByZeroException: Division By Zero");
    }

    DivisionByZeroException (String msg) {
        super(msg);
    }
}

class InvalidNumberFormatException extends Exception {
    InvalidNumberFormatException () {
        super("InvalidNumberFormatException: Invalid Number Format");
    }

    InvalidNumberFormatException (String msg) {
        super(msg);
    }
}

class Calculation {
    static int num1, num2;

    void input() throws InvalidNumberFormatException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");

        if (!sc.hasNextInt()) {
            throw new InvalidNumberFormatException();
        }
        num1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        if (!sc.hasNextInt()) {
            throw new InvalidNumberFormatException();
        }
        num2 = sc.nextInt();
    }

    void calculation() throws DivisionByZeroException {}
}

class Addition extends Calculation {
    public void calculation () {
        int sum = num1 + num2;

        System.out.println("The Addition of " + num1 + " + " + num2 + " is: " + sum);
    }
}

class Subtraction extends Calculation {
    public void calculation () {
        int sub = num1 - num2;

        System.out.println("The Subtraction of " + num1 + " - " + num2 + " is: " + sub);
    }
}

class Multiplication extends Calculation {
    public void calculation () {
        int mul = num1 * num2;

        System.out.println("The Multiplication of " + num1 + " * " + num2 + " is: " + mul);
    }
}

class Division extends Calculation {
    public void calculation () throws DivisionByZeroException{
        if (num2 == 0) {
            throw new DivisionByZeroException();
        }
        
        int div = num1 / num2;

        System.out.println("The Division of " + num1 + " / " + num2 + " is: " + div);
    }
}

class Reminder extends Calculation {
    public void calculation () {
        int reminder = num1 % num2;

        System.out.println("The Reminder of " + num1 + " % " + num2 + " is: " + reminder);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 6) {
            System.out.println("===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Reminder");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Calculation calculation = new Calculation();

            try {
                if (choice != 6) {
                    calculation.input();
                }

                switch (choice) {
                    case 1:
                        Addition addition = new Addition();
                        addition.calculation();
                        
                        break;
                    case 2:
                        Subtraction subtraction = new Subtraction();
                        subtraction.calculation();
                        
                        break;
                    case 3:
                        Multiplication multiplication = new Multiplication();
                        multiplication.calculation();
                        
                        break;
                    case 4:
                        Division division = new Division();
                        division.calculation();
                        
                        break;
                    case 5:
                        Reminder reminder = new Reminder();
                        reminder.calculation();
                        
                        break;
                    case 6:
                        System.out.println("Program Terminated");
                        break;
                }
            } catch (InvalidNumberFormatException e) {
                System.out.println(e);
            } catch (DivisionByZeroException e) {
                System.out.println(e);
            }
        }

        sc.close();
    }
}