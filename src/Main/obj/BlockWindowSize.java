package Main.obj;

import Main.MyJFrame;
import Main.MyJPanel;
import Main.ObjParent;

import java.awt.*;

public class BlockWindowSize extends ObjParent {
    public BlockWindowSize(int x, int y, int width, int height, String color, boolean visible) {
        super(x, y, width, height, color, visible);
    }

    @Override
    protected Graphics2D getModel(Graphics2D g2d) {
        String höheF = String.valueOf(MyJPanel.getInstance().SCREEN_HEIGHT);
        String breiteF = String.valueOf(MyJPanel.getInstance().SCREEN_WIDTH);
        g2d.drawString(höheF + "x"+breiteF, width / 2 - g2d.getFontMetrics().stringWidth(höheF + "x"+breiteF) / 2, height / 2);
        g2d.drawRect(0,0,width, height);
        return g2d;
    }
}
