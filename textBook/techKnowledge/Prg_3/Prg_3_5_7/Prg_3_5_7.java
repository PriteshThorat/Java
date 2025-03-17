import java.awt.*;
import java.awt.event.*;

public class Prg_3_5_7 extends Frame implements TextListener{
    TextField tf1, tf2;

    public Prg_3_5_7(){
        setLayout(new FlowLayout());

        tf1 = new TextField(15);
        tf2 = new TextField(15);

        add(tf1);
        add(tf2);
        tf2.setEditable(false);
        tf1.addTextListener(this);
    }

    public void textValueChanged(TextEvent te){
        tf2.setText(tf1.getText());
    }

    public static void main(String[] args){
        Prg_3_5_7 fr = new Prg_3_5_7();

        fr.setTitle("Text Event");
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
};