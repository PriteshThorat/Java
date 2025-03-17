import java.awt.*;
import java.awt.event.*;

public class Prg_3_7_6 extends Frame{
    Button btn1, btn2, btn3;
    TextField tf1, tf2;

    public Prg_3_7_6(){
        setLayout(new FlowLayout());

        btn1 = new Button("Square");
        btn2 = new Button("Cube");
        btn3 = new Button("Sq Root");
        tf1 = new TextField(15);
        tf2 = new TextField(15);

        tf2.setEditable(false);
        add(tf1);
        add(btn1);
        add(btn2);
        add(btn3);
        add(tf2);
        btn1.addFocusListener(new InnerFocus());
        btn1.addActionListener(new InnerSquare());
        btn2.addFocusListener(new InnerFocus());
        btn2.addActionListener(new InnerCube());
        btn3.addFocusListener(new InnerFocus());
        btn3.addActionListener(new InnerSqRoot());
    }

    class InnerFocus implements FocusListener{
        public void focusGained(FocusEvent fe){
            Object ob = fe.getSource();

            if(ob == btn1){
                btn1.setBackground(Color.red);
                btn2.setBackground(Color.yellow);
                btn3.setBackground(Color.yellow);
            }
            if(ob == btn2){
                btn2.setBackground(Color.red);
                btn1.setBackground(Color.yellow);
                btn3.setBackground(Color.yellow);
            }
            if(ob == btn3){
                btn3.setBackground(Color.red);
                btn2.setBackground(Color.yellow);
                btn1.setBackground(Color.yellow);
            }
        }

        public void focusLost(FocusEvent fe){}
    };

    class InnerSquare implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int n = Integer.parseInt(tf1.getText());
            int s = n * n;
            tf2.setText("" + s);
        }
    };

    class InnerCube implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int n = Integer.parseInt(tf1.getText());
            int c = n * n * n;
            tf2.setText("" + c);
        }
    };

    class InnerSqRoot implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int n = Integer.parseInt(tf1.getText());
            double sq = Math.sqrt(n);
            tf2.setText("" + sq);
        }
    };

    public static void main(String[] args){
        Prg_3_7_6 fr = new Prg_3_7_6();
        fr.setSize(300, 300);
        fr.setVisible(true);
        fr.setTitle("Demonstating multiple events");
    }
};