import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    // File file = new File("sample.txt");

    // try {
    //   file.createNewFile();
    // } catch (Exception e) {
    //   System.out.println(e);
    // }

    // try {
    //   FileWriter fileWriter = new FileWriter("sample.txt");

    //   fileWriter.write("Hey, How are you ?");

    //   fileWriter.close();
    // } catch (Exception e) {
    //   System.out.println(e);
    // }

    // File myFile = new File("sample.txt");

    // try {
    //   Scanner sc = new Scanner(myFile);

    //   while (sc.hasNextLine()) {
    //     String line = sc.nextLine();
    //     System.out.println(line);
    //   }

    //   sc.close();
    // } catch (Exception e) {
    //   System.out.println(e);
    // }

    // File file = new File("sample.txt");

    // if (file.delete()) {
    //   System.out.println("File successfully deleted.");
    // } else {
    //   System.out.println("Some error came");
    // }

    File file = new File("sample.txt");

    try {
      file.createNewFile();
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      FileWriter fileWriter = new FileWriter(file.getName());

      fileWriter.write("Hey, How are you ?");

      fileWriter.close();
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      Scanner sc = new Scanner(file);

      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        System.out.println(line);
      }

      sc.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}