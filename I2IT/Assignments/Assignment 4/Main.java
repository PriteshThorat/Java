import java.util.Scanner;

interface MyInterface {
    public void accept();
    public void display();
}

class Fan implements MyInterface {
    int speed;
    String fanSwitch;

    public void accept () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Speed of Fan: ");
        this.speed = sc.nextInt();
        System.out.print("Enter is Fan ON or OFF: ");
        this.fanSwitch = sc.next();
        
    }

    public void display () {
        System.out.println("Speed of Fan: " + speed);
        System.out.println("Fan switch: " + fanSwitch);
    }
}

class AC implements MyInterface {
    int degree;
    String acSwitch;

    public void accept () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Tempreture of AC: ");
        this.degree = sc.nextInt();
        System.out.print("Enter is AC ON or OFF: ");
        this.acSwitch = sc.next();
    }

    public void display () {
        System.out.println("Tempreture of AC: " + degree);
        System.out.println("AC switch: " + acSwitch);
    }
}

class Light implements MyInterface {
    enum LightType {
        WARM,
        WHITE,
        YELLOW
    }

    String lightType;
    String lightSwitch;

    public void accept () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Light Type (Warm, White, Yellow): ");
        this.lightType = sc.next();

        if (lightType == "Warm") {
            LightType lT
        } else if (lightType == "White") {} else if (lightType == "Yellow") {}
        System.out.print("Enter is Light ON or OFF: ");
        this.lightSwitch = sc.next();
    }

    public void display () {
        System.out.println("Type of Light: " + lightType);
        System.out.println("Light switch: " + lightSwitch);
    }
}

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("***** MENU *****");

            System.out.println("1. Fan");
            System.out.println("2. AC");
            System.out.println("3. Light");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Fan f = new Fan();
                    f.accept();
                    f.display();
                    break;
                case 2:
                    AC ac = new AC();
                    ac.accept();
                    ac.display();
                    break;
                case 3:
                    Light light = new Light();
                    light.accept();
                    light.display();
                    break;
                case 4:
                default:
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
