import java.awt.*;

public class DrawOvalTest extends Canvas
{
	int[] x, y;
	
	public static void main(String argv[])
	{
		DrawOvalTest d = new DrawOvalTest();
		Frame f = new Frame("DrawOvalTest");
		f.add(d, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	
	public DrawOvalTest()
	{
		setSize(250,150);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Circle", 20, 20);
		g.drawOval(10,30,50,50);
		g.drawString("Oval-shape", 80, 20);
		g.drawOval(70,30,100,50);
		g.drawString("drawArc", 200, 20);
		g.drawArc(190,30,50,50,0,90);
		g.fillOval(10,90,50,50);
		g.fillOval(70,90,100,50);
		g.fillArc(190,90,50,50,0,90);
	}
}