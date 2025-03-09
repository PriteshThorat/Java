import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prg_2_7_8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Demonstrating Dialog");
        f.setSize(300, 150); // Set initial frame size
        f.setLocationRelativeTo(null); // Center the frame

        JPanel messagePane = new JPanel();
        messagePane.add(new JLabel("message"));
        f.getContentPane().add(messagePane, BorderLayout.CENTER);

        JPanel buttonPane = new JPanel();
        JButton button = new JButton("OK");

        // Correct way to handle button click
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose(); // Close the frame
            }
        });

        buttonPane.add(button);
        f.getContentPane().add(buttonPane, BorderLayout.SOUTH);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
};