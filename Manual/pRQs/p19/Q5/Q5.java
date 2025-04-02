import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.File;

public class Q5 extends JFrame {

    private JTree fileTree;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode rootNode;

    public Q5() {
        setTitle("File System Tree");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Get the root directories of the system
        File[] roots = File.listRoots();

        // Create the root node of the JTree
        rootNode = new DefaultMutableTreeNode("My Computer");
        treeModel = new DefaultTreeModel(rootNode);
        fileTree = new JTree(treeModel);

        // Add a scroll pane for better navigation
        JScrollPane scrollPane = new JScrollPane(fileTree);
        add(scrollPane);

        // Populate the tree with root directories
        for (File root : roots) {
            DefaultMutableTreeNode rootDirNode = new DefaultMutableTreeNode(root.getAbsolutePath());
            rootNode.add(rootDirNode);
            populateSubFolders(rootDirNode, root);
        }

        // Expand the root node initially
        // fileTree.expandRow(0); // Uncomment this to expand the "My Computer" node

        setVisible(true);
    }

    private void populateSubFolders(DefaultMutableTreeNode parentNode, File directory) {
        File[] subFiles = directory.listFiles();
        if (subFiles != null) {
            for (File file : subFiles) {
                if (file.isDirectory() && !file.isHidden()) {
                    DefaultMutableTreeNode subDirNode = new DefaultMutableTreeNode(file.getName());
                    parentNode.add(subDirNode);
                    // Recursively populate sub-folders (you might want to limit the depth)
                    // populateSubFolders(subDirNode, file);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q5::new);
    }
}