import java.awt.*;
import java.awt.event.*;

public class TextFieldExample implements TextListener, ActionListener
{
	Frame f;
	Label lb;
	TextField tf;
	
	public static void main(String argv[])
	{
		new TextFieldExample();
	}
	
	public TextFieldExample()
	{
		f = new Frame ("TextField Example");
		f.setLayout(new GridLayout(2,1));
		
		tf = new TextField("", 20);
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		lb = new Label();
		
		f.add(tf);
		f.add(lb);
		f.pack();
		f.setVisible(true);
	}
	
	public void textValueChanged(TextEvent e)
	{
		lb.setText(tf.getText());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("");
	}
}