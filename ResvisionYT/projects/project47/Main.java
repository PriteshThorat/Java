import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main (String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    // System.out.println(localDateTime);

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");

    String myDate = localDateTime.format(dateTimeFormatter);
    System.out.println(myDate);

    // DateTimeFormatter isoLocalDateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;

    // String myDate = localDateTime.format(isoLocalDateTimeFormatter);
    // System.out.println(myDate);
  }
}