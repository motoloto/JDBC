/* <applet code="SampleParameter.class" width="310" height="100"> 
      <param name="htmlpram" value="test" >
   </applet>
*/

/*
   appletviewer SampleParameter.java
*/

import java.applet.*;
import java.awt.*;
public class SampleParameter extends Applet {
	public void paint(Graphics g) {
		g.drawString("HTML�ǤJ���Ѽ�",70,40);
		//���o�Ѽ�
		g.drawString(getParameter("htmlpram"),70,80);
	}
}
