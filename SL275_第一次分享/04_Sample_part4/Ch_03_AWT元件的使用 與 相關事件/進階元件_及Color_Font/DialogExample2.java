import java.awt.*;
import java.awt.event.*;
public class DialogExample2 extends Frame implements
	ActionListener {

	TextField tf = new TextField(30);

	public static void main(String args[]) {
		DialogExample2 app = new DialogExample2();
	}

	DialogExample2() {
		Button bt = new Button("開啟對話方塊");
		setSize(250,250);
		setLayout(new FlowLayout());
		add(bt);
		add(tf);
		bt.addActionListener(this);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		dlog dlg = new dlog(this,"DialogExample2",true);
		tf.setText(dlg.inputstr);
	}
}

class dlog extends Dialog implements
	ActionListener {

	Button bt1 = new Button("確定");
	Button bt2 = new Button("取消");
	TextField tf = new TextField(20);
	public String inputstr;

	dlog(Frame f,String title,boolean modal) {
		super(f,title,modal);
		setSize(200,100);
		setLayout(new FlowLayout());
		add(bt1);
		add(bt2);
		add(tf);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt1){
			inputstr = tf.getText();
		} else {
			inputstr = "";
		}
		setVisible(false);
	}
}
