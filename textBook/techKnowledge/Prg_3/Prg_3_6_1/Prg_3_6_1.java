import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet
    code="Prg_3_6_1"
    width="400"
    height="400" >
</applet>
*/

public class Prg_3_6_1 extends Applet{
    public void init(){
        addMouseListener(new UserMouseAdapter(this));
        addMouseMotionListener(new UserMouseMotionAdapter(this));
    }
};

class UserMouseAdapter extends MouseAdapter{
    Prg_3_6_1 adpt;

    public UserMouseAdapter(Prg_3_6_1 usradpt){
        adpt = usradpt;
    }

    public void mouseClicked(MouseEvent me){
        adpt.showStatus("Mouse is clicked");
    }
};

class UserMouseMotionAdapter extends MouseMotionAdapter{
    Prg_3_6_1 adpt;

    public UserMouseMotionAdapter(Prg_3_6_1 usradpt){
        adpt = usradpt;
    }

    public void mouseDragged(MouseEvent me){
        adpt.showStatus("Mouse is dragged");
    }
};