package exercise04;

import javax.swing.*;
import java.awt.*;

public class Siebensegmentanzeigen extends JPanel {

    //Implement your drawing inside the draw() method (which can call additional methods).
    //drawLine(...) and drawCircle(...) can be used to actually add something to the canvas.
    //With setColor(...), you can change the default color blue to another color.
    //The canvas has 20x20 virtual units (which are converted to pixels by multiplying with SCALING)
    //Note that (unlike coordinate systems in school), the TOP LEFT corner is (0,0), and x goes
    //to the right and y to the bottom.
    void draw() {

        drawLine(1, 2, 1, 3);
        drawLine(2, 2, 2, 3);
        drawLine(2, 1, 1, 1);
        drawLine(1, 1, 1, 2);
        drawLine(2, 2, 2, 1);
        drawLine(2, 2, 1, 2);
        drawLine(2, 3, 1, 3);


    }

    private static JPanel getThisClassInstance() {
        return new Siebensegmentanzeigen();
    }

    private Graphics2D g2d;

    private static final int SCALING = 40;

    private void drawCircle(float x, float y, float r) {
        g2d.drawOval(Math.round((x - r) * SCALING), Math.round((y - r) * SCALING),
                Math.round(2 * r * SCALING), Math.round(2 * r * SCALING));
    }

    private void drawLine(float xFrom, float yFrom, float xDest, float yDest) {
        g2d.drawLine(Math.round(xFrom * SCALING), Math.round(yFrom * SCALING),
                Math.round(xDest * SCALING), Math.round(yDest * SCALING));
    }

    private void setColor(Color color) {
        g2d.setColor(color);
    }

    @Override
    public void paint(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(2.0f));
        draw();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Area");
        frame.add(getThisClassInstance());
        frame.setSize(21 * SCALING, 22 * SCALING);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



















