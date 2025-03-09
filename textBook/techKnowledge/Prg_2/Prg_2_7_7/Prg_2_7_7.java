import javax.swing.*;
import java.awt.*;

public class Prg_2_7_7{
    public static void main(String[] args){
        JFrame f = new JFrame("Demonstrating JSlider");
        JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel p = new JPanel();

        p.add(s);
        f.add(p);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
};