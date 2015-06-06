
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;	// 以陣列實作串列的集合類別

public class PersisTest extends Frame
	implements MouseListener, ActionListener {
  ArrayList displayList;	// 用來儲存使用者所繪過的矩形資料
  String pathname;			// 儲存物件序列化(整個串列)資料的檔案
  Button clearBtn, saveBtn, restoreBtn, quitBtn;	// 四個按鈕

  // 建構元
  public PersisTest (String pathname) {
	this.pathname = pathname;
	displayList = new ArrayList();

	// 將Frame加入自己的事件聆聽者行列,以便處理本身的滑鼠單擊事件
	// Handle our own mouse clicks.
	addMouseListener (this);

	// 建立GUI。讓Frame成為所有按鈕action事件的聆聽者
	// Build the GUI. Make this object a listener for all actions.
	setLayout (new BorderLayout());		// 設定版面管理員為BorderLayout
	Panel pan = new Panel();			// 建立一個面板
	// 建立Clear按鈕
	clearBtn = new Button ("Clear");	// 產生一個按鈕物件,標題為Clear
	clearBtn.addActionListener (this);	// 將Frame加入按鈕事件的聆聽者行列
	pan.add (clearBtn);					// 將按鈕加入面板中
	// 建立Save按鈕
	saveBtn = new Button ("Save");
	saveBtn.addActionListener (this);
	pan.add (saveBtn);
	// 建立Restore按鈕
	restoreBtn = new Button ("Restore");
	restoreBtn.addActionListener (this);
	pan.add (restoreBtn);
	// 建立Quit按鈕
	quitBtn = new Button ("Quit");
	quitBtn.addActionListener (this);
	pan.add (quitBtn);
	// 將面板(包含所有按鈕者)放在Frame的上方(北方)
	add (pan, BorderLayout.NORTH);

	setSize (350, 200);
  }      
  // 處理按鈕事件的方法
  public void actionPerformed (ActionEvent e) {
  	// 判斷事件來源是來自那個按鈕,才知道該做什麼動作
	if (e.getSource() == clearBtn) {
	  // 將串列內容清空,並重繪畫面
	  // Repaint with an empty display list.
	  displayList = new ArrayList();
	  repaint();
	} else if (e.getSource() == saveBtn) {
	  // 將串列內容序列化後存入所指名的檔案中
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
	  // 由指名的檔案中讀入串列內容的序列化資料,並進行反序列化動作重建原串列內容
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
	// 關閉視窗,結束程式執行!!
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
  	// 當使用者按下滑鼠時,將滑鼠的座標存入串列中(矩形第一點)
	// Store x and y in display list array list.
	Point p = new Point (e.getX(), e.getY());
	displayList.add (p);
  }      
  public void mouseReleased (MouseEvent e) {
  	// 當使用放開滑鼠時,也將滑鼠的座標存入串列中(矩形第二點),並且重繪畫面
	// Store x and y in display list array list, and request repaint.
	Point p = new Point (e.getX(), e.getY());
	displayList.add (p);
	repaint();
  }      
  // 當畫面需要重繪時,會自行呼叫此方法
  public void paint (Graphics g) {
  	// 將Frame內容清除,並將底色繪成白色
	// Clear to white.
	g.setColor (Color.white);
	g.fillRect (0, 0, getSize().width, getSize().height);

	// 遊歷整個串列,把使用者所繪的矩形,全部重繪
	// Traverse display list, drawing 1 rect for each 2 points
	// in the array list.
	g.setColor (Color.black);	// 將畫筆顏色設為黑色
	int i = 0;
	while (i < displayList.size()) {
	  // 每個矩形需要兩點來表示,由串列中一次取兩筆Point資料
	  Point p0 = (Point)(displayList.get (i++));
	  Point p1 = (Point)(displayList.get (i++));
	  // 決定矩形的左上角座標、寬和高
	  int x = Math.min (p0.x, p1.x);
	  int y = Math.min (p0.y, p1.y);
	  int w = Math.abs (p0.x - p1.x);
	  int h = Math.abs (p0.y - p1.y);
	  g.drawRect (x, y, w, h);	// 繪出矩形
	}
  }      
}
