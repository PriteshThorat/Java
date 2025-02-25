import java.awt.*;
import java.applet.*;

/*
<applet 
  code="MyApplet.java"
  width="300"
  height="300"
  >
</applet>
*/

public class MyApplet extends Applet{
  public void init(){
    Button btn1 = new Button("Button 1");
    Checkbox cb1 = new Checkbox("Checkbox 1");
    Checkbox cb2 = new Checkbox("Checkbox 2");
    add(btn1);
    add(cb1);
    add(cb2);
  }
};