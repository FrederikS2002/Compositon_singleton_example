package singleton_example.obj;
;

import singleton_example.MyJFrame;
import singleton_example.ObjParent;

import java.awt.*;

public class BlockString extends ObjParent {
    public BlockString(int x, int y, int width, int height, String color, boolean visible) {
        super(x, y, width, height, color, visible);
    }

    @Override
    protected Graphics2D getModel(Graphics2D g2d) {
        String vari = MyJFrame.getInstance().getTitle();
        g2d.drawString(vari, width / 2 - g2d.getFontMetrics().stringWidth(vari) / 2, height / 2);
        g2d.drawRect(0,0,width, height);
        return g2d;
    }
}
