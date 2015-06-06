/*
  java LabelExample Chinese English Spanish
*/

import java.awt.*;
import java.awt.event.*;

public class LabelExample implements ItemListener
{
	Frame f;
	Choice ch;
	Label result;

	public static void main(String argv[])
	{
		new LabelExample(argv);
	}

	public LabelExample(String argv[])
	{
		f = new Frame("Label Example");

		result = new Label("No item selected.");

		ch = new Choice();
		ch.addItemListener(this);

		for (int i=0; i<argv.length; i++)
			ch.add(argv[i]);

		f.add(ch, BorderLayout.NORTH);
		f.add(result, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);

		System.out.println("Total "+ch.getItemCount()+" items.");
	}

	public void itemStateChanged(ItemEvent e)
	{
		Choice c = (Choice)e.getSource();
		String str = c.getSelectedItem()+" selected!";

		result.setText(str);
	}
}
