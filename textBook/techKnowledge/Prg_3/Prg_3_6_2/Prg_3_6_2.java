import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet
    code="Prg_3_6_2"
    width="300"
    height="300" >
</applet>
*/

public class Prg_3_6_2 extends Applet {
    Frame myFrame;

    public void init() {
        myFrame = new MyWindow("Window Event Example");
        myFrame.setSize(400, 300);
        myFrame.setVisible(true);
    }

    public void destroy() {
        myFrame.dispose(); // Close the frame when the applet is destroyed
    }
}

// Separate Frame Class to handle Window Events
class MyWindow extends Frame {
    MyWindow(String title) {
        super(title);
        addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent we) {
                System.out.println("Window is activated");
            }

            public void windowDeactivated(WindowEvent we) {
                System.out.println("Window is deactivated");
            }

            public void windowClosing(WindowEvent we) {
                System.out.println("Closing window...");
                dispose();
            }
        });

        setLayout(new FlowLayout());
    }
}