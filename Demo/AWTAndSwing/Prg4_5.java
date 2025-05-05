import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.tree.*;
import java.util.*;

public class Prg4_5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("4.5");

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode nodeA = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode nodeB = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode nodeC = new DefaultMutableTreeNode("C");

        nodeA.add(new DefaultMutableTreeNode("A1"));
        nodeA.add(new DefaultMutableTreeNode("A2"));
        nodeB.add(new DefaultMutableTreeNode("B1"));
        nodeC.add(new DefaultMutableTreeNode("C1"));
        nodeC.add(new DefaultMutableTreeNode("C2"));

        root.add(nodeA);
        root.add(nodeB);
        root.add(nodeC);

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        panel4.add(tree);

        JButton btn = new JButton("Hover Here!");
        btn.setToolTipText("This is a JToolTip");
        panel3.add(btn);

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        panel1.add(progressBar);

        Object[] colName = {"EID", "EName", "ECity"};
        Object[][] data = {
            {101, "Pritesh Thorat", "Pune"},
            {102, "Vivek Thombare", "Pune"},
            {103, "Kunal Wakode", "Pune"}
        };
        JTable table = new JTable(data, colName);
        panel2.add(new JScrollPane(table));

        tabbedPane.add("Tab 1", panel1);
        tabbedPane.add("Tab 2", panel2);
        tabbedPane.add("Tab 3", panel3);
        tabbedPane.add("Tab 4", panel4);

        f.add(tabbedPane);

        f.setSize(400, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}