import java.awt.*;
import java.io.*;
import java.util.*;

public class FL {
    public static void main(String[] args) {
        Frame f = new Frame("4.2 FlowLayout");
        
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        f.setLayout(new FlowLayout());
        
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);

        f.setSize(400, 400);
        f.setVisible(true);
    }
};