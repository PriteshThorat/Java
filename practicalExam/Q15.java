// Write program to implement action event in frame using swing components.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Demo");

        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");

        JLabel label = new JLabel("Hello, press the button!");

        frame.add(button);
        frame.add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
};