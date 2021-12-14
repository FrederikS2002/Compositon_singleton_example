package obj;

import Main.ObjGroupParent;

public class Group extends ObjGroupParent {
    public Group(int x, int y, boolean visible) {
        super(x, y, visible);
    }

    @Override
    protected void objectList() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!(i == 1 && j == 1)){
                    addToArray(new Block(100*i, 100*j, 100, 100,"blue",true));
                }
            }
        }
        addToArray(new BlockString(100, 100, 100, 100,"green",true));
    }
}
