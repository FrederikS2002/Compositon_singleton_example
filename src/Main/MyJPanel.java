package Main;

import Main.obj.Block;
import Main.obj.BlockString;
import Main.obj.BlockWindowSize;
import Main.obj.Group;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyJPanel extends JPanel {
    private static MyJPanel INSTANCE;
    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 600;
    private final Color backgroundColor = Color.white;
    private ArrayList<ObjParent> objects = new ArrayList<ObjParent>();

    public static final MyJPanel getInstance(){
        if(INSTANCE == null) INSTANCE = new MyJPanel();
        return INSTANCE;
    }

    public MyJPanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(backgroundColor);
        this.setFocusable(true);
        //objects.add(new BlockString(120, 20, 100, 100,"blue",true));
        objects.add((new Group(20, 20, true)));
        //objects.add(new BlockWindowSize(10,10,100,100, "green", true));
        //objects.add(new ObjGroupParent(20, 20, 100, 100,"green",true));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        for(ObjParent object : objects){
            object.draw(g);
        }
    }

}
