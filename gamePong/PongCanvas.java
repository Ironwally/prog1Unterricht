package gamePong;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.event.*;


public class PongCanvas extends Canvas implements KeyListener{ //KeyListener um Tastatur abzufangen

    private final int CANVAS_WIDTH = 600;
    private final int CANVAS_HEIGHT = 400;
    private Shape[] shapes;
    private Rectangle peddle;


    public PongCanvas() {
        JFrame frame = new JFrame("Pong");
        frame.setSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));
        frame.getContentPane().add(this);

        setupShapes();

        //animation
        Timer timer = new Timer(1000/60, new Timerstep()); //Framerate -> Pro Sekunde wie oft gezeichnet.
        timer.start();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(Color.MAGENTA);
        frame.setLocationRelativeTo(null);
        frame.addKeyListener(this.);
    }

    private class Timerstep() implements ActionListener {
       
        @Override
        public void actionPerformed(ActionEvent e) {
            for (Shape s : shapes) {
                s.move();
                
            }
            repaint();
        }
    }

    private void setupShapes() {
        paddle = new Rectangle(300.0,350,75,20);
        Circle ball = new Circle(100,50,10);
        ball.setVelocity(0.0,0.0);
        shapes = new Shape[] {paddle, ball};
    }

    @Override
    public void paint(Graphics g) {
        for (Shape s : shapes){
            s.draw(g);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //todo
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) paddle.setVelocity(-1.0,0);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) paddle.setVelocitx(0,0);
        
    }



}