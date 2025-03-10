import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_7"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_7 extends Applet{
    public void init(){
        Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 50);
        Scrollbar sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 50);

        add(sb1);
        add(sb2);
    }
}