import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet
    code="Prg_1_5_4"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_5_4 extends Applet implements ActionListener{
    Checkbox ch1, ch2, ch3, ch4;
    Panel pnl1;
    CardLayout cl;
    Button btn1, btn2;

    public void init(){
        btn1 = new Button("Colours");
        btn2 = new Button("Flavours");

        add(btn1);
        add(btn2);

        cl = new CardLayout();
        pnl1 = new Panel();

        pnl1.setLayout(cl);

        ch1 = new Checkbox("Blue");
        ch2 = new Checkbox("Red");
        ch3 = new Checkbox("Vanilla");
        ch4 = new Checkbox("Strawberry");

        Panel pnl2 = new Panel();

        pnl2.add(ch1);
        pnl2.add(ch2);

        Panel pnl3 = new Panel();
        pnl3.add(ch3);
        pnl3.add(ch4);

        pnl1.add(pnl2, "Colors");
        pnl1.add(pnl3, "Flavours");

        add(pnl1);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btn1){
            cl.show(pnl1, "Colors");
        }else{
            cl.show(pnl1, "Flavours");
        }
    }
};