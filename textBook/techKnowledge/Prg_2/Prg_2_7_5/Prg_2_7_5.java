import javax.swing.*;
import java.awt.*;

public class Prg_2_7_5{
    public static void main(String[] args){
        JFrame f = new JFrame("Progress-bar Demo");
        JProgressBar pb = new JProgressBar(0, 100);

        pb.setValue(100);
        pb.setStringPainted(true);
        f.add(pb);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
};