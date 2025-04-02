import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Q3 extends JFrame implements KeyListener {

    private JLabel messageLabel;

    public Q3() {
        setTitle("Key Press Detector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        messageLabel = new JLabel("Press any key");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 24));

        add(messageLabel);

        // Add KeyListener to the JFrame
        addKeyListener(this);

        // Make the JFrame focusable to receive key events
        setFocusable(true);
        requestFocusInWindow();

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used for detecting a general "key pressed" event
    }

    @Override
    public void keyPressed(KeyEvent e) {
        messageLabel.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // You can add code here if you want to detect when a key is released
        // For example, to reset the message:
        // messageLabel.setText("Press any key");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q3::new);
    }
}