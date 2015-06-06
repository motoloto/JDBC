import java.applet.*;
import java.awt.*;
public class SimplePaint extends Applet{
     public void paint(Graphics g) {
           g.drawString("Hello World!", 100, 350);
           g.setColor(Color.blue);
           g.fillRect(0,0,300,300);
           g.setColor(Color.red);
           g.fillOval(50,50,200,200);
           showStatus("painting¡K.. ");
      }
}
