import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet
    code="Prg_3_7_7"
    width="300"
    height="300" >
</applet>
*/

public class Prg_3_7_7 extends Applet{
    int x1 = 0, y1 = 0;
    static int flag = 1;

    public void init(){
        this.addMouseMotionListener(new Inner1());
        this.addMouseListener(new Inner2());
    }

    class Inner2 extends MouseAdapter{
        public void mouseClicked(MouseEvent me){
            if(flag == 1){
                x1 = me.getX();
                y1 = me.getY();
                flag = 2;
            }
        }
    };

    class Inner1 extends MouseMotionAdapter{
        public void mouseMoved(MouseEvent me){
            Graphics g = getGraphics();
            int x = me.getX();
            int y = me.getY();

            if(flag == 2){
                g.drawLine(x, y, x1, y1);
                x1 = x;
                y1 = y;
            }
        }
    };
};