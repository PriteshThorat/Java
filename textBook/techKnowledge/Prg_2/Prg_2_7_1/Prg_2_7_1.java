import java.awt.*;
import javax.swing.*;

class Pnl1 extends JPanel{
    public Pnl1(){
        JCheckBox cb1 = new JCheckBox("Red");
        JCheckBox cb2 = new JCheckBox("Blue");
        JCheckBox cb3 = new JCheckBox("Green");
        JCheckBox cb4 = new JCheckBox("Yellow");

        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
    }
};

class Pnl2 extends JPanel{
    public Pnl2(){
        JButton btn1 = new JButton("Chocolate");
        JButton btn2 = new JButton("Vanilla");
        JButton btn3 = new JButton("Str");
        JButton btn4 = new JButton("Pineapple");

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
    }
};

class Pnl3 extends JPanel{
    public Pnl3(){
        JComboBox cb = new JComboBox();

        cb.addItem("Circle");
        cb.addItem("Oval");
        cb.addItem("Rectangle");
        cb.addItem("Square");
        add(cb);
    }
}

public class Prg_2_7_1{
    public static void main(String[] args){
        JFrame f = new JFrame();
        JTabbedPane tp = new JTabbedPane();

        tp.addTab("Colors", new Pnl1());
        tp.addTab("Flavours", new Pnl2());
        tp.addTab("Shapes", new Pnl3());
        f.add(tp);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
};