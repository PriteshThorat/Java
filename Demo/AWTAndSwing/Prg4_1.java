import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Prg4_1 {
    public static void main(String[] args) {
        Frame f = new Frame("4.1");
        Panel p = new Panel();

        Label l = new Label("This is an Label");
        Button btn = new Button("This is an Button");
        Checkbox c = new Checkbox("This is a Checkbox");

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Option 1", false, cg);
        Checkbox cb2 = new Checkbox("Option 2", false, cg);
        Checkbox cb3 = new Checkbox("Option 3", false, cg);

        TextField tf = new TextField("This is an TextField");
        TextArea ta = new TextArea("This is an TextArea");

        ta.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                System.out.println("Your Typing: " + e.getKeyChar());
            }
            public void keyPressed(KeyEvent e){
                System.out.println("You Pressed: " + e.getKeyChar() + " key");
            }
            public void keyReleased(KeyEvent e){
                System.out.println("You Released: " + e.getKeyChar() + " key");
            }
        });

        tf.addTextListener(new TextListener(){
            @Override
            public void textValueChanged(TextEvent e){
                System.out.println("You Changed the Text");
            }
        });

        btn.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e){
                System.out.println("You Dragged somthing");
            }
            public void mouseMoved(MouseEvent e){
                System.out.println("You Moved the Mouse");
            }
        });

        btn.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("You Clicked on Button using Mouse");
            }
            public void mousePressed(MouseEvent e){
                System.out.println("You Pressed on Button using Mouse");
            }
            public void mouseReleased(MouseEvent e){
                System.out.println("You Released Mouse from Button");
            }
            public void mouseEntered(MouseEvent e){
                System.out.println("You Entered on Button using Mouse");
            }
            public void mouseExited(MouseEvent e){
                System.out.println("You Exited on Button using Mouse");
            }
        });

        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("You clicked on Button");
            }
        });

        c.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                System.out.println("You clicked on Checkbox");
            }
        });

        cb1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                System.out.println("You clicked on Option 1");
            }
        });

        cb2.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                System.out.println("You clicked on Option 2");
            }
        });

        cb3.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                System.out.println("You clicked on Option 3");
            }
        });
        

        f.setLayout(new FlowLayout());

        p.add(tf);
        p.add(ta);

        f.add(p);
        f.add(l);
        f.add(btn);
        f.add(c);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);

        f.setVisible(true);
        f.setSize(400, 300);
    }
};