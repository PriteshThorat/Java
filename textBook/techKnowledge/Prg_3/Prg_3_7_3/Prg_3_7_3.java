import java.awt.*;
import java.awt.event.*;

class Prg_3_7_3 extends Frame{
    TextField tf1, tf2;

    public Prg_3_7_3(){
        setLayout(new FlowLayout());

        tf1 = new TextField(15);
        tf2 = new TextField(15);
        Button btn1 = new Button("Square");
        Button btn2 = new Button("Cube");
        Button btn3 = new Button("Reset");

        add(tf1);
        add(btn1);
        add(btn2);
        add(btn3);
        add(tf2);
        btn1.addActionListener(new A());
        btn2.addActionListener(new B());
        btn3.addActionListener(new C());
    }

    class A implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int n = Integer.parseInt(tf1.getText());
            tf2.setText("" + (n * n));
        }
    };

    class B implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int n = Integer.parseInt(tf1.getText());
            tf2.setText("" + (n * n * n));
        }
    };

    class C implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            tf1.setText(null);
            tf2.setText(null);
        }
    };

    public static void main(String[] args){
        Prg_3_7_3 fr = new Prg_3_7_3();
        fr.setTitle("Demonstrating inner class");
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
};