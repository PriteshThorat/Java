import javax.swing.*;
import java.awt.*;

public class Prg_2_6_2{
    public static void main(String[] args){
        JFrame f = new JFrame();
        JCheckBox ch1 = new JCheckBox("Option 1", true);
        JCheckBox ch2 = new JCheckBox("Option 2");
        JCheckBox ch3 = new JCheckBox("Option 3");
        JCheckBox ch4 = new JCheckBox("Option 4", true);

        f.setLayout(null);
        f.add(ch1);
        f.add(ch2);
        f.add(ch3);
        f.add(ch4);
        ch1.setBounds(30, 50, 100, 30);
        ch2.setBounds(150, 50, 100, 30);
        ch3.setBounds(30, 100, 100, 30);
        ch4.setBounds(150, 100, 100, 30);
        f.setTitle("Demonstrating JCheckBox");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
};