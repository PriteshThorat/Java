import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_4"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_4 extends Applet{
    public void init(){
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox chb1 = new Checkbox("Pizza", false, cbg);
        Checkbox chb2 = new Checkbox("Hot-Dog", true, cbg);
        Checkbox chb3 = new Checkbox("Burger", false, cbg);
        Checkbox chb4 = new Checkbox("Pastry", false, cbg);

        add(chb1);
        add(chb2);
        add(chb3);
        add(chb4);
    }
};