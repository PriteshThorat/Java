import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Q6 extends JFrame {

    public Q6() {
        setTitle("Student Data Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);

        // Column names for the table
        String[] columnNames = {"Name of Student", "Percentage", "Grade"};

        // Sample data for 10 students (you can replace this with actual data)
        Object[][] studentData = {
                {"Alice Smith", 85.5, "A"},
                {"Bob Johnson", 78.0, "B"},
                {"Charlie Brown", 92.3, "A+"},
                {"David Lee", 65.8, "C"},
                {"Eve Wilson", 88.9, "A"},
                {"Frank Miller", 71.2, "B-"},
                {"Grace Davis", 95.1, "A++"},
                {"Henry Garcia", 60.0, "D"},
                {"Ivy Rodriguez", 82.7, "B+"},
                {"Jack Williams", 76.5, "B"}
        };

        // Create the DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(studentData, columnNames);

        // Create the JTable using the model
        JTable studentTable = new JTable(model);

        // Add the table to a JScrollPane to make it scrollable if needed
        JScrollPane scrollPane = new JScrollPane(studentTable);

        // Add the scroll pane to the frame's content pane
        getContentPane().add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q6::new);
    }
};