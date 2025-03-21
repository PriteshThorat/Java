import java.applet.*;
import java.awt.*;

/*
<applet
code="Q5_10_1"
width="200"
height="100" >
  <param
  name="pname"
  value="Kunal" />
</applet>
*/

public class Q5_10_1 extends Applet{
  String name, msg;

  public void init(){
    name = getParameter("pname");
  }
  public void paint(Graphics g){
    msg = "Hello " + name;
    g.drawString(msg, 20, 30);
  }
};