import java.awt.*;
import java.awt.event.*;

public class ScrollbarExample implements AdjustmentListener
{
	Frame f;
	Button btn;
	Panel p;
	Scrollbar HSB, VSB;
	int x=0, y=0;
	
	public static void main(String argv[])
	{
		new ScrollbarExample();
	}
	
	public ScrollbarExample()
	{
		f = new Frame("Scrollbar Example");
		p = new Panel(null);
		
		btn = new Button("Button");
		btn.setSize(50,20);
		btn.setLocation(x, y);
		
		HSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 200);
		VSB = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 200);
		HSB.addAdjustmentListener(this);
		VSB.addAdjustmentListener(this);
		
		p.add(btn);
		f.add(p, BorderLayout.CENTER);
		f.add(HSB, BorderLayout.SOUTH);
		f.add(VSB, BorderLayout.EAST);
		
		f.setSize(250, 250);
		f.setVisible(true);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		Scrollbar sb = (Scrollbar)e.getSource();
		
		if (sb.getOrientation() == Scrollbar.HORIZONTAL)
			x = sb.getValue();
		else
			y = sb.getValue();

		btn.setLocation(x, y);
	}
	
}