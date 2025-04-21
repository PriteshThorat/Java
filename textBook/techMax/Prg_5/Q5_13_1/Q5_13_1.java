import java.applet.*;
import java.awt.*;

/*
<applet
  code="Q5_13_1"
  width=300
  height=200 >
</applet>
*/

public class Q5_13_1 extends Applet{
  public void init(){
    setBackground(Color.cyan);
    setForeground(Color.red);
  }
  public void paint(Graphics g){
    g.drawLine(100, 100, 100, 200);
    g.drawLine(100, 100, 200, 100);
    g.drawLine(0, 0, 100, 100);
  }
};