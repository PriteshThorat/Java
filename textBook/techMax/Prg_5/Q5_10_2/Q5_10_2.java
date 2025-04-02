import java.applet.*;
import java.awt.*;

/*
<applet
code="Q5_10_2"
width="200"
height="100" >
  <param
  name="str1"
  value="Hi " />
  <param
  name="str2"
  value="Kunal" />
</applet>
*/

public class Q5_10_2 extends Applet{
  String s1, s2, msg;

  public void init(){
    s1 = getParameter("str1");
    s2 = getParameter("str2");
  }
  public void paint(Graphics g){
    msg = s1 + s2;
    showStatus(msg);
  }
};