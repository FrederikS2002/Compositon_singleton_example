package obj;

import Main.ObjParent;

import java.awt.*;

public class Block extends ObjParent {
    public Block(int x, int y, int width, int height, String color, boolean visible) {
        super(x, y, width, height, color, visible);
    }

    @Override
    protected Graphics2D getModel(Graphics2D g2d) {
        g2d.drawString("#####", width / 2 - g2d.getFontMetrics().stringWidth("#####") / 2, height / 2);
        g2d.drawRect(0,0,width, height);
        return g2d;
    }
}
