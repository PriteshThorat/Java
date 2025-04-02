import javax.swing.*;
import java.awt.*;

public class Q2 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Number Buttons (0-9)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel to hold buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 10)); // 1 row, 10 columns for buttons 0-9

        // Add buttons to the panel for numbers 0 to 9
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            panel.add(button); // Add each button to the panel
        }

        // Add the panel to the frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }
}