import java.awt.*;
import javax.swing.*;

public class Prg_2_7_2{
    public static void main(String[] args){
        JFrame f = new JFrame();

        String s = "This is text area\n" + "displayed in a scroll pane\n" + "appears with horizontal and\n" + "vertical scrollbar";

        JTextArea t = new JTextArea(s);
        JScrollPane sp = new JScrollPane(t, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        f.add(sp);
        f.setSize(300, 250);
        f.setVisible(true);
    }
};