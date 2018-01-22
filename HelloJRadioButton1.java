<<<<<<< HEAD
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class HelloJRadioButton1 extends JFrame implements ActionListener{
	private JLabel lb;
	private JRadioButton jrbtn1;
	private JRadioButton jrbtn2;
	private JRadioButton jrbtn3;

	public void actionPerformed(ActionEvent e){
		//System.out.println("CLICK");
		//ラジオボタンが選択されているか、調べる
		//ラジオボタンがひとつしかえらばれない
		Boolean kekka1 = this.jrbtn1.isSelected();
		Boolean kekka2 = this.jrbtn2.isSelected();
		Boolean kekka3 = this.jrbtn3.isSelected();

		String msg = "";
		
		if(kekka1){
			//msg = this.jrbtn1.getText()+"ボタンが選択されています。";
			this.lb.setText("Aボタンが選択されています。");
		}
		if(kekka2){
			//getText()は、49～51行でボタンに設定している名前を取得
			msg = this.jrbtn2.getText()+"ボタンが選択されています。";
			this.lb.setText(msg);
		}
		if(kekka3){
			msg = this.jrbtn3.getText()+"ボタンが選択されています。";
			this.lb.setText(msg);
		}
	}

	HelloJRadioButton1(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.jrbtn1 = new JRadioButton("A");
		this.jrbtn2 = new JRadioButton("B");
		this.jrbtn3 = new JRadioButton("C");

		ButtonGroup rBtnGroup = new ButtonGroup();
		rBtnGroup.add(this.jrbtn1);
		rBtnGroup.add(this.jrbtn2);
		rBtnGroup.add(this.jrbtn3);

		JButton btn = new JButton("click me");
		btn.addActionListener(this);

		this.lb = new JLabel("here is a label");

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5,1));
		jp.add(btn);
		jp.add(this.jrbtn1);
		jp.add(this.jrbtn2);
		jp.add(this.jrbtn3);
		jp.add(this.lb);

		Container cp = getContentPane();
		cp.add(jp,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJRadioButton1 hjb = new HelloJRadioButton1("window");
		hjb.setVisible(true);
	}
}
=======
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class HelloJRadioButton1 extends JFrame implements ActionListener{
	private JLabel lb;
	private JRadioButton jrbtn1;
	private JRadioButton jrbtn2;
	private JRadioButton jrbtn3;

	public void actionPerformed(ActionEvent e){
		//System.out.println("CLICK");
		//ラジオボタンが選択されているか、調べる
		//ラジオボタンがひとつしかえらばれない
		Boolean kekka1 = this.jrbtn1.isSelected();
		Boolean kekka2 = this.jrbtn2.isSelected();
		Boolean kekka3 = this.jrbtn3.isSelected();

		String msg = "";
		
		if(kekka1){
			//msg = this.jrbtn1.getText()+"ボタンが選択されています。";
			this.lb.setText("Aボタンが選択されています。");
		}
		if(kekka2){
			//getText()は、49～51行でボタンに設定している名前を取得
			msg = this.jrbtn2.getText()+"ボタンが選択されています。";
			this.lb.setText(msg);
		}
		if(kekka3){
			msg = this.jrbtn3.getText()+"ボタンが選択されています。";
			this.lb.setText(msg);
		}
	}

	HelloJRadioButton1(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.jrbtn1 = new JRadioButton("A");
		this.jrbtn2 = new JRadioButton("B");
		this.jrbtn3 = new JRadioButton("C");

		ButtonGroup rBtnGroup = new ButtonGroup();
		rBtnGroup.add(this.jrbtn1);
		rBtnGroup.add(this.jrbtn2);
		rBtnGroup.add(this.jrbtn3);

		JButton btn = new JButton("click me");
		btn.addActionListener(this);

		this.lb = new JLabel("here is a label");

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5,1));
		jp.add(btn);
		jp.add(this.jrbtn1);
		jp.add(this.jrbtn2);
		jp.add(this.jrbtn3);
		jp.add(this.lb);

		Container cp = getContentPane();
		cp.add(jp,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJRadioButton1 hjb = new HelloJRadioButton1("window");
		hjb.setVisible(true);
	}
}
>>>>>>> 328ff421f40732aac58cb0718516c986348ed654
