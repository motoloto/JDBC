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
		g.drawString("HTML肚把计",70,40);
		//眔把计
		g.drawString(getParameter("htmlpram"),70,80);
	}
}
