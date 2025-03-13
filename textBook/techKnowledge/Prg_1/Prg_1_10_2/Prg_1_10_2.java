import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_10_2"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_10_2 extends Applet{
    public void init(){
        Font fl = new Font("Serif", Font.ITALIC, 25);
        
        setFont(fl);

        Label lb1 = new Label("This is Label 1");
        Label lb2 = new Label("This is Label 2");
        
        add(lb1);
        add(lb2);
    }
};