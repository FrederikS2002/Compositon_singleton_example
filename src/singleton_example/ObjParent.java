package singleton_example;

 

import java.awt.*;
import java.awt.geom.AffineTransform;

public abstract class ObjParent {
    protected Graphics2D g2d;
    private int x;
    private int y;
    protected int width;
    protected int height;
    private boolean visible;
    private String color;

    public ObjParent(int x, int y, int width, int height, String color, boolean visible) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.visible = visible;
        this.color = color;
    }
    public void draw(Graphics g){
        this.g2d = (Graphics2D) g;
        transform(g2d);
    }

    public Graphics2D transform(Graphics2D g2d){
        if(visible){
            AffineTransform old = g2d.getTransform();
            g2d.translate(this.x,this.y);
            g2d.setColor(getColor());
            getModel(g2d);
            g2d.setTransform(old);
        }
        return g2d;
    }

    protected abstract Graphics2D getModel(Graphics2D g2d);


    private Color getColor(){
        switch (color) {
            case "back":
                return Color.black;
            case "red":
                return Color.red;
            case "blue":
                return Color.blue;
            case "yellow":
                return Color.yellow;
            case "green":
                return Color.green;
            case "magenta":
                return Color.magenta;
            case "white":
                return Color.white;
            case "gray":
                return Color.gray;
            case "cyan":
                return Color.cyan;
            case "darkGray":
                return Color.darkGray;
            case "lightGray":
                return Color.lightGray;
            case "orange":
                return Color.orange;
            case "pink":
                return Color.pink;
            default:
                throw new IllegalArgumentException("color doesnt exist");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
