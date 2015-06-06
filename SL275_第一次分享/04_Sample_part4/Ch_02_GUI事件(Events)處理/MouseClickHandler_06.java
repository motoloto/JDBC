import java.awt.event.*;

public class MouseClickHandler_06 extends MouseAdapter {

	Test06_Adapter t06;
  
  public MouseClickHandler_06(Test06_Adapter t06) {
  	 this.t06 = t06;
  }

	public void mouseClicked (MouseEvent e) {
		String s =  "Mouse Clicked:  X = " + e.getX()
                + " Y = " + e.getY();
		t06.tf.setText(s);
	}
}