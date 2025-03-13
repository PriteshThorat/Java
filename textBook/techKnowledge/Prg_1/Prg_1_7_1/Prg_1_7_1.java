import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet
    code="Prg_1_7_1"
    width="500"
    height="500" >
</applet>
*/

class DialogBox extends Dialog{
    public DialogBox(Frame fr, String st){
        super(fr, st, true);
        
        Label lb1 = new Label("This is in Dialog box");

        add(lb1);
        setSize(300, 200);
    }

    public void paint(Graphics g){
        g.drawString("This is in the dialog box", 10, 70);
    }
};

class OpenDialog extends Frame implements ActionListener{
    Frame f1;

    public OpenDialog(){
        setLayout(null);

        Button bt = new Button("Show Dialog");

        add(bt);
        bt.setBounds(50, 100, 90, 35);
        bt.addActionListener(this);
    }

    public void copy(Frame f){
        f1 = f;
    }
    public void actionPerformed(ActionEvent ae){
        DialogBox d = new DialogBox(f1, "Dialog box Title Here");

        d.setVisible(true);
    }
};

public class Prg_1_7_1 extends Applet{
    public void init(){
        OpenDialog d1 = new OpenDialog();

        d1.copy(d1);
        d1.setSize(400, 400);
        d1.setTitle("Frame showing Dialog box");
        d1.setVisible(true);
    }
};