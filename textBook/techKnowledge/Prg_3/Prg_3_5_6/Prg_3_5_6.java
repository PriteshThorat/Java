import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet
    code="Prg_3_5_6"
    width="300"
    height="300" >
</applet>
*/

public class Prg_3_5_6 extends Applet{
    public void init(){
        this.addMouseMotionListener(new Inner1());
    }

    class Inner1 extends MouseMotionAdapter{
        public void mouseMoved(MouseEvent me){
            int x = me.getX();
            int y = me.getY();
            showStatus(x + ", " + y);
        }
    };
};