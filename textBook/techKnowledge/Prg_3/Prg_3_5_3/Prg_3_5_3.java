import java.awt.event.*;
import java.awt.*;

public class Prg_3_5_3 extends Frame implements ItemListener{
    List ls;
    Label lb;

    public Prg_3_5_3(){
        setLayout(new FlowLayout());

        ls = new List();
        lb = new Label("See selected item here");

        ls.add("India");
        ls.add("Australia");
        ls.add("England");
        ls.add("Bangladesh");
        ls.add("Sri Lanka");
        add(ls);
        add(lb);
        ls.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie){
        lb.setText(ls.getSelectedItem());
    }

    public static void main(String[] args){
        Prg_3_5_3 fr = new Prg_3_5_3();
        
        fr.setSize(300, 300);
        fr.setVisible(true);
        fr.setTitle("Demonstrating Item Listener");
    }
}