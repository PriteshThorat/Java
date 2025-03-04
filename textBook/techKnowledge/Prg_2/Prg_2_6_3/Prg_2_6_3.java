import java.awt.*;
import javax.swing.*;

public class Prg_2_6_3{
    public static void main(String[] args){
        JFrame f = new JFrame();

        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        JRadioButton rb3 = new JRadioButton("Internet Explorer");
        JRadioButton rb4 = new JRadioButton("Mozill Firefox");
        JRadioButton rb5 = new JRadioButton("Google Chrome");

        ButtonGroup bg1 = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();

        f.setLayout(null);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);
        f.add(rb5);

        rb1.setBounds(30, 50, 100, 30);
        rb2.setBounds(150, 50, 100, 30);
        rb3.setBounds(30, 100, 100, 30);
        rb4.setBounds(150, 100, 100, 30);
        rb5.setBounds(270, 100, 100, 30);

        bg1.add(rb1);
        bg1.add(rb2);
        bg2.add(rb3);
        bg2.add(rb4);
        bg2.add(rb5);

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
};