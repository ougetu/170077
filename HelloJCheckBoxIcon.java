import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
//import java.awt.event.ActionEvent;

public class HelloJCheckBoxIcon extends JFrame implements ActionListener{

	JLabel lb1;
	JLabel lb2;
	JLabel lb3;

	JCheckBox jb1;
	// = new JCheckBox("A",true);
	JCheckBox jb2;
	// = new JCheckBox("B",true);
	JCheckBox jb3;
	// = new JCheckBox("C",true);

	public void actionPerformed(ActionEvent e){
		boolean b1 = jb1.isSelected();
		boolean b2 = jb2.isSelected();
		boolean b3 = jb3.isSelected();

		if(jb1.isSelected()){

			this.lb1.setText("名前チェックされています");
		}

		if(jb2.isSelected()){
			this.lb2.setText("電話がチェックされています");
		}

		if(jb3.isSelected()){
			this.lb3.setText("住所がチェックされています");
		}
	}

	HelloJCheckBoxIcon(String title){
		this.lb1 = new JLabel("名前");
		this.lb2 = new JLabel("電話");
		this.lb3 = new JLabel("住所");

		setTitle(title);
		setSize(600,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pl = new JPanel();
		pl.setLayout(new GridLayout(3,3));
		//行と列
	
		pl.add(lb1);
		pl.add(lb2);
		pl.add(lb3);
	
		pl.add(jb1);
		pl.add(jb2);
		pl.add(jb3);

		JButton btn = new JButton("CHECK");

		btn.addActionListener(this);

		pl.add(btn);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJCheckBoxIcon hb = new HelloJCheckBoxIcon("window");
		hb.setVisible(true);
	}
}
