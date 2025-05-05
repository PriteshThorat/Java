import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Prg4_2 {
    public static void main(String[] args) {
        Frame f = new Frame("4.2 MenuBar, Menu, FileDialog");

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open File");
        FileDialog fd = new FileDialog(f, "Select a File", FileDialog.LOAD);
        
        openItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                fd.setVisible(true);
            }
        });

       menuBar.add(fileMenu);
       fileMenu.add(openItem);

       f.setMenuBar(menuBar);

       f.setVisible(true);
       f.setSize(500, 600);
    }
}