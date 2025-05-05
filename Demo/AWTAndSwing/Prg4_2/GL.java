import java.io.*;
import java.util.*;
import java.awt.*;

public class GL {
    public static void main(String[] args) {
        Frame f = new Frame("4.2 GridLayout");

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");

        f.setLayout(new GridLayout(3, 2));

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);

        f.setSize(500, 700);
        f.setVisible(true);
    }
};