import java.awt.*;
import javax.swing.*;

public class Prg_2_5_6{
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setLayout(null);
        JLabel l = new JLabel("Select Country: ");
        JComboBox cb = new JComboBox();
        cb.addItem("France");
        cb.addItem("Germany");
        cb.addItem("Italy");
        cb.addItem("Japan");
        f.add(l);
        f.add(cb);
        l.setBounds(30, 50, 100, 30);
        cb.setBounds(150, 50, 100, 30);
        f.setTitle("Demonstrating combo box");
        f.setSize(300, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
};