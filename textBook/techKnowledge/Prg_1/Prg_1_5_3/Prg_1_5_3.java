import java.awt.*;
import java.applet.*;

/*
<applet
    code="Prg_1_5_3"
    width="500"
    height="500" >
</applet>
*/

public class Prg_1_5_3 extends Applet{
    public void init(){
        setFont(new Font("SansSerif", Font.BOLD, 24));

        GridLayout gl = new GridLayout(4, 3);

        setLayout(gl);
        for(int i = 1; i <= 9; i++){
            add(new Button("" + i));
        }

        Button bt1 = new Button("*");
        Button bt2 = new Button("0");
        Button bt3 = new Button("#");

        add(bt1);
        add(bt2);
        add(bt3);
    }
};