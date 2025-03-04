import javax.swing.*;
import java.awt.*;

class Prg_2_5_1{
  public static void main(String[] args){
    JFrame f = new JFrame();
    JLabel jl = new JLabel("Swing has pluggable look and feel");
    f.add(jl);
    f.setTitle("Demonstrating Swing");
    f.setSize(300, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
};