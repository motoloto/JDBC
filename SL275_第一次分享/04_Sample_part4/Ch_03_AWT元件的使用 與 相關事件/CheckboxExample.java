import java.awt.*;
import java.awt.event.*;

public class CheckboxExample implements ItemListener
{
	Frame f;
	Checkbox cb[] = new Checkbox[3];

	public static void main(String argv[])
	{
		new CheckboxExample();
	}

	public CheckboxExample()
	{
		f = new Frame("Checkbox Example");
		f.setLayout(new GridLayout(3,1));

		cb[0] = new Checkbox("Item 1");
		cb[1] = new Checkbox("Item 2", true);
		cb[2] = new Checkbox();
		cb[2].setLabel("Item 3");

		for (int i=0; i<3; i++)
		{
			cb[i].addItemListener(this);
			f.add(cb[i]);
		}

		f.pack();
		f.setVisible(true);
	}

	public void itemStateChanged(ItemEvent e)
	{
		Checkbox ch = (Checkbox)e.getSource();
		String label = ch.getLabel();

		if (e.getStateChange() == ItemEvent.SELECTED)
			System.out.println(label+" selected");
		else
                        System.out.println(label+" deselected");
	}
}
