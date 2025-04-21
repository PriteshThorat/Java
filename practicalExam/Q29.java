// Write program to handle text event on swing components.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Q29 extends JFrame implements DocumentListener {
    private JTextField textField;
    private JTextArea textArea;

    public Q29() {
        setTitle("Text Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);

        add(new JLabel("Enter Text:"));
        add(textField);
        add(new JScrollPane(textArea));

        textField.getDocument().addDocumentListener(this);

        setVisible(true);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        updateTextArea();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        updateTextArea();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        updateTextArea();
    }

    private void updateTextArea() {
        textArea.setText("Text changed: " + textField.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Q29();
        });
    }
};