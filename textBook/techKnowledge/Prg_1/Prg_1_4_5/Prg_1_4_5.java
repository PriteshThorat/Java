import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_5"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_5 extends Applet{
    public void init(){
        Choice ch1 = new Choice();
        Choice ch2 = new Choice();

        ch1.add("Pizza");
        ch1.add("Hot dog");
        ch1.add("Burger");
        ch1.add("Pastry");
        ch2.add("Breakfast");
        ch2.add("Lunch");
        ch2.add("Dinner");
        add(ch1);
        add(ch2);
    }
};