import java.awt.*;
public abstract class Shape {

    
    protected double xPos, yPos;
    protected Color color;
    protected double xVel =0.0,yVel=0.0;

    Shape(double x, double y) {
        xPos = x;
        yPos = y;
        color = Color.black;
    }

    public void draw(Graphics g) {
        System.out.println("Draw not implemented in base class.");
    }
    public void setVelocity(double xv, double yv) {
        xVel = xv;
        yVel = yv;
    }

    public void move() {
        System.out.println("Move not implemented in base class.");
    }
}
