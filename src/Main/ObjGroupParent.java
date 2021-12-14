package Main;

import java.awt.*;
import java.util.ArrayList;

public abstract class ObjGroupParent extends ObjParent{
    ArrayList<ObjParent> objParents = new ArrayList<ObjParent>();
    public ObjGroupParent(int x, int y, boolean visible) {
        super(x, y, 0, 0, "yellow", visible);

    }

    @Override
    protected Graphics2D getModel(Graphics2D g2d) {
        objectList();
        for(ObjParent objParent : objParents){
            g2d = objParent.transform(g2d);
        }
        return g2d;
    }
    protected abstract void objectList();

    protected void addToArray(ObjParent obj){
        objParents.add((obj));
    }
}
