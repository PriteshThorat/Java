import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {

    public Q4() {
        setTitle("Input Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout()); // Use GridBagLayout for more control
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding

        // Label for Name
        JLabel nameLabel = new JLabel("Name");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST; // Align label to the left
        add(nameLabel, gbc);

        // Text field for Name
        JTextField nameTextField = new JTextField(20); // Set initial column width
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Make text field expand horizontally
        gbc.weightx = 1.0; // Give more horizontal space to the text field
        add(nameTextField, gbc);
        gbc.weightx = 0.0; // Reset weight

        // Label for Comments
        JLabel commentsLabel = new JLabel("Comments");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST; // Align label to the top-left
        add(commentsLabel, gbc);

        // Text area for Comments with scroll pane
        JTextArea commentsTextArea = new JTextArea(5, 20); // Initial rows and columns
        JScrollPane commentsScrollPane = new JScrollPane(commentsTextArea);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH; // Make text area expand both horizontally and vertically
        gbc.weighty = 1.0; // Give more vertical space to the text area
        add(commentsScrollPane, gbc);
        gbc.weighty = 0.0; // Reset weight

        // Submit Button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE; // Don't expand the button
        gbc.anchor = GridBagConstraints.EAST; // Align button to the right
        add(submitButton, gbc);

        pack(); // Adjusts the window size to fit the components
        setLocationRelativeTo(null); // Centers the window on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q4::new);
    }
}