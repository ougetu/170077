<<<<<<< HEAD
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class HelloJCheckBox extends JFrame{
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(600,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pl = new JPanel();
		pl.setLayout(new GridLayout(1,3));
		//行と列

		JCheckBox jb1 = new JCheckBox("A");
		JCheckBox jb2 = new JCheckBox("B");
		JCheckBox jb3 = new JCheckBox("C");

		pl.add(jb1);
		pl.add(jb2);
		pl.add(jb3);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJCheckBox hb = new HelloJCheckBox("window");
		hb.setVisible(true);
	}
}
=======
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class HelloJCheckBox extends JFrame{
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(600,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pl = new JPanel();
		pl.setLayout(new GridLayout(1,3));
		//行と列

		JCheckBox jb1 = new JCheckBox("A");
		JCheckBox jb2 = new JCheckBox("B");
		JCheckBox jb3 = new JCheckBox("C");

		pl.add(jb1);
		pl.add(jb2);
		pl.add(jb3);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJCheckBox hb = new HelloJCheckBox("window");
		hb.setVisible(true);
	}
}
>>>>>>> 328ff421f40732aac58cb0718516c986348ed654
