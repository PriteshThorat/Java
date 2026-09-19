class Phone {
  public void showTime () {
    System.out.println("Time is 8 am");
  }
  public void on () {
    System.out.println("Turning on phone...");
  }
}

class SmartPhone extends Phone {
  public void music () {
    System.out.println("Playing Music ...");
  }
  public void on () {
    System.out.println("Turning on Smart Phone...");
  }
}

public class Main {
  public static void main(String[] args) {
    // Phone phone = new Phone();

    // phone.showTime();
    // phone.on();

    // SmartPhone smartPhone = new SmartPhone();

    // smartPhone.music();
    // smartPhone.on();

    Phone phone = new SmartPhone();
    // SmartPhone smartPhone = new Phone(); // Invalid

    phone.showTime();
    phone.on();
    // phone.music(); // Invalid
  }
}