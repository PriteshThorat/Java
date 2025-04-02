import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 extends JFrame implements ActionListener {

    private JComboBox<String> locationComboBox;
    private JLabel currentCityLabel;
    private String currentCity = "Pune"; // Initial current city

    public Q4() {
        setTitle("Location Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        String[] locations = {"Mumbai", "Solapur", "Pune", "Banglore", "Mumbai"};
        locationComboBox = new JComboBox<>(locations);
        locationComboBox.setSelectedItem("Mumbai"); // Set initial selection as in the image
        locationComboBox.addActionListener(this);

        currentCityLabel = new JLabel("You are in " + currentCity);

        add(locationComboBox);
        add(currentCityLabel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == locationComboBox) {
            String selectedLocation = (String) locationComboBox.getSelectedItem();
            currentCityLabel.setText("You are in " + selectedLocation);
            // You can add further logic here based on the selected location
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q4::new);
    }
}