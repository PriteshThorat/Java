import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet
    code="Prg_3_5_4"
    width="300"
    height="300" >
</applet>
*/

public class Prg_3_5_4 extends Applet implements KeyListener{
    String st = " ";

    public void init(){
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke){
        showStatus("Key Pressed");
    }
    public void keyReleased(KeyEvent ke){
        showStatus("Key Released");
    }
    public void keyTyped(KeyEvent ke){
        st = "Key typed: " + ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(st, 20, 20);
    }
};