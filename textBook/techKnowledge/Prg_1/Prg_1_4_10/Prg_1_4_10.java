import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_10"
    width="500"
    height="500" >
</applet>
*/

class MyPanel extends Panel{
    public MyPanel(){
        Label lb1 = new Label("This is from Panel");
        Button bt1 = new Button("Panel");

        add(lb1);
        add(bt1);
    }
};

public class Prg_1_4_10 extends Applet{
    public void init(){
        MyPanel p1 = new MyPanel();
        Checkbox ch1 = new Checkbox("From Applet");

        add(p1);
        add(ch1);

        MyFrame f1 = new MyFrame();

        f1.setTitle("Frame Showing Panel");
        f1.setSize(400, 300);
        f1.setVisible(true);
    }
};

class MyFrame extends Frame{
    public MyFrame(){
        setLayout(null);

        MyPanel p2 = new MyPanel();
        Checkbox ch1 = new Checkbox("From Frame");

        add(p2);
        add(ch1);
        p2.setBounds(50, 50, 200, 50);
        ch1.setBounds(200, 200, 100, 20);
    }
};