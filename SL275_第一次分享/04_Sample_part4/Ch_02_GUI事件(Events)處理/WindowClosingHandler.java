import java.awt.event.*;
class WindowClosingHandler extends WindowAdapter{
	public void windowClosing(WindowEvent e)	{
		System.out.println("��������...");
		System.exit(0);
	}
}