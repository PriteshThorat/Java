// Write program to design any type of form using AWT components.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q20 extends Frame implements ActionListener {

    Label nameLabel, emailLabel, genderLabel, subscriptionLabel;
    TextField nameTextField, emailTextField;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    Choice subscriptionChoice;
    Button submitButton;

    public Q20() {
        setTitle("User Registration Form");

        setLayout(new FlowLayout());

        nameLabel = new Label("Name:");
        emailLabel = new Label("Email:");
        genderLabel = new Label("Gender:");
        subscriptionLabel = new Label("Subscription:");

        nameTextField = new TextField(20);
        emailTextField = new TextField(20);

        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        subscriptionChoice = new Choice();
        subscriptionChoice.add("Monthly");
        subscriptionChoice.add("Quarterly");
        subscriptionChoice.add("Annually");

        submitButton = new Button("Submit");

        submitButton.addActionListener(this);

        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(genderLabel);
        add(male);
        add(female);
        add(subscriptionLabel);
        add(subscriptionChoice);
        add(submitButton);

        setSize(350, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String gender = male.getState() ? "Male" : "Female";
        String subscription = subscriptionChoice.getSelectedItem();

        String message = "Name: " + name + "\nEmail: " + email + "\nGender: " + gender + "\nSubscription: " + subscription;
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new Q20();
    }
};