import java.io.*;
import java.net.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet
    code="Prg_8"
    height=100
    width=100 >
</applet>
*/

public class Prg_8 extends Applet implements ActionListener {
    TextField t;
    TextArea a;
    URL hp;
    Button b;

    public void init(){
        t = new TextField(40);
        a = new TextArea(10, 60);
        b = new Button("GO");
        add(t);
        add(b);
        add(a);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();

        if(s.equals("GO")){
            try{
                hp = new URL(t.getText());
                a.setText("Protocol: " + hp.getProtocol() + "\nPort: " + hp.getPort() + "\nHost: " + hp.getHost() + "\nFile: " + hp.getFile() + "\nExit: " + hp.toExternalForm());
            }catch(MalformedURLException e){}
        }
    }
};