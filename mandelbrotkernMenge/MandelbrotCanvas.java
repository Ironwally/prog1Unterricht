package mandelbrotkernMenge;
import javax.swing.*;
import java.awt.*;


public class MandelbrotCanvas extends Canvas{

    private final int CANVAS_WIDTH = 900;
    private final int CANVAS_HEIGHT = 600;
    private static final int maxIterations = 100;

    public MandelbrotCanvas() {
    JFrame frame = new JFrame("Mandelbrot");
    frame.getContentPane().add(this);
    frame.setPreferredSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));
    frame.pack();
    frame.setVisible(true);
    }

    public Complex canvasPosToComplex(int x, int y) {
        double re = x / (CANVAS_WIDTH/3.0) - 2.0;
        double im = -y / (CANVAS_HEIGHT/3.0) + 1.0;
        return new Complex(re,im);
    }
    private boolean iterate(Complex c) {
        Complex z = new Complex(0.0,0.0);
        int it = 0; //iterations
        while(Complex.absoluteValue(z) <=2.0 && it <= maxIterations) {
            z = Complex.add(Complex.square(z),c);
            it++;

        }
        return Complex.absoluteValue(z) <= 2.0;
    }

    @Override
    public void paint(Graphics g) {
        for (int x=0;x<CANVAS_WIDTH;x++){
            for (int y=0;y<CANVAS_HEIGHT;y++){
                Complex c = canvasPosToComplex(x,y);
                Complex z = new Complex(0.0,0.0);
                
                if (iterate(c)) {
                    g.drawRect(x, y, 1, 1);
                }
            }
        }
    }
}
