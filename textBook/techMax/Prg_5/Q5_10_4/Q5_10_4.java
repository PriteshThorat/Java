import java.applet.*;
import java.awt.*;

/*
<applet
code="Q5_10_4"
width="200"
height="100" >
  <param
  name="acno"
  value="110" />
  <param
  name="balance"
  value="400" />
</applet>
*/

public class Q5_10_4 extends Applet{
  int ac, bal;

  public void init(){
    ac = Integer.parseInt(getParameter("acno"));
    bal = Integer.parseInt(getParameter("balance"));
  }
  public void paint(Graphics g){
    if(bal < 500){
      g.drawString("Low balance", 30, 50);
    }else{
      g.drawString("Sufficient balance", 30, 50);
    }
  }
};