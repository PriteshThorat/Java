import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr14 extends JFrame implements ActionListener {
    JRadioButton male, female;
    JCheckBox reading, traveling, coding;
    JButton submit;
    JLabel result;

    public Pr14() {
        setTitle("Radio Button & Checkbox Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Radio Buttons for Gender
        JLabel genderLabel = new JLabel("Select Gender:");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Checkboxes for Hobbies
        JLabel hobbyLabel = new JLabel("Select Hobbies:");
        reading = new JCheckBox("Reading");
        traveling = new JCheckBox("Traveling");
        coding = new JCheckBox("Coding");

        // Submit Button
        submit = new JButton("Submit");
        submit.addActionListener(this);

        // Result Label
        result = new JLabel("");

        // Add components to frame
        add(genderLabel); add(male); add(female);
        add(hobbyLabel); add(reading); add(traveling); add(coding);
        add(submit); add(result);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "None";
        StringBuilder hobbies = new StringBuilder();

        if (reading.isSelected()) hobbies.append("Reading ");
        if (traveling.isSelected()) hobbies.append("Traveling ");
        if (coding.isSelected()) hobbies.append("Coding ");

        result.setText("Gender: " + gender + " | Hobbies: " + (hobbies.length() > 0 ? hobbies : "None"));
    }

    public static void main(String[] args) {
        new Pr14();
    }
}