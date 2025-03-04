import javax.swing.*;
import java.awt.*;

/*
<applet
    code="Prg_2_5_2"
    width="400"
    height="400" >
</applet>
*/

public class Prg_2_5_2 extends JApplet{
    public void start(){
        Container ct = getContentPane();
        JLabel jl = new JLabel("Demonstrating swing components in JApplet");
        ct.add(jl);
    }
};