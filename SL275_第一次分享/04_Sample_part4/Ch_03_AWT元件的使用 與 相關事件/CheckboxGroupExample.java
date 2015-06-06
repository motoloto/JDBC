import java.awt.*;

public class CheckboxGroupExample
{
	Frame f;
	Checkbox cb[] = new Checkbox[4];
	CheckboxGroup cbg1, cbg2;

	public static void main(String argv[])
	{
		new CheckboxGroupExample();
	}

	public CheckboxGroupExample()
	{
		f = new Frame("CheckboxGroup Example");
		f.setLayout(new GridLayout(4,1));

		cbg1 = new CheckboxGroup();
		cbg2 = new CheckboxGroup();

		cb[0] = new Checkbox("Item 1");
		cb[1] = new Checkbox("Item 2");
		cb[0].setCheckboxGroup(cbg1);
    cb[1].setCheckboxGroup(cbg1);

		cb[2] = new Checkbox("Item 3", cbg2, true);
    cb[3] = new Checkbox("Item 4", cbg2, false);

		for (int i=0; i<4; i++)
			f.add(cb[i]);

		f.pack();
		f.setVisible(true);
	}
}
