// Write program to create  JTree and JTable.

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

public class Q13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree and JTable Demo");

        JPanel panel = new JPanel(new BorderLayout());

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Node 3");

        root.add(node1);
        root.add(node2);
        root.add(node3);

        JTree tree = new JTree(root);

        String[] columnNames = {"ID", "Name", "Age"};

        Object[][] data = {
            {1, "John Doe", 25},
            {2, "Jane Smith", 30},
            {3, "Alice Johnson", 28}
        };

        JTable table = new JTable(data, columnNames);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(tree), new JScrollPane(table));

        panel.add(splitPane, BorderLayout.CENTER);

        frame.add(panel);

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
};