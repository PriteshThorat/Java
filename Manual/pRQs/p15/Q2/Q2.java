import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 extends JFrame implements ActionListener {

    private JPanel panel;
    
    public Q2() {
        setTitle("Color Menu Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creating the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Colors");

        // Creating menu items
        JMenuItem redItem = new JMenuItem("Red");
        JMenuItem greenItem = new JMenuItem("Green");
        JMenuItem blueItem = new JMenuItem("Blue");
        JMenuItem blackItem = new JMenuItem("Black");

        // Adding action listeners
        redItem.addActionListener(this);
        greenItem.addActionListener(this);
        blueItem.addActionListener(this);
        blackItem.addActionListener(this);

        // Disabling the black color menu item
        blackItem.setEnabled(false);

        // Adding menu items to the menu
        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);
        colorMenu.add(blackItem);

        // Adding menu to menu bar
        menuBar.add(colorMenu);

        // Setting menu bar
        setJMenuBar(menuBar);

        // Creating a panel to change background color
        panel = new JPanel();
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Red":
                panel.setBackground(Color.RED);
                break;
            case "Green":
                panel.setBackground(Color.GREEN);
                break;
            case "Blue":
                panel.setBackground(Color.BLUE);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q2().setVisible(true));
    }
}
