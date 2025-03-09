import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prg_2_7_8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Demonstrating Dialog");
        f.setSize(300, 150);
        f.setLocationRelativeTo(null); 

        JPanel messagePane = new JPanel();
        messagePane.add(new JLabel("message"));
        f.getContentPane().add(messagePane, BorderLayout.CENTER);

        JPanel buttonPane = new JPanel();
        JButton button = new JButton("OK");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        buttonPane.add(button);
        f.getContentPane().add(buttonPane, BorderLayout.SOUTH);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
};