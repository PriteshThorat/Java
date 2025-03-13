import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_9_1"
    width="500"
    height="500" >
</applet>
*/

public  class Prg_1_9_1 extends Applet{
    public void paint(Graphics g){
        Color c1 = new Color(100, 100, 255);
        Color c2 = new Color(150, 200, 100);
        Color c3 = new Color(120, 120, 20);

        g.setColor(c1);
        g.fillRect(20, 20, 110, 220);
        g.setColor(c2);
        g.fillOval(150, 150, 100, 160);
        g.setColor(Color.red);
        g.drawLine(75, 30, 200, 250);
        g.setColor(c3);
        g.fillRoundRect(190, 10, 160, 150, 15, 15);
    }
};