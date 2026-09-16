class MyEmployee {
  private int id;
  private  String name;

  public MyEmployee () {
    this.id = 45;
    this.name = "Pritesh";
  }
  public MyEmployee (int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId () {
    return this.id;
  }
  public String getName () {
    return this.name;
  }
}

public class Main {
  public static void main(String[] args) {
    MyEmployee e1 = new MyEmployee();
    MyEmployee e2 = new MyEmployee(12, "Artist");

    System.out.println(e1.getId());
    System.out.println(e1.getName());
    System.out.println(e1.getId());
    System.out.println(e2.getName());
  }
}