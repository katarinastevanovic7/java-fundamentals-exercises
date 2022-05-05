package exercise05;

import javax.swing.*;
import java.awt.*;

/**
 * Simple 2D canvas with line and circle drawing methods
 *
 * @author Johannes C. Schneider
 */
public class DrawAllNumbers extends JPanel {

    //Implement your drawing inside the draw() method (which can call additional methods).
    //drawLine(...) and drawCircle(...) can be used to actually add something to the canvas.
    //With setColor(...), you can change the default color blue to another color.
    //The canvas has 20x20 virtual units (which are converted to pixels by multiplying with SCALING)
    //Note that (unlike coordinate systems in school), the TOP LEFT corner is (0,0), and x goes
    //to the right and y to the bottom.

    // drawLine(1,1,2,1); würde eine horizontale Linie vom Punkt (1/2) nach (2/1) zeichen

    void draw() {

        // DEN CODE HIER BEARBEITEN / ERWEITERN!

        int digit = -1;


        for (float x = 1.0f; x < 22; x++) {
            //int digit = 0;
            if (x % 2 == 0) {
            } else if (x % 2 == 1) {
                digit++;


                if (digit == 0 || digit == 2 || digit == 3 || digit == 5
                        || digit == 6 || digit == 7 || digit == 8 || digit == 9) {
                    drawLine(x, 1.0f, x + 1, 1.0f);
                }
                if (digit == 0 || digit == 4 || digit == 5 || digit == 6
                        || digit == 8 || digit == 9) {
                    drawLine(x, 1.0f, x, 2.0f);
                }
                if (digit == 0 || digit == 1 || digit == 2 || digit == 3
                        || digit == 4 || digit == 7 || digit == 8 || digit == 9) {
                    drawLine(x + 1, 1.0f, x + 1, 2.0f);
                }
                if (digit == 2 || digit == 3 || digit == 4 || digit == 5
                        || digit == 6 || digit == 8 || digit == 9) {
                    drawLine(x, 2.0f, x + 1, 2.0f);
                }
                if (digit == 0 || digit == 2 || digit == 6 || digit == 8) {
                    drawLine(x, 2.0f, x, 3.0f);
                }
                if (digit == 0 || digit == 1 || digit == 3 || digit == 4 || digit == 5
                        || digit == 6 || digit == 7 || digit == 8 || digit == 9) {
                    drawLine(x + 1, 2.0f, x + 1, 3.0f);
                }
                if (digit == 0 || digit == 2 || digit == 3 || digit == 5
                        || digit == 6 || digit == 8 || digit == 9) {
                    drawLine(x, 3.0f, x + 1, 3.0f);
                }
            }
        }
    }




    //DON'T CHANGE THE CODE BELOW THIS LINE

    //return an instance of this class
    private static JPanel getThisClassInstance() {
        return new DrawAllNumbers();
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

