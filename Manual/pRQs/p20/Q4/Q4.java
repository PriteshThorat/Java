import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Q4 extends JFrame implements MouseMotionListener {

    private JPanel drawPanel;
    private JLabel positionLabel;
    private int lastX, lastY;
    private Color drawColor = Color.BLUE;
    private Graphics graphics;

    public Q4() {
        setTitle("Mouse Motion Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        drawPanel = new JPanel();
        drawPanel.setBackground(Color.WHITE);
        drawPanel.addMouseMotionListener(this);
        add(drawPanel, BorderLayout.CENTER);

        positionLabel = new JLabel("Mouse Position: ( , )");
        add(positionLabel, BorderLayout.SOUTH);

        setVisible(true);

        // Get the Graphics object for drawing on the panel after it's visible
        graphics = drawPanel.getGraphics();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int currentX = e.getX();
        int currentY = e.getY();

        // Draw a line from the last position to the current position
        graphics.setColor(drawColor);
        graphics.drawLine(lastX, lastY, currentX, currentY);

        // Update the last position
        lastX = currentX;
        lastY = currentY;

        // Update the position label
        positionLabel.setText("Mouse Dragged at: (" + currentX + ", " + currentY + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int currentX = e.getX();
        int currentY = e.getY();

        // Update the position label
        positionLabel.setText("Mouse Moved at: (" + currentX + ", " + currentY + ")");

        // Optionally, you could update the lastX and lastY here if you want
        // to start a new drag line from the current moved position.
        // lastX = currentX;
        // lastY = currentY;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q4::new);
    }
}