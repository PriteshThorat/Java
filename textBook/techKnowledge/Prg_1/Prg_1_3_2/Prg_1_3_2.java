import java.awt.*;
import java.applet.Applet;

/*
<applet
  code="Prg_1_3_2"
  width="300"
  height="300" >
</applet>
*/

public class Prg_1_3_2 extends Applet{
  public void init(){
    Button btn1 = new Button("Submit");
    Checkbox ch1 = new Checkbox("Pizza");
    Checkbox ch2 = new Checkbox("Burger");
    add(btn1);
    add(ch1);
    add(ch2);
  }
};