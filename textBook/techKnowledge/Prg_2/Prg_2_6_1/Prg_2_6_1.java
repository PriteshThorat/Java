import javax.swing.*;
import java.awt.*;

/*
<applet
    code="Prg_2_6_1"
    height="200"
    width="300" >
</applet>
*/

public class Prg_2_6_1 extends JApplet{
    public void start(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ImageIcon ii = new ImageIcon("india.png");
        JButton jbt1 = new JButton("India", ii);
        ct.add(jbt1);
    }
};