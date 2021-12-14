 

import javax.swing.*;

public class MyJFrame extends JFrame {
    String title;
    private static MyJFrame instance;

    public static MyJFrame getInstance(){
        if(instance == null) instance = new MyJFrame("Test");
        return instance;
    }

    public MyJFrame(String title) {
        instance = this;
        this.title = title;
        MyJPanel instance = MyJPanel.getInstance();
        this.add(instance);
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public String getTitle() {
        return title;
    }
}
