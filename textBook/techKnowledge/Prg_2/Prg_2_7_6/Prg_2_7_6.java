import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;

public class Prg_2_7_6{
    public static void main(String[] args){
        JFrame f = new JFrame("frame");
        JPanel p = new JPanel();
        JTextArea t1 = new JTextArea(20, 20);

        t1.setToolTipText("this is a text Area");
        p.add(t1);
        f.add(p);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
};