/*
  java ScrollPaneExample 5 0 1 2 3 4
*/

import java.awt.*;

public class ScrollPaneExample
{
	public static void main(String argv[])
	{
		Frame f = new Frame("ScrollPane Example");

		int n = Integer.parseInt(argv[0]);

		Panel p = new Panel(new FlowLayout());
    p.setBackground(Color.blue);
		
		Button btn[] = new Button[n];
		for (int i=0; i<n; i++)
		{
			btn[i] = new Button("Button"+i);
			p.add(btn[i]);
		}

		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);

		sp.add(p);
		f.add(sp);
		f.pack();
		f.setVisible(true);
	}
}