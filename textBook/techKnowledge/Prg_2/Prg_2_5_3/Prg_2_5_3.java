import java.awt.*;
import javax.swing.*;

/*
<applet
    code="Prg_2_5_3"
    width="300"
    height="300" >
</applet>
*/

public class Prg_2_5_3 extends JApplet{
    public void start(){
        Container ct = getContentPane();
        ImageIcon ii = new ImageIcon("india.png");
        JLabel jl = new JLabel("India", ii, JLabel.CENTER);
        ct.add(jl);
    }
}