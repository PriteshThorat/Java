import java.applet.*;
import java.awt.*;

/*
<applet
code="Q5_9_1"
width="200"
height="100" >
  <param
  name="pid"
  value="111" />
  <param
  name="pname"
  value="Kunal" />
</applet>
*/

public class Q5_9_1 extends Applet{
  int id;
  String name, msg;

  public void init(){
    id = Integer.parseInt(getParameter("pid"));
    name = getParameter("pname");
  }
  public void paint(Graphics g){
    msg = id + " " + name;
    g.drawString(msg, 20, 30);
  }
};