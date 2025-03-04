import javax.swing.*;
import java.awt.*;

/*
<applet
    code="Prg_2_5_4"
    width="300"
    height="300" >
</applet/>
*/

public class Prg_2_5_4 extends JApplet{
    public void start(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        JTextField tf = new JTextField("You can type here", 15);
        ct.add(tf);
    }
}