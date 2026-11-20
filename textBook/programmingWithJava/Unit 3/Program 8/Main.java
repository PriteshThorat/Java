import java.util.Scanner;

class Book {
  int id;
  String name;
  Scanner sc;
  Page[] pages;

  class Page {
    int lines[];

    Page (int numLines) {
      lines = new int[numLines];
    }

    void setLines () {
      for (int i = 0; i < lines.length; i++) {
        System.out.print("Enter the number of words for lines " + (i + 1) + ": ");
        lines[i] = sc.nextInt();
      }
    }
    int getLines ()  {
      return lines.length;
    }
  }

  Book (int id, String name, int numpages) {
    this.id = id;
    this.name = name;
    sc = new Scanner(System.in);
    pages = new Page[numpages];
    for (int i = 0; i < pages.length; i++) {
      System.out.print("Enter MEMBER OF LINES for page " + (i + 1) + ": ");
      int nLines = sc.nextInt();
      pages[i] = new Page(nLines);
      pages[i].setLines();
    }
  }

  public int getNumofWords () {
    int numofwords = 0;
    for (int i = 0; i < pages.length; i++) {
      for (int j = 0; j < pages[i].getLines(); j++) {
        numofwords += pages[i].lines[j];
      }
    }

    return numofwords;
  }
}

public class Main {
  public static void main(String[] args) {
    Book b = new Book(1, "OOPM Book", 3);
    int nowords = b.getNumofWords();
    System.out.println("Total Words = " + nowords);
  }
}