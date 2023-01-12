import java.awt.*;
import javax.swing.JFrame;

public class PongCanvas extends Canvas {

    private final int CANVAS_WIDTH = 600;
    private final int CANVAS_HEIGHT = 400;
    public PongCanvas() {
        JFrame frame = new JFrame("Pong");
        frame.setSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(Color.MAGENTA);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN); 
        g.fillRect(100,100,200,100);
    }
}