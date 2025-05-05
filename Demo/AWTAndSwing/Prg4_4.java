import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Prg4_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("4.4");

        JLabel l = new JLabel("This is an JLabel");
        Icon i = new ImageIcon("C:/Users/Admin/Downloads/Projects/Java/Demo/AWTAndSwing/icon.png");
        JLabel lWithImg = new JLabel("This is a JLabel with Icon: ", i, JLabel.CENTER);
        JTextField tf = new JTextField("This is a JTextField");
        JButton btn = new JButton("This is a JButton");
        JCheckBox checkBox = new JCheckBox("This is a JCheckBox");
        JRadioButton radioBtn1 = new JRadioButton("Option 1");
        JRadioButton radioBtn2 = new JRadioButton("Option 2");
        JRadioButton radioBtn3 = new JRadioButton("Option 3");

        ButtonGroup group = new ButtonGroup();
        group.add(radioBtn1);
        group.add(radioBtn2);
        group.add(radioBtn3);

        String[] data = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JComboBox<String> cb = new JComboBox<>(data);

        f.setLayout(new FlowLayout());
        f.add(l);
        f.add(lWithImg);
        f.add(tf);
        f.add(cb);
        f.add(btn);
        f.add(checkBox);
        f.add(radioBtn1);
        f.add(radioBtn2);
        f.add(radioBtn3);

        f.setVisible(true);
        f.setSize(400, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
};