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
		//取得圖片檔
		ig = getImage(getDocumentBase(),"漂亮嗎.jpg");
	}

	public void paint(Graphics g) {
		//顯示圖片檔
		g.drawImage(ig,35,10,this);
	}
}
