import java.awt.*;
import javax.swing.*;

public class TestJPasswordField extends JFrame{
	TestJPasswordField(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JTextField jtf = new JTextField("",20);
		JPasswordField field = new JPasswordField("ALOHA");

		panel.add(jtf,BorderLayout.NORTH);
		panel.add(field,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestJPasswordField td = new TestJPasswordField("ALOHA");
		td.setVisible(true);
	}
}