import java.awt.event.*;

public class MouseClickHandler extends MouseAdapter {

	// 聆聽者類別只需要直接繼承Adapter類別, 
	// 並覆寫真會用到的部份方法(method)即可

	public void mouseClicked (MouseEvent e) {
		String s =  "Mouse Clicked:  X = " + e.getX()
                + " Y = " + e.getY();
		System.out.println(s);
	}
}
