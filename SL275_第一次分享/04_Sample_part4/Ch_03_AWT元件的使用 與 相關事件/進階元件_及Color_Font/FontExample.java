import java.awt.*;
import java.awt.event.*;

public class FontExample extends Frame implements ItemListener
{
	Choice chFont, chStyle, chSize;
	Label l;
	String fontName[] = {"dialog", "dialoginput", "serif", "sansserif",
						 "monospaced"};
	int fontStyle[] = {Font.PLAIN, Font.BOLD, Font.ITALIC, 
					   Font.BOLD|Font.ITALIC};
	
	public static void main(String argv[])
	{
		new FontExample();
	}
	
	public FontExample()
	{
		super("Font Example");

		chFont = new Choice();
		for (int i=0; i<fontName.length; i++)
			chFont.add(fontName[i]);
		
		chStyle = new Choice();
		chStyle.add("標準");
		chStyle.add("粗體");
		chStyle.add("斜體");
		chStyle.add("粗斜體");
		
		chSize = new Choice();
		for (int i=8; i<=72; i+=2)
			chSize.add(Integer.toString(i));
			
		chFont.addItemListener(this);
		chStyle.addItemListener(this);
		chSize.addItemListener(this);
		
		Panel p = new Panel(new GridLayout(1,3));
		p.add(chFont);
		p.add(chStyle);
		p.add(chSize);

		l = new Label("AWT Font Test");
		
		add(p, BorderLayout.NORTH);
		add(l, BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String name = chFont.getSelectedItem();
		int style = fontStyle[chStyle.getSelectedIndex()];
		int size = Integer.parseInt(chSize.getSelectedItem());
		Font f = new Font(name, style, size);

		l.setFont(f);
		pack();
	}
}