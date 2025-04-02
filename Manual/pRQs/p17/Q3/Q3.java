import javax.swing.*;
import java.awt.*;

public class Q3 extends JFrame {

    public Q3() {
        setTitle("Button Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Left alignment with horizontal and vertical gaps

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);

        pack(); // Adjusts the window size to fit the components
        setLocationRelativeTo(null); // Centers the window on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to create and show the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(Q3::new);
    }
}