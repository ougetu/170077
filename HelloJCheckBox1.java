import javax.swing.JFrame;
//import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJCheckBox1 extends JFrame implements ActionListener{
	JLabel label;
	JCheckBox jb1;
	JCheckBox jb2;
	JCheckBox jb3;
	
	public void actionPerformed(ActionEvent e){
		//System.out.println("CLICK!");
		if(this.jb1.isSelected()){
			this.label.setText("ボタン　1　が選択されています。");
		}

		if(this.jb2.isSelected()){
			this.label.setText("ボタン　2　が選択されています。");
		}
		if(this.jb3.isSelected()){
			this.label.setText("ボタン　3　が選択されています。");
		}
	}

	HelloJCheckBox1(String title){
		setTitle(title);
		setSize(600,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pl = new JPanel();
		pl.setLayout(new GridLayout(3,3));
		//行と列

		this.label = new JLabel("ALOHA");

		this.jb1 = new JCheckBox("A");
		this.jb2 = new JCheckBox("B");
		this.jb3 = new JCheckBox("C");

		JButton btn = new JButton("CHECK");
		btn.addActionListener(this);

		pl.add(btn);
		pl.add(this.label);
		pl.add(this.jb1);
		pl.add(this.jb2);
		pl.add(this.jb3);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJCheckBox1 hb = new HelloJCheckBox1("window");
		hb.setVisible(true);
	}
}

//AとB両方ともチェックされたとき、全部表示しない
