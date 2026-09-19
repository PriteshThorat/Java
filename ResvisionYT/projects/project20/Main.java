interface Bicycle {
  void applyBrake (int dec);
  void speedUp (int inc);
}

class AvonCycle implements Bicycle {
  int speed = 7;

  @Override 
  public void applyBrake (int dec) {
    speed -= dec;
  }
  @Override 
  public void speedUp (int inc) {
    speed += inc;
  }
}

public class Main {
  public static void main(String[] args) {
    AvonCycle avonCycle = new AvonCycle();
    
    avonCycle.applyBrake(2);
    System.out.println(avonCycle.speed);
    avonCycle.speedUp(5);
    System.out.println(avonCycle.speed);
  }
}