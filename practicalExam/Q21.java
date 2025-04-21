// Write program to demonstrate the use of border layout. The layout shows four buttons at four sides with captions left, right, top and bottom using Swing Components.

import javax.swing.*;
import java.awt.*;

public class Q21 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");

        frame.setLayout(new BorderLayout());

        JButton topButton = new JButton("Top");
        JButton bottomButton = new JButton("Bottom");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        frame.add(topButton, BorderLayout.NORTH);   
        frame.add(bottomButton, BorderLayout.SOUTH); 
        frame.add(leftButton, BorderLayout.WEST);   
        frame.add(rightButton, BorderLayout.EAST);  

        JButton centerButton = new JButton("Center");
        frame.add(centerButton, BorderLayout.CENTER);  

        frame.setSize(400, 300);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
};