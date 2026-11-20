import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class LegacyPaymentService {
  public String getPaymentInXML() throws Exception {
    Scanner input = new Scanner(System.in);
    int choice = 0;
    
    ArrayList<String> paymentId = new ArrayList<>();
    ArrayList<String> paymentAmount = new ArrayList<>();

    while (choice != 2) {
      System.out.println("---- Choose the Below Option ----");
      System.out.println("1. Enter Payment Details");
      System.out.println("2. Exit");

      System.out.print("Enter your Choice: ");
      choice = input.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter Payment ID: ");
          paymentId.add(input.next());

          System.out.print("Enter Payment Amount: ");
          paymentAmount.add(input.next());
          break;
        case 2:
          System.out.println("Payment Details Successfully Entered");
          break;
        default:
          break;
      }
    }

    input.close();

    String paymentData = "";

    for (int i = 0; i < paymentId.size(); i++) {
      paymentData += "<id>" + paymentId.get(i) + "</id>";
      paymentData += "<amount>" + paymentAmount.get(i) + "</amount>";
    }

    String paymentDetails = "<payment>" + paymentData + "</payment>";

    FileWriter fileWriter = new FileWriter("payment.xml");

    fileWriter.write(paymentDetails);

    fileWriter.close();

    return paymentDetails;
  }
}

interface PaymentProcessor {
  void processPaymentInJson(String jsonData);
}

class PaymentAdapter implements PaymentProcessor {
  private LegacyPaymentService legacyService;

  public PaymentAdapter(LegacyPaymentService legacyService) {
    this.legacyService = legacyService;
  }

  @Override
  public void processPaymentInJson(String jsonData) {
    System.out.println("Processing JSON: " + jsonData);
    System.out.println("Transaction Successful!");
  }

  public void process() throws Exception {
    String xml = legacyService.getPaymentInXML();
    System.out.println("Legacy XML: " + xml);

    StringBuilder json = new StringBuilder();
    json.append("{\"payments\":[");

    String[] payments = xml.split("<id>");

    for (int i = 1; i < payments.length; i++) {
      String id = payments[i].substring(
        0, payments[i].indexOf("</id>")
      );

      String remaining = payments[i].substring(
        payments[i].indexOf("</id>") + 5
      );

      String amount = remaining.substring(
        remaining.indexOf("<amount>") + 8,
        remaining.indexOf("</amount>")
      );

      if (i > 1) {
        json.append(",");
      }

      json.append("{\"id\":\"")
        .append(id)
        .append("\",\"amount\":")
        .append(amount)
        .append("}");
    }

    json.append("]}");

    String jsonData = json.toString();

    FileWriter fileWriter = new FileWriter("payment.json");

    fileWriter.write(jsonData);
    
    fileWriter.close();

    processPaymentInJson(jsonData);
  }
}

public class Main {
  public static void main(String[] args) {
    try {
      LegacyPaymentService legacy = new LegacyPaymentService();

      PaymentAdapter adapter = new PaymentAdapter(legacy);

      adapter.process();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}