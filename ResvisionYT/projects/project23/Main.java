interface MyCamera {
  void takeSnap ();
  void recordVideo ();
  private void greet () {
    System.out.println("Good Morning.");
  }
  default void record4KVideo () {
    greet();
    
    System.out.println("Recording in 4K...");
  }
}

interface MyWiFi {
  String[] getNetworks ();
  void connectToNetwork (String network);
}

class MyCellPhone {
  void callNumber (int phoneNumber) {
    System.out.println("Calling " + phoneNumber);
  }
  void pickCall () {
    System.out.println("Connecting...");
  }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWiFi {
  // public void record4KVideo () {
  //   System.out.println("Taking snap and recording in 4K...");
  // }
  public void takeSnap () {
    System.out.println("Taking snap...");
  }
  public void recordVideo () {
    System.out.println("Taking video...");
  }
  public String[] getNetworks () {
    System.out.println("Getting list of networks.");

    String networkList[] = {"Vi", "Airtel", "Idea"};

    return networkList;
  }
  public void connectToNetwork (String network) {
    System.out.println("Connecting to " + network);
  }
}

public class Main {
  public static void main(String[] args) {
    MyCamera myCamera = new MySmartPhone();

    myCamera.takeSnap();
    myCamera.recordVideo();
    myCamera.record4KVideo();
  }
}
