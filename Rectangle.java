import java.awt.*;


public class Rectangle extends Shape{
    
    private int width;
    private int height;
    
    public Rectangle (double x, double y, int w, int h) {
        super(x,y);
        width = w;
        height = h;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect((int) xPos,(int) yPos,width,height);
    }

    @Override
    public void move() {
        xPos += xVel;
        yPos += yVel;
    }
}
