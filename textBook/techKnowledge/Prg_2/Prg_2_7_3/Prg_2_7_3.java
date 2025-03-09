import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Prg_2_7_3{
    public static void main(String[] args){
        JFrame f = new JFrame();

        f.setLayout(new BorderLayout());

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Options");
        
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        root.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        root.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);

        JTree tree = new JTree(root);
        JScrollPane sp = new JScrollPane(tree, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        f.add(sp, BorderLayout.CENTER);
        f.setSize(400, 200);
        f.setVisible(true);
    }
};