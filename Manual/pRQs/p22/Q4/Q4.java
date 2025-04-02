import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;

    public Q4() {
        setTitle("Addition of Two Numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField(10);

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(15);
        resultField.setEditable(false); // Make the result field read-only

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(addButton);
        add(resultLabel);
        add(resultField);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double sum = num1 + num2;
                resultField.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q4::new);
    }
}