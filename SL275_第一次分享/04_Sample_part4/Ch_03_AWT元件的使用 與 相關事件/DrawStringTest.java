import java.awt.*;

public class DrawStringTest extends Canvas
{
	public static void main(String argv[])
	{
		DrawStringTest d = new DrawStringTest();
		d.setBackground(Color.blue);
		d.setForeground(Color.red);

		Frame f = new Frame("DrawStringTest");
		f.add(d, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	
	public DrawStringTest()
	{
		setSize(200,100);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This is a drawString test.", 30, 50);
		g.drawLine(20,50,180,50);
	}
}