import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {

    public Q4() {
        setTitle("Border Layout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set BorderLayout to the frame
        setLayout(new BorderLayout());

        // Creating buttons for different regions
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Set font for better appearance
        Font font = new Font("Courier", Font.BOLD, 20);
        northButton.setFont(font);
        southButton.setFont(font);
        eastButton.setFont(font);
        westButton.setFont(font);
        centerButton.setFont(font);

        // Adding buttons to frame with BorderLayout regions
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q4().setVisible(true));
    }
}