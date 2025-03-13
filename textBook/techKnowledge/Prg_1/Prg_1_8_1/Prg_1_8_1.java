import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Prg_1_8_1 extends Frame implements ActionListener{
    FileDialog fd1;
    Button openPlease;
    Label labl;
    TextArea tal;

    public Prg_1_8_1(){
        fd1 = new FileDialog(this, "Select File to Open");
        openPlease = new Button("Open File");

        openPlease.setBackground(Color.pink);

        labl = new Label("Complete path of the selected file.");
        tal = new TextArea(40, 20);

        add(openPlease, "South");
        add(tal, "Center");
        add(labl, "North");
        openPlease.addActionListener(this);
        setTitle("FileDialog Practice");
        setSize(525, 325);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        fd1.setVisible(true);
        labl.setText("Directory: " + fd1.getDirectory());
        display(fd1.getDirectory() + fd1.getFile());
    }
    public void display(String fname){
        try{
            FileInputStream fis1 = new FileInputStream(fname);

            int fileSize = fis1.available();
            byte buf1[] = new byte[fileSize];
            fis1.read(buf1);
            String str1 = new String(buf1);
            tal.setText(str1);
        }catch(IOException e){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new Prg_1_8_1();
    }
};