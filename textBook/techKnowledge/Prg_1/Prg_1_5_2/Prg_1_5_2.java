import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet
    code="Prg_1_5_2"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_5_2 extends Applet{
    public void init(){
        setLayout(new BorderLayout());

        Button bt1 = new Button("TOP HEADER-NORTH");

        add(bt1, BorderLayout.NORTH);
        add(new Button("BOTTOM FOOTER-SOUTH"), BorderLayout.SOUTH);

        Button bt3 = new Button("RIGHT-EAST");

        add(bt3, BorderLayout.EAST);
        add(new Button("LEFT-WEST"), BorderLayout.WEST);

        String s = "This program shows another\n" + " way of creating and\n" + "adding a components\n";
        add(new TextArea(s), BorderLayout.CENTER);
    }
};