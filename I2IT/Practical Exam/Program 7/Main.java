// Adapter Design Pattern – XML to JSON Payment Processing: Implement the Adapter pattern to convert XML-based payment data from a legacy service into a JSON-compatible interface. 

class LegacyService {
  void processPayment (String xml) {
    System.out.println("Legacy Payment Service");
    System.out.println("XML: " + xml);
  }
}

interface AdapterPattern {
  void processPayment(String json);
}

class JSONService implements AdapterPattern {
  LegacyService legacyService = new LegacyService();

  @Override 
  public void processPayment (String json) {
    String amount = json.split("\"amount\": ")[1].split(", ")[0];
    String currency = json.split("\"currency\": ")[1].split(", ")[0];

    String xml = "<payment>" + "<amount>" + amount + "</amount>" + "<currency>" + currency + "</currency>" + "</payment>";

    legacyService.processPayment(xml);
  } 
}

public class Main {
  public static void main(String[] args) {
    String json = "{\"amount\": 150, \"currency\": \"INR\", }";

    JSONService jsonService = new JSONService();
    jsonService.processPayment(json);
  }
}