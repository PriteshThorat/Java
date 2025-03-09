import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_1"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_1 extends Applet{
    public void init(){
        Button bt1 = new Button();
        Button bt2 = new Button("Click Me");
        add(bt1);
        add(bt2);
    }
};