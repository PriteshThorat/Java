import java.io.*;
import java.applet.Applet;
import java.awt.*;

/*
<applet
    code="MyApplet.class"
    width="300"
    height="300">
</applet>
*/

public class MyApplet extends Applet{
    public void init(){
        Button btn1 = new Button("Button 1");
        Checkbox chk1 = new Checkbox("Checkbox 1");
        Checkbox chk2 = new Checkbox("Checkbox 2");
        add(btn1);
        add(chk1);
        add(chk2);
    }
};