import java.awt.*;
import javax.swing.*;

public class Prg_2_7_4{
    public static void main(String[] args){
        JFrame f = new JFrame();

        f.setLayout(new BorderLayout());
        final String[] colHeads = {"Roll No.", "Name", "City", "Phone No."};
        final Object[][] data = {
            {"1", "Amit", "Ahmedabad", "559847"},
            {"2", "Ketan", "Rajkot", "756655"},
            {"3", "Vivek", "Junagadh", "563458"},
            {"4", "Mahendra", "Rajkot", "734592"},
            {"5", "Ankita", "Surat", "123733"},
            {"6", "Jayesh", "Baroda", "565614"},
            {"7", "Rajshree", "Jamnagar", "567221"},
            {"8", "Suresh", "Surat", "674142"},
            {"9", "Hiran", "Rajkot", "902375"}
        };

        JTable t = new JTable(data, colHeads);
        
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        JScrollPane sp = new JScrollPane(t, v, h);
        f.add(sp, BorderLayout.CENTER);
        f.setSize(400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
};