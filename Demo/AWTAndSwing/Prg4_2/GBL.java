import java.io.*;
import java.awt.*;
import java.util.*;

public class GBL{
    public static void main(String[] args) {
        Frame f = new Frame("4.2 GridBagLayout");

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");

        GridBagConstraints gbc = new GridBagConstraints();

        f.setLayout(new GridBagLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(btn1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(btn2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        f.add(btn3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        f.add(btn4, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        f.add(btn5, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        f.add(btn6, gbc);

        f.setVisible(true);
        f.setSize(400, 500);
    }
}