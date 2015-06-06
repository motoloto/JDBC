import java.awt.*;

public class FlowExample2 {
  private Frame f;
  private Button button1;
  private Button button2;
  private Button button3;

  public FlowExample2() {
    f = new Frame("Flow Layout");
    button1 = new Button("Ok");
    button2 = new Button("Open");
    button3 = new Button("Close");
  }

  public void launchFrame() {
    f.setLayout(new FlowLayout());
    //f.setLayout(new FlowLayout(FlowLayout.LEFT));
    //f.setLayout(new FlowLayout(FlowLayout.LEFT , 0 , 10));
    f.add(button1);
    f.add(button2);
    f.add(button3);
    f.setSize(500,200);
    f.setVisible(true);
  }

  public static void main(String args[]) {
    FlowExample2 guiWindow = new FlowExample2();
    guiWindow.launchFrame();
  }
}
