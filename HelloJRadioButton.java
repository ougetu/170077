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

public class HelloJRadioButton extends JFrame{
	HelloJRadioButton(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("click me");
		JRadioButton jrbtn1 = new JRadioButton("A");
		JRadioButton jrbtn2 = new JRadioButton("B");
		JRadioButton jrbtn3 = new JRadioButton("C");
		JLabel lb = new JLabel("here is a label");

		JPanel jp = new JPanel();
		jp.add(btn);
		jp.add(jrbtn1);
		jp.add(jrbtn2);
		jp.add(jrbtn3);
		jp.add(lb);

		Container cp = getContentPane();
		cp.add(jp,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJRadioButton hjb = new HelloJRadioButton("window");
		hjb.setVisible(true);
	}
}
