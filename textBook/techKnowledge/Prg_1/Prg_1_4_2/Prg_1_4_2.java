import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_4_2"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_4_2 extends Applet{
    public void init(){
        Label lb1 = new Label("This is Label");
        Label lb2 = new Label("Enter User ID: ");

        add(lb1);
        add(lb2);
    }
};