// Write program using swing to display a JComboBox in a JFrame

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");

        JLabel label = new JLabel("Select your favorite language:");

        String[] languages = { "Java", "Python", "C++", "JavaScript", "Kotlin" };
        JComboBox<String> comboBox = new JComboBox<>(languages);

        JLabel resultLabel = new JLabel("You selected: ");

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                resultLabel.setText("You selected: " + selected);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(comboBox);
        panel.add(resultLabel);

        frame.add(panel);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
};