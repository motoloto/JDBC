import java.awt.*;
import java.awt.event.*;

public class Test05_Anonymous {
  private Frame f;
  private TextField tf;

  public Test05_Anonymous() {
    f = new Frame("Anonymous classes example");
    tf = new TextField(30);
  }

  public void launchFrame() {
    Label label = new Label("Click and drag the mouse");
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    f.addMouseMotionListener( new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        String s = "Mouse dragging:  X = "+ e.getX()
                    + " Y = " + e.getY();
        tf.setText(s);
      }
    }); // 注意結束的大、小括弧
    f.addMouseListener(new MouseClickHandler());
    f.setSize(300, 200);
    f.setVisible(true);
  }

  public static void main(String args[]) {
    Test05_Anonymous obj = new Test05_Anonymous();
    obj.launchFrame();
  }
}
