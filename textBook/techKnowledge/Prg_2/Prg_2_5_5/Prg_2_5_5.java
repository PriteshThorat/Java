import java.awt.*;
import javax.swing.*;

public class Prg_2_5_5{
    public static void main(String[] args){
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("This is textarea.\nWithout scrollbars.", 20, 20);
        
        area.setBounds(10, 30, 300, 300);
        f.setLayout(new FlowLayout());
        f.add(area);
        f.setSize(400, 400);
        f.setTitle("Demonstrating JTextArea");
        f.setVisible(true);
    }
};