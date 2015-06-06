import java.awt.*;
import java.awt.event.*;

public class Test06_Adapter
     extends MouseMotionAdapter {
  
  private Frame f;
  /*private*/ TextField tf;

  public Test06_Adapter() {
    f = new Frame("Two listeners example");
    f.addWindowListener(new WindowClosingHandler());
    tf = new TextField(30);
  }
  public void launchFrame() {
    Label label = new Label("Click and drag the mouse");
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    f.addMouseMotionListener(this);
    f.addMouseListener(new MouseClickHandler_06(this));
    f.setSize(300, 200);
    f.setVisible(true);
  }

  public void mouseDragged(MouseEvent e) {
    String s =  "Mouse dragging:  X = " + e.getX()
                + " Y = " + e.getY();
    tf.setText(s);
  }


  public static void main(String args[]) {
    Test06_Adapter two = new Test06_Adapter();
    two.launchFrame();
  }
}
