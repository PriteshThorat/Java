import java.awt.*;
import java.applet.*;

/*
<applet 
    code="Prg_1_10_1"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_10_1 extends Applet{
    public void paint(Graphics g){
        String list = "";
        String f[];

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        f = ge.getAvailableFontFamilyNames();
        for(int i = 0; i < f.length; i++){
            list = list + f[i] + " ";
            System.out.println();
        }
        g.drawString(list, 10, 15);
    }
};