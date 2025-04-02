import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 extends JFrame {

    private JRadioButton politicsRadio, sportsRadio, techRadio, entertainmentRadio;
    private JCheckBox breakingNewsCheck, dailyDigestCheck, emailAlertCheck;
    private JButton submitButton;

    public Q1() {
        setTitle("Radio Button & Checkbox Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));

        // Panel for Radio Buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setBorder(BorderFactory.createTitledBorder("Select News Category"));
        ButtonGroup categoryGroup = new ButtonGroup();
        
        politicsRadio = new JRadioButton("Politics");
        sportsRadio = new JRadioButton("Sports");
        techRadio = new JRadioButton("Technology");
        entertainmentRadio = new JRadioButton("Entertainment");
        
        categoryGroup.add(politicsRadio);
        categoryGroup.add(sportsRadio);
        categoryGroup.add(techRadio);
        categoryGroup.add(entertainmentRadio);
        
        radioPanel.add(politicsRadio);
        radioPanel.add(sportsRadio);
        radioPanel.add(techRadio);
        radioPanel.add(entertainmentRadio);

        // Panel for Checkboxes
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setBorder(BorderFactory.createTitledBorder("Select Additional Features"));
        
        breakingNewsCheck = new JCheckBox("Breaking News Alerts");
        dailyDigestCheck = new JCheckBox("Daily Digest");
        emailAlertCheck = new JCheckBox("Email Notifications");
        
        checkBoxPanel.add(breakingNewsCheck);
        checkBoxPanel.add(dailyDigestCheck);
        checkBoxPanel.add(emailAlertCheck);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySelection();
            }
        });

        // Add components to Frame
        add(radioPanel);
        add(checkBoxPanel);
        add(submitButton);
    }

    private void displaySelection() {
        String selectedCategory = "None";
        if (politicsRadio.isSelected()) selectedCategory = "Politics";
        else if (sportsRadio.isSelected()) selectedCategory = "Sports";
        else if (techRadio.isSelected()) selectedCategory = "Technology";
        else if (entertainmentRadio.isSelected()) selectedCategory = "Entertainment";

        StringBuilder selectedFeatures = new StringBuilder("Selected Features:\n");
        if (breakingNewsCheck.isSelected()) selectedFeatures.append("- Breaking News Alerts\n");
        if (dailyDigestCheck.isSelected()) selectedFeatures.append("- Daily Digest\n");
        if (emailAlertCheck.isSelected()) selectedFeatures.append("- Email Notifications\n");

        JOptionPane.showMessageDialog(this, "News Category: " + selectedCategory + "\n" + selectedFeatures);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q1().setVisible(true));
    }
}