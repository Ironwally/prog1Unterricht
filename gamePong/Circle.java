package gamePong;
import java.awt.*;


public class Circle extends Shape{

    private int radius;

    public Circle(double x, double y, int r){
        super(x,y);
        radius = r;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval((int) xPos, (int) yPos, radius, radius);
    }

    @Override
    public void move() {
        xPos += xVel;
        yPos += yVel;

        if (yPos > 350) {
            yVel = -yVel;
        }
        if (xPos > 600 - 2*radius) {
            xVel = -xVel;
        }
    }
}