import java.awt.event.*;

public class MouseClickHandler extends MouseAdapter {

	// ��ť�����O�u�ݭn�����~��Adapter���O, 
	// ���мg�u�|�Ψ쪺������k(method)�Y�i

	public void mouseClicked (MouseEvent e) {
		String s =  "Mouse Clicked:  X = " + e.getX()
                + " Y = " + e.getY();
		System.out.println(s);
	}
}
