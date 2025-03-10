import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_8"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_8 extends Applet{
    public void init(){
        TextField tf1 = new TextField("This is TextField Demo");
        TextField tf2 = new TextField("Password");

        tf2.setEchoChar('*');
        add(tf1);
        add(tf2);
    }
};