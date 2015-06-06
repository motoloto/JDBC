import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Frame;

public class ImageFrame extends Frame  {
	static Image img;
	static ImageFrame MyFrame;

	public static void main(String args[]) {
		MyFrame=new ImageFrame();				          //建立新的Frame
		MyFrame.setTitle("Application 秀圖");			//設定Frame標題
		MyFrame.setSize(389,503);				          //設定Frame大小
		MyFrame.setVisible(true);						      //秀出Frame
	}


	public ImageFrame()	{
		Toolkit toolkit= Toolkit.getDefaultToolkit();		//建立Toolkit物件
		img=toolkit.getImage("漂亮嗎.jpg");			        //取得影像路徑
		addWindowListener(new WindowAdapter() {         //視窗關閉事件
			public void windowClosing(WindowEvent e){
				dispose();				    //關閉Frame
				System.exit(0);				//離開程式
			}
		});
	}

	public void paint(Graphics g) {
		g.drawImage(img,0,0,this);				              //畫出影像
	 }

  }