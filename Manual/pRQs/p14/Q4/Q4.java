import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JFrame {
    
    private JList<String> cityList;
    private JLabel selectedCityLabel;
    
    public Q4() {
        setTitle("City List Example");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // List of cities
        String[] cities = {
            "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
            "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"
        };

        // Create JList and add it to JScrollPane
        cityList = new JList<>(cities);
        cityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(cityList);
        scrollPane.setPreferredSize(new Dimension(200, 100));

        // Label to display selected city
        selectedCityLabel = new JLabel("Selected City: None");

        // Add ListSelectionListener
        cityList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedCity = cityList.getSelectedValue();
                selectedCityLabel.setText("Selected City: " + selectedCity);
            }
        });

        // Adding components to the frame
        add(scrollPane);
        add(selectedCityLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q4();
    }
}