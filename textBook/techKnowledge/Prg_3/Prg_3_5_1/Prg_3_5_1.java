import java.awt.event.*;
import java.awt.*;

public class Prg_3_5_1 extends Frame implements ActionListener{
    TextField tf1, tf2;
    Button btn1;

    public  Prg_3_5_1(){
        setLayout(new FlowLayout());

        tf1 = new TextField(15);
        tf2 = new TextField(15);
        btn1 = new Button("Copy");

        tf2.setEditable(false);
        add(tf1);
        add(btn1);
        add(tf2);
        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String s = tf1.getText();
        tf2.setText(s);
    }

    public static void main(String[] args){
        Prg_3_5_1 fr = new Prg_3_5_1();
        fr.setSize(300, 300);
        fr.setTitle("Demonstrating Action Listener");
        fr.setVisible(true);
    }
};