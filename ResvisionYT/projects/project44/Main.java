import java.util.Calendar;
import java.util.TimeZone;

public class Main {
  public static void main (String[] args) {
    // Calendar calendar = Calendar.getInstance();

    // System.out.println(calendar.getCalendarType());
    // System.out.println(calendar.getTimeZone());

    // Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

    // System.out.println(calendar.getCalendarType());
    // System.out.println(calendar.getTimeZone().getID());

    Calendar calendar = Calendar.getInstance();
    
    System.out.println(calendar.getTimeZone().getID());
  }
}