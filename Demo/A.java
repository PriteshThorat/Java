import javax.swing.*;

public class A {
    public static void main(String[] args) {
        JFrame f = new JFrame("Demo");

        JButton btn = new JButton("Click Me");
        btn.setToolTipText("This button does something important");

        f.add(btn);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}