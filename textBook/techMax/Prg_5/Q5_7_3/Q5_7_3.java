import java.applet.*;
import java.awt.*;

/*
<applet
  code="Q5_7_3"
  width="300"
  height="50" >
</applet>
*/

public class Q5_7_3 extends Applet{
  public void init(){
    setBackground(Color.red);
    setForeground(Color.blue);
  }

  public void pain(Graphics g){
    g.drawString("Welcome to My Applet", 40, 25);
  }
};