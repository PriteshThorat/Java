import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q5 extends JFrame {
    
    private JList<String> newspaperList;
    private JButton submitButton;

    public Q5() {
        setTitle("Newspaper Selector");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // List of newspapers
        String[] newspapers = {
            "The New York Times", "The Washington Post", "The Guardian", 
            "The Times of India", "The Wall Street Journal", "The Hindu",
            "The Daily Telegraph", "The Sydney Morning Herald", "Los Angeles Times"
        };

        // JList to select multiple newspapers
        newspaperList = new JList<>(newspapers);
        newspaperList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        // Scroll pane to handle large lists
        JScrollPane scrollPane = new JScrollPane(newspaperList);
        
        // Submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySelectedNewspapers();
            }
        });

        // Layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);
    }

    private void displaySelectedNewspapers() {
        // Get selected values
        java.util.List<String> selectedNewspapers = newspaperList.getSelectedValuesList();

        // Show message dialog with selected newspapers
        if (selectedNewspapers.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No newspapers selected!", "Selection", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Selected Newspapers:\n" + String.join("\n", selectedNewspapers), "Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q5().setVisible(true));
    }
}