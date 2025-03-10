import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_9"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_9 extends Applet{
    public void init(){
        TextArea ta1 = new TextArea("This is a multiline textbox\nWe can place new lines also.", 10, 65);

        add(ta1);
    }
};