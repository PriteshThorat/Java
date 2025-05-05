import java.io.*;
import java.util.*;
import java.awt.*;

public class BL {
    public static void main(String[] args) {
        Frame f = new Frame("4.2 BorderLayout");
        
        Button n = new Button("North");
        Button s = new Button("South");
        Button e = new Button("East");
        Button w = new Button("West");
        Button c = new Button("Center");

        f.setLayout(new BorderLayout(10, 10));

        f.add(n, BorderLayout.NORTH);
        f.add(s, BorderLayout.SOUTH);
        f.add(e, BorderLayout.EAST);
        f.add(w, BorderLayout.WEST);
        f.add(c, BorderLayout.CENTER);

        f.setSize(400, 500);
        f.setVisible(true);
    }
}