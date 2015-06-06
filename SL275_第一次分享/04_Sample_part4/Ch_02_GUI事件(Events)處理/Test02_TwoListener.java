import java.awt.*;
import java.awt.event.*;

public class Test02_TwoListener
     implements MouseMotionListener, 
                MouseListener {
  private Frame f;
  private TextField tf;

  public Test02_TwoListener() {
    f = new Frame("Two listeners example");
    tf = new TextField(30);
  }

  public void launchFrame() {
    Label label = new Label("Click and drag the mouse");
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    f.addMouseMotionListener(this);
    f.addMouseListener(this);
    f.setSize(300, 200);
    f.setVisible(true);
  }

  // �Ψ쪺 MouseMotionListener ������k
  public void mouseDragged(MouseEvent e) {
    String s =  "Mouse dragging:  X = " + e.getX()
                + " Y = " + e.getY();
    tf.setText(s);
  }
  // �Ψ쪺 MouseListener ������k
  public void mouseEntered(MouseEvent e) {
    String s = "The mouse entered";
    tf.setText(s);
  }
  // �Ψ쪺 MouseListener ������k
  public void mouseExited(MouseEvent e) {
    String s = "The mouse has left the building";
    tf.setText(s);
  }
  // �S�Ψ쪺 MouseListener ������k
  public void mouseMoved(MouseEvent e) { }

  // �S�Ψ쪺 MouseListener ������k
  public void mousePressed(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  public void mouseReleased(MouseEvent e) { }

  public static void main(String args[]) {
    Test02_TwoListener two = new Test02_TwoListener();
    two.launchFrame();
  }
}
