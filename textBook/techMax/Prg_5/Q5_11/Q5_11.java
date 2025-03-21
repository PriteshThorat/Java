import java.awt.*;
import java.applet.*;

/*
<applet
code="Q5_11"
width=300
height=300 >
</applet>
*/

public class Q5_11 extends Applet{
  TextField t1;
  Button b1;

  public void init(){
    t1 = new TextField(20);
    b1 = new Button("Click");

    setBackground(Color.magenta);
    add(t1);
    add(b1);
  }
}