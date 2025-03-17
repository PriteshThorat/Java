import java.awt.*;
import java.awt.event.*;

class Prg_3_7_5 extends Frame implements ActionListener{
    Button btn1;
    TextField tf1;

    public Prg_3_7_5(){
        setLayout(new FlowLayout());
        tf1 = new TextField(15);
        tf1.setEchoChar('#');
        add(tf1);

        btn1 = new Button("See Pass");
        add(btn1);
        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();
        if(s.equals("See Pass")){
            tf1.setEchoChar('\0');
            btn1.setLabel("Hide Pass");
        }else if(s.equals("Hide Pass")){
            tf1.setEchoChar('#');
            btn1.setLabel("See Pass");
        }
    }

    public static void main(String[] args){
        Prg_3_7_5 fr = new Prg_3_7_5();
        fr.setTitle("Demonstraring TextField Event");
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
};