import java.awt.*;
import java.awt.event.*;

public class ButtonExample implements ActionListener
{
	Frame f;
	Button b1, b2;

	public static void main(String argv[])
	{
		new ButtonExample();
	}

	public ButtonExample()
	{
		f = new Frame("Button Example");
		f.setLayout(new GridLayout(1,2));

		b1 = new Button("Left");
		b1.setActionCommand("b1");
		b1.addActionListener(this);

		b2 = new Button("Right");
		b2.setActionCommand("b2");
		b2.addActionListener(this);

		f.add(b1);
		f.add(b2);
		f.pack();
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();

		if ( cmd.equals("b1") )
			b2.setEnabled( !b2.isEnabled() );
		else
			b1.setEnabled( !b1.isEnabled() );
	}
}
