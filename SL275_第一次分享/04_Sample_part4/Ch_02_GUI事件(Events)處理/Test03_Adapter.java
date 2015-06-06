import java.awt.*;
import java.awt.event.*;

public class Test03_Adapter
     extends MouseMotionAdapter {
  
  private Frame f;
  private TextField tf;

  public Test03_Adapter() {
    f = new Frame("Two listeners example");
    tf = new TextField(30);
  }

  public void launchFrame() {
    Label label = new Label("Click and drag the mouse");
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    f.addMouseMotionListener(this);
    f.addMouseListener(new MouseClickHandler());
    f.setSize(300, 200);
    f.setVisible(true);
  }

  // 用到的 MouseMotionAdapter 介面方法
  public void mouseDragged(MouseEvent e) {
    String s =  "Mouse dragging:  X = " + e.getX()
                + " Y = " + e.getY();
    tf.setText(s);
  }


  public static void main(String args[]) {
    Test03_Adapter two = new Test03_Adapter();
    two.launchFrame();
  }
}
