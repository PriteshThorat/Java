import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepad extends JFrame implements ActionListener {

    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuItem openItem, saveItem, exitItem, themeToggleItem;
    boolean isDarkTheme = false;
    LineNumberPanel lineNumberPanel;

    public SimpleNotepad() {
        setTitle("Simple Notepad");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);

        // Line Number Panel setup
        lineNumberPanel = new LineNumberPanel(textArea);
        scrollPane.setRowHeaderView(lineNumberPanel);

        add(scrollPane);
        createMenuBar();

        // Update line numbers when text changes
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { lineNumberPanel.repaint(); }
            public void removeUpdate(DocumentEvent e) { lineNumberPanel.repaint(); }
            public void changedUpdate(DocumentEvent e) { lineNumberPanel.repaint(); }
        });

        // Update line numbers when scrolling
        scrollPane.getVerticalScrollBar().addAdjustmentListener(e -> lineNumberPanel.repaint());

        setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");

        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        themeToggleItem = new JMenuItem("Toggle Theme");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        themeToggleItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        viewMenu.add(themeToggleItem);

        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Open Text File");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            int option = fileChooser.showOpenDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (file.exists() && file.canRead()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        textArea.setText("");
                        String line;
                        while ((line = reader.readLine()) != null) {
                            textArea.append(line + "\n");
                        }
                        setTitle("Simple Notepad - " + file.getName());
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage(),
                                "File Open Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot read selected file.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save File As");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    bw.write(textArea.getText());
                    setTitle("Simple Notepad - " + file.getName());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file.",
                            "Save Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (e.getSource() == exitItem) {
            System.exit(0);
        }

        if (e.getSource() == themeToggleItem) {
            toggleTheme();
        }
    }

    private void toggleTheme() {
        if (isDarkTheme) {
            textArea.setBackground(Color.WHITE);
            textArea.setForeground(Color.BLACK);
            lineNumberPanel.setBackground(new Color(230, 230, 230));
            lineNumberPanel.setForeground(Color.BLACK);
        } else {
            textArea.setBackground(new Color(30, 30, 30));
            textArea.setForeground(Color.WHITE);
            lineNumberPanel.setBackground(new Color(45, 45, 45));
            lineNumberPanel.setForeground(Color.LIGHT_GRAY);
        }
        isDarkTheme = !isDarkTheme;
        lineNumberPanel.repaint();
    }

    // --- Line Number Panel Class ---
    class LineNumberPanel extends JPanel {
        JTextArea textArea;

        public LineNumberPanel(JTextArea textArea) {
            this.textArea = textArea;
            setPreferredSize(new Dimension(40, Integer.MAX_VALUE));
            setBackground(new Color(230, 230, 230));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            FontMetrics fontMetrics = textArea.getFontMetrics(textArea.getFont());
            int lineHeight = fontMetrics.getHeight();
            Rectangle drawHere = g.getClipBounds();

            int startOffset = textArea.viewToModel(new Point(0, drawHere.y));
            int endOffset = textArea.viewToModel(new Point(0, drawHere.y + drawHere.height));

            try {
                int startLine = textArea.getLineOfOffset(startOffset);
                int endLine = textArea.getLineOfOffset(endOffset);

                for (int i = startLine; i <= endLine + 1; i++) {
                    int y = (i + 1) * lineHeight - 4;
                    g.drawString(Integer.toString(i + 1), 5, y);
                }
            } catch (Exception e) {
                // Ignore
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleNotepad::new);
    }
};