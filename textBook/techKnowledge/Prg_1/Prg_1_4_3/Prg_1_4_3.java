import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_3"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_3 extends Applet{
    public void init(){
        Checkbox chb1 = new Checkbox("Pizza");
        Checkbox chb2 = new Checkbox("Hot-Dog");
        Checkbox chb3 = new Checkbox("Burger", true);
        Checkbox chb4 = new Checkbox("Pastry");

        add(chb1);
        add(chb2);
        add(chb3);
        add(chb4);
    }
};