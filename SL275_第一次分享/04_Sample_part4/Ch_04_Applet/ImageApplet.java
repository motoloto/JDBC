/* <applet code="ImageApplet.class" width="500" height="600">
   </applet>
*/

/*
   appletviewer ImageApplet.java
*/
import java.awt.*;
import java.applet.*;
public class ImageApplet extends Applet {

	Image ig;

	public void init() {
		//���o�Ϥ���
		ig = getImage(getDocumentBase(),"�}�G��.jpg");
	}

	public void paint(Graphics g) {
		//��ܹϤ���
		g.drawImage(ig,35,10,this);
	}
}
