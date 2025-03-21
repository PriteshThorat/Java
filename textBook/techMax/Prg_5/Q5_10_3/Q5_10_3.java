import java.applet.*;
import java.awt.*;

/*
<applet
code="Q5_10_3"
width="200"
height="100" >
  <param
  name="usernm"
  value="Kunal" />
</applet>
*/

public class Q5_10_3 extends Applet{
  String user;

  public void init(){
    user = getParameter("usernm");
  }
  public void paint(Graphics g){
    int noc = user.length();
    g.drawString("Number of characters are: " + noc, 20, 30);
  }
};