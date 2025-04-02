import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3 extends JFrame {
    
    private JButton okButton, resetButton, cancelButton;
    private JLabel messageLabel;

    public Q3() {
        setTitle("Button Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create Buttons
        okButton = new JButton("OK");
        resetButton = new JButton("RESET");
        cancelButton = new JButton("CANCEL");

        // Message Label
        messageLabel = new JLabel("Click a button!");

        // Adding components to frame
        add(okButton);
        add(resetButton);
        add(cancelButton);
        add(messageLabel);

        // Button Actions
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("OK Clicked!");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Click a button!");
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Closes the application
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3();
    }
}