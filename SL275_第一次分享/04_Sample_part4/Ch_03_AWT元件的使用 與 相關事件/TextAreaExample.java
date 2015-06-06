import java.awt.*;

public class TextAreaExample
{
	public static void main(String argv[])
	{
		Frame f = new Frame("TextArea Example");
		f.setLayout(new GridLayout(4,1));
		
		String str = "1234567890 234567890 34567890 4567890 567890";
		
		TextArea ta1 = new TextArea(str, 2, 10, TextArea.SCROLLBARS_NONE);
		TextArea ta2 = new TextArea(str, 2, 10, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		TextArea ta3 = new TextArea(str, 2, 10, TextArea.SCROLLBARS_VERTICAL_ONLY);
		TextArea ta4 = new TextArea(str, 2, 10, TextArea.SCROLLBARS_BOTH);
		
		f.add(ta1);
		f.add(ta2);
		f.add(ta3);
		f.add(ta4);
		f.pack();
		f.setVisible(true);
	}
}