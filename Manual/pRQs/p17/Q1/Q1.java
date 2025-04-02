import javax.swing.*;
import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("5x5 Grid Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a panel with GridLayout (5 rows, 5 columns)
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5)); // 5 rows, 5 columns

        // Add buttons to the panel
        for (int i = 1; i <= 25; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button); // Add each button to the grid
        }

        // Add the panel to the frame
        frame.add(panel);
        
        // Set the frame visibility
        frame.setVisible(true);
    }
}