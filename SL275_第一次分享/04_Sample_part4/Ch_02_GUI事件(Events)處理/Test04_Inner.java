import java.awt.*;
import java.awt.event.*;

public class Test04_Inner {
  
  
  private Frame f;
  private TextField tf;

  public Test04_Inner() {
    f = new Frame("Inner classes example");
    tf = new TextField(30);
  }

  public void launchFrame() {
    Label label = new Label("Click and drag the mouse");
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    f.addMouseMotionListener(this.new MyMouseMotionListener());
    f.addMouseListener(new MouseClickHandler());
    f.setSize(300, 200);
    f.setVisible(true);
  }
  
  //Inner 內部類別
  class MyMouseMotionListener extends MouseMotionAdapter {
      public void mouseDragged(MouseEvent e) {
        String s = "Mouse dragging:  X = "+ e.getX()
                    + " Y = " + e.getY();
        tf.setText(s);
      }
  }

  public static void main(String args[]) {
    Test04_Inner obj = new Test04_Inner();
    obj.launchFrame();
  }
}
