import java.awt.*;

public class Prg_1_6_1 extends Frame{
    public Prg_1_6_1(){
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Format");
        Menu m4 = new Menu("Open");
        MenuItem mi1 = new MenuItem("New");
        MenuItem mi2 = new MenuItem("Save");
        MenuItem mi3 = new MenuItem("Save As");
        MenuItem mi4 = new MenuItem("Cut");
        MenuItem mi5 = new MenuItem("Copy");
        MenuItem mi6 = new MenuItem("Paste");
        MenuItem mi7 = new MenuItem("Font");
        MenuItem mi8 = new MenuItem("File 1");
        MenuItem mi9 = new MenuItem("File 2");
        CheckboxMenuItem cmi1 = new CheckboxMenuItem("Word Wrap", true);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        m2.add(mi5);
        m2.add(m4);
        m2.add(mi6);
        m2.add(mi7);
        m3.add(cmi1);
        m4.add(mi8);
        m4.add(mi9);
        setMenuBar(mb);
    }

    public static void main(String[] args){
        Prg_1_6_1 m = new Prg_1_6_1();
        m.setTitle("Menu Demo");
        m.setSize(300, 300);
        m.setVisible(true);
    }
};