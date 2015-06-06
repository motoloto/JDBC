/*
  java ChoiceExample Chinese English Spanish
*/

import java.awt.*;
import java.awt.event.*;

public class ChoiceExample implements ItemListener
{
	Frame f;
	Choice ch;

	public static void main(String argv[])
	{
		new ChoiceExample(argv);
	}

	public ChoiceExample(String argv[])
	{
		f = new Frame("Choice Example");
		ch = new Choice();
		ch.addItemListener(this);

		for (int i=0; i<argv.length; i++)
			ch.add(argv[i]);

		f.add(ch, BorderLayout.NORTH);
		f.pack();
		f.setVisible(true);

		System.out.println("Total "+ch.getItemCount()+" items.");
	}

	public void itemStateChanged(ItemEvent e)
	{
		Choice c = (Choice)e.getSource();

		System.out.println("Selected item index: "+c.getSelectedIndex());
                System.out.println("Selected item: "+c.getSelectedItem());
	}
}
