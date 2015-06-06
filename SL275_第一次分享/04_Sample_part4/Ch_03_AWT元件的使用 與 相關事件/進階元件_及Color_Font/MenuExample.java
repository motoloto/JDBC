import java.awt.*;
import java.awt.event.*;

public class MenuExample extends MouseAdapter implements ActionListener, ItemListener
{
	Frame f;
	Label l;
	PopupMenu pm;
	
	public static void main(String argv[])
	{
		new MenuExample();
	}
	
	public MenuExample()
	{
		f = new Frame("Menu Example");
		f.addMouseListener(this);
		
		MenuItem item1_1 = new MenuItem("Item1_1");
		MenuItem item1_2 = new MenuItem("Item1_2");
		MenuItem item1_3 = new MenuItem("Item1_3");
		item1_1.addActionListener(this);
		item1_2.addActionListener(this);
		item1_3.addActionListener(this);
		
		Menu item1 = new Menu("Item1", false);
		item1.add(item1_1);
		item1.add(item1_2);
		item1.add(item1_3);

		MenuShortcut ms = new MenuShortcut(KeyEvent.VK_A, false);
		MenuItem item2 = new MenuItem("Item2", ms);
		item2.addActionListener(this);
		
		CheckboxMenuItem item3 = new CheckboxMenuItem("Item3");
		item3.addItemListener(this);

		Menu menu1 = new Menu("Menu1");
		menu1.add(item1);
		menu1.add(item2);
		menu1.addSeparator();
		menu1.add(item3);
		
		Menu help = new Menu("Help");
		MenuItem help1 = new MenuItem("Index");
		MenuItem help2 = new MenuItem("About");
		help1.addActionListener(this);
		help2.addActionListener(this);
		help.add(help1);
		help.addSeparator();
		help.add(help2);
		
		MenuItem popup1 = new MenuItem("popup1");
		MenuItem popup2 = new MenuItem("popup2");
		popup1.addActionListener(this);
		popup2.addActionListener(this);
		
		pm = new PopupMenu();
		pm.add(popup1);
		pm.add(popup2);

		MenuBar mb = new MenuBar();
		mb.add(menu1);
		mb.setHelpMenu(help);
		f.setMenuBar(mb);
		
		l = new Label("No menu item selected!");
		f.add(pm);
		f.add(l, BorderLayout.NORTH);
		f.setSize(200,100);
		f.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		MenuItem mi = (MenuItem)e.getSource();
		l.setText(mi.getLabel()+" selected!");
	}
		
	public void itemStateChanged(ItemEvent e)
	{
		CheckboxMenuItem cmi = (CheckboxMenuItem)e.getSource();
		l.setText(cmi.getLabel()+" selected!");
	}
		
	public void mouseClicked(MouseEvent e)
	{
		pm.show(f, e.getX(), e.getY());
	}
}