// Write  program to create a menu bar with various menu items and sub menu items.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q19 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar Example");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem openFile = new JMenuItem("Open");
        JMenuItem saveFile = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        newFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "New File Created");
            }
        });
        openFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "File Opened");
            }
        });
        saveFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "File Saved");
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.addSeparator(); 
        fileMenu.add(exit);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Cut operation");
            }
        });
        copy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Copy operation");
            }
        });
        paste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Paste operation");
            }
        });

        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.add(paste);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");

        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "This is a basic menu bar example.");
            }
        });

        JMenu settingsMenu = new JMenu("Settings");
        JCheckBoxMenuItem darkMode = new JCheckBoxMenuItem("Dark Mode");
        JCheckBoxMenuItem notifications = new JCheckBoxMenuItem("Enable Notifications");

        darkMode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (darkMode.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Dark Mode Enabled");
                } else {
                    JOptionPane.showMessageDialog(frame, "Dark Mode Disabled");
                }
            }
        });

        notifications.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (notifications.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Notifications Enabled");
                } else {
                    JOptionPane.showMessageDialog(frame, "Notifications Disabled");
                }
            }
        });

        settingsMenu.add(darkMode);
        settingsMenu.add(notifications);

        helpMenu.add(about);
        helpMenu.addSeparator(); 
        helpMenu.add(settingsMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
};