import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Frame;

public class ImageFrame extends Frame  {
	static Image img;
	static ImageFrame MyFrame;

	public static void main(String args[]) {
		MyFrame=new ImageFrame();				          //�إ߷s��Frame
		MyFrame.setTitle("Application �q��");			//�]�wFrame���D
		MyFrame.setSize(389,503);				          //�]�wFrame�j�p
		MyFrame.setVisible(true);						      //�q�XFrame
	}


	public ImageFrame()	{
		Toolkit toolkit= Toolkit.getDefaultToolkit();		//�إ�Toolkit����
		img=toolkit.getImage("�}�G��.jpg");			        //���o�v�����|
		addWindowListener(new WindowAdapter() {         //���������ƥ�
			public void windowClosing(WindowEvent e){
				dispose();				    //����Frame
				System.exit(0);				//���}�{��
			}
		});
	}

	public void paint(Graphics g) {
		g.drawImage(img,0,0,this);				              //�e�X�v��
	 }

  }