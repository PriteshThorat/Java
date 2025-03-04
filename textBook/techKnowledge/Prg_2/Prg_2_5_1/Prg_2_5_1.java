import javax.swing.*;
import java.awt.*;

class Prg_2_5_1{
  public static void main(String[] args){
    JFrame f = new JFrame("Swing has pluggable look and feel");
    f.setTitle("Demonstrating Swing");
    f.setLayout(new FlowLayout());
    f.setSize(300, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
};