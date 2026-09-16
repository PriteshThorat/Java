class MyEmployee {
  private int id;
  private  String name;

  public void setId (int id) {
    this.id = id;
  }
  public void setName (String name) {
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
    MyEmployee e = new MyEmployee();

    // e.id = 45;
    // e.name = "Pritesh";

    e.setId(45);
    e.setName("Pritesh");
    System.out.println(e.getId());
    System.out.println(e.getName());
  }
}