/*
  java ListExample 3 true Chinese English Spanish Japan
  一次顯示三個選項, 並可多選
*/

import java.awt.*;
import java.awt.event.*;

public class ListExample implements ItemListener, ActionListener
{
	Frame f;
	List ls;

	public static void main(String argv[])
	{
		new ListExample(argv);
	}

	public ListExample(String argv[])
	{
		f = new Frame("List Example");

		ls = new List(Integer.parseInt(argv[0]), 
			      Boolean.valueOf(argv[1]).booleanValue());
		ls.addItemListener(this);
		ls.addActionListener(this);

		for (int i=2; i<argv.length; i++)
			ls.add(argv[i]);

		f.add(ls, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);

		System.out.println("Total "+ls.getItemCount()+" items.");
	}

	public void itemStateChanged(ItemEvent e)
	{
		List l = (List)e.getSource();
		int index[] = l.getSelectedIndexes();
		String str[] = l.getSelectedItems();

		for (int i=0; i<index.length; i++)
			System.out.println(index[i]+" "+str[i]);
	}

	public void actionPerformed(ActionEvent e)
	{
                List l = (List)e.getSource();
		String str = l.getSelectedItem();

		System.out.println("Item "+str+" has been double-click");
	}
}
