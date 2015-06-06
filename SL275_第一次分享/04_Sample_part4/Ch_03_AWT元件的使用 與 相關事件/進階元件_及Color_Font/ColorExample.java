import java.awt.*;
import java.awt.event.*;

public class ColorExample extends Frame implements AdjustmentListener
{
	Scrollbar red, green, blue;
	Checkbox fore, back;
	CheckboxGroup cg;
	Label l;
	
	public static void main(String argv[])
	{
		new ColorExample();
	}
	
	public ColorExample()
	{
		super("Color Example");
		
		red = new Scrollbar(Scrollbar.HORIZONTAL, 0 ,10, 0, 255);
		green = new Scrollbar(Scrollbar.HORIZONTAL, 0 ,10, 0, 255);
		blue = new Scrollbar(Scrollbar.HORIZONTAL, 0 ,10, 0, 255);
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		Panel p1 = new Panel(new GridLayout(3, 2));
		p1.add(new Label("紅色值："));
		p1.add(red);
		p1.add(new Label("綠色值："));
		p1.add(green);
		p1.add(new Label("藍色值："));
		p1.add(blue);
		
		cg = new CheckboxGroup();
		fore = new Checkbox("前景顏色", cg, true);
		back = new Checkbox("背景顏色", cg, false);
		
		Panel p2 = new Panel();
		p2.add(fore);
		p2.add(back);
		
		l = new Label("Color Test");
		l.setFont(new Font("dialog", Font.BOLD, 24));
		
		add(p1, BorderLayout.NORTH);
		add(l, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}

	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		
		int r = red.getValue();
		int g = green.getValue();
		int b = blue.getValue();

		if (fore.getState())
			l.setForeground(new Color(r, g, b));
		else
			l.setBackground(new Color(r, g, b));
	}
}