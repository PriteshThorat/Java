import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet
    code="Prg_3_7_2"
    width="300"
    height="300" >
</applet>
*/

public  class Prg_3_7_2 extends Applet implements ActionListener{
    Color c;

    public void init(){
        c = Color.black;

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

    public void paint(Graphics g){
        g.setColor(c);
        g.fillRect(100, 100, 180, 110);
    }

    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();
        if(s.equals("Red")){
            c = Color.red;
            repaint();
        }
        if(s.equals("Green")){
            c = Color.green;
            repaint();
        }
        if(s.equals("Blue")){
            c = Color.blue;
            repaint();
        }
    }
};