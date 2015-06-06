import java.awt.*;
import java.awt.event.*;

public class DialogExample extends WindowAdapter implements ActionListener
{
	Frame f;
	Dialog d;
	Checkbox ch;
	Button b;
	
	public static void main(String argv[])
	{
		new DialogExample();
	}
	
	public DialogExample()
	{
		f = new Frame("Dialog Example");
		
		ch = new Checkbox("Modal");

		b = new Button("Show Dialog");
		b.addActionListener(this);
		
		f.add(ch, BorderLayout.NORTH);
		f.add(b, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		d = new Dialog(f, "I'm a Dialog", ch.getState());
		d.addWindowListener(this);
		d.setSize(100,100);
		b.setEnabled(false);
		d.show();
	}

	public void windowClosing(WindowEvent e)
	{
		d.dispose();
		b.setEnabled(true);
	}
}