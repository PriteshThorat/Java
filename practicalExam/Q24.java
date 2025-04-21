// Write program to handle key events and mouse events.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q24 extends JFrame implements KeyListener, MouseListener {

    JLabel keyLabel, mouseLabel;

    public Q24() {
        setTitle("Key and Mouse Events Demo");

        keyLabel = new JLabel("Press any key...");
        mouseLabel = new JLabel("Click anywhere...");

        setLayout(new FlowLayout());
        add(keyLabel);
        add(mouseLabel);

        addKeyListener(this);     
        addMouseListener(this);    

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setFocusable(true);
        requestFocusInWindow();
    }

    public void keyTyped(KeyEvent e) {
        keyLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        keyLabel.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        keyLabel.setText("Key Released: " + e.getKeyChar());
    }

    public void mouseClicked(MouseEvent e) {
        mouseLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        mouseLabel.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        mouseLabel.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        mouseLabel.setText("Mouse Entered the Frame");
    }

    public void mouseExited(MouseEvent e) {
        mouseLabel.setText("Mouse Exited the Frame");
    }

    public static void main(String[] args) {
        new Q24();
    }
};