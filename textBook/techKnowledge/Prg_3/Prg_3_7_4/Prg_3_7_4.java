import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

/*
<applet
    code="Prg_3_7_4"
    width="300"
    height="300" >
</applet>
*/

public class Prg_3_7_4 extends Applet implements ActionListener{
    int d = 0;

    public void paint(Graphics g){
        if(d == 1){
            g.setColor(Color.red);
        }
        if(d == 2){
            g.setColor(Color.green);
        }
        if(d == 3){
            g.setColor(Color.blue);
        }
        g.fillRect(100, 100, 180,120);
    }

    public void init(){
        Button btn1 = new Button("Red");
        Button btn2 = new Button("Green");
        Button btn3 = new Button("Blue");

        add(btn1);
        add(btn2);
        add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();

        if(s.equals("Red")){
            d = 1;
            repaint();
        }
        if(s.equals("Green")){
            d = 2;
            repaint();
        }
        if(s.equals("Blue")){
            d = 3;
            repaint();
        }
    }
};