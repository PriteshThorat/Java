import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 extends JFrame {
    
    // Components
    private JTextField nameField, emailField;
    private JTextArea addressArea;
    private JButton submitButton;
    private JLabel resultLabel;

    public Q2() {
        setTitle("Form Example");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel addressLabel = new JLabel("Address:");

        // Text Fields
        nameField = new JTextField(20);
        emailField = new JTextField(20);

        // Text Area
        addressArea = new JTextArea(5, 20);
        addressArea.setLineWrap(true);
        addressArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(addressArea);

        // Submit Button
        submitButton = new JButton("Submit");

        // Result Label
        resultLabel = new JLabel("Form details will appear here.");

        // Adding components
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(addressLabel);
        add(scrollPane);
        add(submitButton);
        add(resultLabel);

        // Submit Button ActionListener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String address = addressArea.getText();

                // Display entered values
                resultLabel.setText("<html>Name: " + name + "<br>Email: " + email + "<br>Address: " + address + "</html>");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q2();
    }
}