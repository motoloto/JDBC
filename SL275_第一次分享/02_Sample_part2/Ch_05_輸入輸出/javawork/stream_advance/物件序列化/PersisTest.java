
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;	// �H�}�C��@��C�����X���O

public class PersisTest extends Frame
	implements MouseListener, ActionListener {
  ArrayList displayList;	// �Ψ��x�s�ϥΪ̩�ø�L���x�θ��
  String pathname;			// �x�s����ǦC��(��Ӧ�C)��ƪ��ɮ�
  Button clearBtn, saveBtn, restoreBtn, quitBtn;	// �|�ӫ��s

  // �غc��
  public PersisTest (String pathname) {
	this.pathname = pathname;
	displayList = new ArrayList();

	// �NFrame�[�J�ۤv���ƥ��ť�̦�C,�H�K�B�z�������ƹ������ƥ�
	// Handle our own mouse clicks.
	addMouseListener (this);

	// �إ�GUI�C��Frame�����Ҧ����saction�ƥ󪺲�ť��
	// Build the GUI. Make this object a listener for all actions.
	setLayout (new BorderLayout());		// �]�w�����޲z����BorderLayout
	Panel pan = new Panel();			// �إߤ@�ӭ��O
	// �إ�Clear���s
	clearBtn = new Button ("Clear");	// ���ͤ@�ӫ��s����,���D��Clear
	clearBtn.addActionListener (this);	// �NFrame�[�J���s�ƥ󪺲�ť�̦�C
	pan.add (clearBtn);					// �N���s�[�J���O��
	// �إ�Save���s
	saveBtn = new Button ("Save");
	saveBtn.addActionListener (this);
	pan.add (saveBtn);
	// �إ�Restore���s
	restoreBtn = new Button ("Restore");
	restoreBtn.addActionListener (this);
	pan.add (restoreBtn);
	// �إ�Quit���s
	quitBtn = new Button ("Quit");
	quitBtn.addActionListener (this);
	pan.add (quitBtn);
	// �N���O(�]�t�Ҧ����s��)��bFrame���W��(�_��)
	add (pan, BorderLayout.NORTH);

	setSize (350, 200);
  }      
  // �B�z���s�ƥ󪺤�k
  public void actionPerformed (ActionEvent e) {
  	// �P�_�ƥ�ӷ��O�Ӧۨ��ӫ��s,�~���D�Ӱ�����ʧ@
	if (e.getSource() == clearBtn) {
	  // �N��C���e�M��,�í�ø�e��
	  // Repaint with an empty display list.
	  displayList = new ArrayList();
	  repaint();
	} else if (e.getSource() == saveBtn) {
	  // �N��C���e�ǦC�ƫ�s�J�ҫ��W���ɮפ�
	  // Write display list array list to an object output stream.
	  try {
		FileOutputStream fos = new FileOutputStream (pathname);
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject (displayList);
		oos.flush();
		oos.close();
		fos.close();
	  } catch (IOException ex) {
		System.err.println ("Trouble writing display list array list");
	  }
	} else if (e.getSource() == restoreBtn) {
	  // �ѫ��W���ɮפ�Ū�J��C���e���ǦC�Ƹ��,�öi��ϧǦC�ưʧ@���ح��C���e
	  // Read a new display list array list from an object input stream.
	  try {
		FileInputStream fis = new FileInputStream (pathname);
		ObjectInputStream ois = new ObjectInputStream (fis);
		displayList = (ArrayList)(ois.readObject());
		ois.close();
		fis.close();
		repaint();
	  } catch (ClassNotFoundException ex) {
		System.err.println ("Trouble reading display list array list");
	  } catch (IOException ex) {
		System.err.println ("Trouble reading display list array list");
	  }
	// ��������,�����{������!!
	} else if (e.getSource() == quitBtn) {
	  setVisible (false);
	  dispose();
	  System.exit (0);
	}
  }      
  public static void main (String args[])    {

	PersisTest that = new PersisTest ("Test.ser");
	that.show();
  }      
  // Unused methods of MouseListener interface.
  public void mouseClicked (MouseEvent e) { }      
  public void mouseEntered (MouseEvent e) { }      
  public void mouseExited  (MouseEvent e) { }      
  public void mousePressed (MouseEvent e) {
  	// ��ϥΪ̫��U�ƹ���,�N�ƹ����y�Цs�J��C��(�x�βĤ@�I)
	// Store x and y in display list array list.
	Point p = new Point (e.getX(), e.getY());
	displayList.add (p);
  }      
  public void mouseReleased (MouseEvent e) {
  	// ��ϥΩ�}�ƹ���,�]�N�ƹ����y�Цs�J��C��(�x�βĤG�I),�åB��ø�e��
	// Store x and y in display list array list, and request repaint.
	Point p = new Point (e.getX(), e.getY());
	displayList.add (p);
	repaint();
  }      
  // ��e���ݭn��ø��,�|�ۦ�I�s����k
  public void paint (Graphics g) {
  	// �NFrame���e�M��,�ñN����ø���զ�
	// Clear to white.
	g.setColor (Color.white);
	g.fillRect (0, 0, getSize().width, getSize().height);

	// �C����Ӧ�C,��ϥΪ̩�ø���x��,������ø
	// Traverse display list, drawing 1 rect for each 2 points
	// in the array list.
	g.setColor (Color.black);	// �N�e���C��]���¦�
	int i = 0;
	while (i < displayList.size()) {
	  // �C�ӯx�λݭn���I�Ӫ��,�Ѧ�C���@�����ⵧPoint���
	  Point p0 = (Point)(displayList.get (i++));
	  Point p1 = (Point)(displayList.get (i++));
	  // �M�w�x�Ϊ����W���y�СB�e�M��
	  int x = Math.min (p0.x, p1.x);
	  int y = Math.min (p0.y, p1.y);
	  int w = Math.abs (p0.x - p1.x);
	  int h = Math.abs (p0.y - p1.y);
	  g.drawRect (x, y, w, h);	// ø�X�x��
	}
  }      
}
