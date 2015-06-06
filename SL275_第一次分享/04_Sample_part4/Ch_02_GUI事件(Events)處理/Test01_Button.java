import java.awt.*;

public class Test01_Button {
  private Frame f;
  private Button b;

  public Test01_Button() {
    f = new Frame("Test");
    b = new Button("Press Me!");
    b.setActionCommand("ButtonPressed");
  }

  public void launchFrame() {
    b.addActionListener(new ButtonHandler());
    f.add(b,BorderLayout.CENTER);
    f.pack();
    f.setVisible(true);
  }

  public static void main(String args[]) {
    Test01_Button guiApp = new Test01_Button();
    guiApp.launchFrame();
  }
}
