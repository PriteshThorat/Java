import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet
    code="Prg_3_5_8"
    width="300"
    height="300" >
</applet>
*/

public class Prg_3_5_8 extends Applet {
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
class MyWindow extends Frame implements WindowListener {
    String message = "See your event here";

    MyWindow(String title) {
        super(title);
        addWindowListener(this);
        setLayout(new FlowLayout());
    }

    public void paint(Graphics g) {
        g.drawString(message, 100, 100);
    }

    public void windowActivated(WindowEvent we) {
        message = "Window activated";
        repaint();
    }

    public void windowDeactivated(WindowEvent we) {
        message = "Window deactivated";
        repaint();
    }

    public void windowIconified(WindowEvent we) {
        message = "Window minimized";
        repaint();
    }

    public void windowDeiconified(WindowEvent we) {
        message = "Window restored";
        repaint();
    }

    public void windowClosed(WindowEvent we) {
        message = "Window closed";
        repaint();
    }

    public void windowClosing(WindowEvent we) {
        message = "Closing window...";
        repaint();
        dispose(); // Close the window
    }

    public void windowOpened(WindowEvent we) {
        message = "Window opened";
        repaint();
    }
}