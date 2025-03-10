import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_5_1"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_5_1 extends Applet{
    public void init(){
        FlowLayout fl = new FlowLayout();

        setLayout(fl);

        Label l1 = new Label("Enter User ID:");
        Checkbox ch1 = new Checkbox("Pizza");
        TextField tf1 = new TextField("This is textbox");
        Label l2 = new Label("Enter Password:");

        add(l1);
        add(ch1);
        add(tf1);
        add(l2);
    }
};