import java.awt.event.*;
import java.awt.*;

public class Prg_3_7_1 extends Frame{
    TextField tf1, tf2;
    Button btn;

    public Prg_3_7_1(){
        setLayout(new FlowLayout());
        tf1 = new TextField(15);
        tf2 = new TextField(15);
        btn = new Button("Square");
        tf2.setEditable(false);
        add(tf1);
        add(btn);
        add(tf2);
        btn.addActionListener(new InnerForSquare());
        tf1.addMouseListener(new InnerForClear());
    }

    class InnerForSquare implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int a = Integer.parseInt(tf1.getText());
            tf2.setText("" + (a * a));
        }
    };

    class InnerForClear extends MouseAdapter{
        public void mouseEntered(MouseEvent me){
            tf1.setText(null);
            tf2.setText(null);
        }
    };

    public static void main(String[] args){
        Prg_3_7_1 fr = new Prg_3_7_1();
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
};