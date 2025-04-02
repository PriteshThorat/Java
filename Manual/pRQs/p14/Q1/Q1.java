import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 extends JFrame {
    
    // Components
    private JRadioButton maleButton, femaleButton, otherButton;
    private JCheckBox readingCheckBox, gamingCheckBox, travelingCheckBox;
    private JButton submitButton;
    private JLabel resultLabel;

    public Q1() {
        setTitle("Radio Button and Checkbox Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Radio Buttons
        JLabel genderLabel = new JLabel("Select Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        otherButton = new JRadioButton("Other");

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);

        // Checkboxes
        JLabel hobbyLabel = new JLabel("Select Hobbies:");
        readingCheckBox = new JCheckBox("Reading");
        gamingCheckBox = new JCheckBox("Gaming");
        travelingCheckBox = new JCheckBox("Traveling");

        // Submit Button
        submitButton = new JButton("Submit");

        // Result Label
        resultLabel = new JLabel("Selected options will appear here.");

        // Adding components to the frame
        add(genderLabel);
        add(maleButton);
        add(femaleButton);
        add(otherButton);

        add(hobbyLabel);
        add(readingCheckBox);
        add(gamingCheckBox);
        add(travelingCheckBox);

        add(submitButton);
        add(resultLabel);

        // Submit Button ActionListener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gender = "";
                if (maleButton.isSelected()) {
                    gender = "Male";
                } else if (femaleButton.isSelected()) {
                    gender = "Female";
                } else if (otherButton.isSelected()) {
                    gender = "Other";
                }

                StringBuilder hobbies = new StringBuilder();
                if (readingCheckBox.isSelected()) {
                    hobbies.append("Reading ");
                }
                if (gamingCheckBox.isSelected()) {
                    hobbies.append("Gaming ");
                }
                if (travelingCheckBox.isSelected()) {
                    hobbies.append("Traveling ");
                }

                // Display selected values
                resultLabel.setText("Gender: " + gender + " | Hobbies: " + hobbies.toString());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q1();
    }
}